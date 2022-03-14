package model;

import java.io.BufferedReader;
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
	
	public boolean validatePassword(String password) throws IOException {
		boolean result = false;
		FileReader fileReader = new FileReader("src\\passwords.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while(bufferedReader.ready()) {
			String line = bufferedReader.readLine();
			if(password.equals(line)) {
				result = true;
			}
			
		}
		bufferedReader.close();
		fileReader.close();
		return result;
	}
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int room, int lengthInMins) {
		boolean mediumRoom = true;
		if(room == 1) {
			mediumRoom=false;
		}else {
			mediumRoom=true;
		}
		functionsList.add(new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins, mediumRoom));
		functionsList=new ArrayList<Function>();
		try {
			FileOutputStream fileOut = new FileOutputStream("src\\Functions.csv");
			ObjectOutputStream out;
			out = new ObjectOutputStream(fileOut);
			out.writeObject(new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins, mediumRoom));
			out.close();
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectSpot(int row, int column, String clientName, int position) {
		functionsList.get(position).selectSpot(row, column, clientName);
	}
	public boolean isFull(int position) {
		return functionsList.get(position).isFull();
	}
	public ArrayList<Function> returnFunctions(){
		return functionsList;
	}

}
