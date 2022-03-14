package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Room {
	
	
	private String[][] seatsWithNames;
	private boolean mediumRoom;
	
	public Room(boolean mediumRoom) {
		this.mediumRoom=mediumRoom;
		if(mediumRoom) {
			seatsWithNames=new String[6][7];
		}else {
			seatsWithNames=new String[4][7];
		}
	}
	public String[][] returnSeats() {
		return seatsWithNames;
	}
	
	public void selectSpot(int row, int column, String clientName) {
		
		if(seatsWithNames[row][column]==null) {
			seatsWithNames[row][column]=clientName;
		}
	}
	public boolean isFull() {
		int counter=0;
		for(int i=0; i<seatsWithNames.length;i++) {
			for(int j=0; j<seatsWithNames[0].length;j++) {
				if(seatsWithNames[i][j].equalsIgnoreCase("")){
					counter++;
				}
			}
		}
		if(counter==0) {
			return true;
		}else {
			return false;
		}
	}
}
