package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

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
		Exception e=new Exception();
		for (int i=0; i<functionsList.size();i++) {
			if (functionobj.isCrossed(functionsList.get(i))) {
				crossed=true;
				System.out.println("Se manda");
				throw e;
			}
		}
		if (crossed==false) {
			functionsList.add(functionobj);
			System.out.println("Se crea");
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
