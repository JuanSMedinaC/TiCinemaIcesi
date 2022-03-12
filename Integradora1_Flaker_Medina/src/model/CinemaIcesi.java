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
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int room, int lengthInMins) {
		boolean mediumRoom = true;
		if(room == 1) {
			mediumRoom=false;
		}else {
			mediumRoom=true;
		}
		functionsList.add(new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins, mediumRoom));

	}
	public void selectSpot(int row, int column, String clientName,String clientId, int position) {
		Client clientobj=new Client(clientName, clientId);
		functionsList.get(position).selectSpot(row, column, clientobj);
	}
	public boolean isFull(int position) {
		return functionsList.get(position).isFull();
	}
	public ArrayList<Function> returnFunctions(){
		return functionsList;
	}

}
