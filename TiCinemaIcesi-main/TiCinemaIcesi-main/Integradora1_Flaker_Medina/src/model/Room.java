package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Room {
	private String[][] seatsWithNames;
	private ArrayList<Function> availableFunctions;
	
	public Room(int rows, int columns) {
	
		seatsWithNames=new String[rows][columns];
		availableFunctions = new ArrayList<Function>();
	}
	
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int lengthInMins) {
		
		availableFunctions.add(new Function(movieName, functionDate, functionHour, functionMinute, am, lengthInMins));
		
	}
	public void selectSpot(int row, int column, String clientName) {
		
		if(seatsWithNames[row][column]=="") {
			seatsWithNames[row][column]=clientName;
		}
	}
	public ArrayList<Function> returnFunctions(){
		return availableFunctions;
	}
	
}
