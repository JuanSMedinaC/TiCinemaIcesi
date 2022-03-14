package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CinemaIcesi {
	ArrayList<Function> functionsList;
	public CinemaIcesi() {
		functionsList=new ArrayList<Function>();
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
		if (result==false) {
			//TODO Excepción
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Function crossed with one already created");
			alert.setContentText("You may create the function in another schedule");
			alert.showAndWait();
		}
		bufferedReader.close();
		fileReader.close();
		return result;
	}
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int room, int lengthInMins) throws Exception {
		boolean crossed=false;
		boolean mediumRoom = true;
		if(room == 1) {
			mediumRoom=false;
		}else {
			mediumRoom=true;
		}
		Function functionobj=new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins, mediumRoom);
		Exception e=new Exception(); //Cambiarlo por excep de verdad
		for (int i=0; i<functionsList.size();i++) {
			if (functionobj.isCrossed(functionsList.get(i))) {
				crossed=true;
				throw e;
			}
		}
		if (crossed==false) {
			functionsList.add(functionobj);
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

}
