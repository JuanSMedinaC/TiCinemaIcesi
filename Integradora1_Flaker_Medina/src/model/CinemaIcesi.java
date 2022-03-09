package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class CinemaIcesi {
	Room miniRoom;
	Room mediumRoom;
	public CinemaIcesi() {
		miniRoom=new Room(7,4);
		mediumRoom=new Room(7,6);
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
		if(room==1) {
			miniRoom.registerFunction(movieName, functionDate, functionHour, functionMinute, am, lengthInMins);
		}
		else {
			mediumRoom.registerFunction(movieName, functionDate, functionHour, functionMinute, am, lengthInMins);
		}
	}

}
