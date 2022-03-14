package model;

import java.io.BufferedReader;
import exception.*;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CinemaIcesi {
	ArrayList<Function> functionsList;
	FileReader fileReader;
	private Function function; 
	
	
	public CinemaIcesi() {
		
		functionsList=new ArrayList<Function>();
		try {
			FileInputStream fileIn = new FileInputStream("src\\Functions.csv");
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Function f;
			
			while(true) {
				
				f = (Function)in.readObject();
				functionsList.add(f);
				
			}
		}catch(EOFException e) {
		}catch(IOException e2) {
		}catch(ClassNotFoundException e3) {

		}
			
		 
		
			
		
	}
	
	public boolean validatePassword(String password) throws IOException, WrongUserException {
		boolean result = false;
		FileReader fileReader = new FileReader("src\\passwords.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while(bufferedReader.ready()) {
			String line = bufferedReader.readLine();
			if(password.equals(line)) {
				result = true;
			}
			
		}
		if (result==false) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Function crossed with one already created");
			alert.setContentText("You may create the function in another schedule");
			alert.showAndWait();
			throw new WrongUserException();
		}
		bufferedReader.close();
		fileReader.close();
		return result;
	}
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int room, int lengthInMins) throws CrossedFunctionException {
		boolean crossed=false;
		boolean mediumRoom = true;
		if(room == 1) {
			mediumRoom=false;
		}else {
			mediumRoom=true;
		}
		Function functionobj=new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins, mediumRoom);
		
		for (int i=0; i<functionsList.size();i++) {
			if (functionobj.isCrossed(functionsList.get(i))) {
				crossed=true;
				throw new CrossedFunctionException(functionsList.get(i).getMovieName());
			}
		}
		if (crossed==false) {
			functionsList.add(functionobj);
            		try {
			FileOutputStream fileOut = new FileOutputStream("src\\Functions.csv");
			ObjectOutputStream out;
			out = new ObjectOutputStream(fileOut);
			out.writeObject(functionobj);
			fileOut.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		}
		

	}
	public void selectSpot(int row, int column, String clientName,String clientId, Function function) {
		Client clientobj=new Client(clientName, clientId);
		function.selectSpot(row, column, clientobj);
	}
	public boolean isFull(Function function) {
		return function.isFull();
	}
	public ArrayList<Function> returnFunctions(){
		return functionsList;
	}
	public String printAllFuncsAndPersons() {
		String message="";
		for(int i=0;i<functionsList.size();i++) {
			Client[][] persons = functionsList.get(i).getSeats();
			message+="\n"+i+". "+functionsList.get(i).getMovieName()+" - "+functionsList.get(i).getDate()+" - "+functionsList.get(i).returnRoomType();
			for(int j=0;j<persons.length;j++) {
				for(int h=0;h<persons[j].length;h++) {
					if(persons[j][h]!=null) {
						message+="\n"+persons[j][h].getName();
					}
				}
			}
		}
		return message;
	}

}
