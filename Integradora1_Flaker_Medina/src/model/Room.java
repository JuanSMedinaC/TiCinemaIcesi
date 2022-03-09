package model;

import java.time.LocalDate;

public class Room {
	private String[][] seatsWithNames;
	private Function function;
	
	public Room(int rows, int columns) {
		seatsWithNames=new String[rows][columns];
	}
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int lengthInMins) {
		function=new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins);
	}
	
	
}
