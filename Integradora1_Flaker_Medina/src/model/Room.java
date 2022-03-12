package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Room {
	private Client[][] seatsWithNames;
	private boolean mediumRoom;
	
	public Room(boolean mediumRoom) {
		this.mediumRoom=mediumRoom;
		if(mediumRoom) {
			seatsWithNames=new Client[6][7];
		}else {
			seatsWithNames=new Client[4][7];
		}
	}
	
	public void selectSpot(int row, int column, Client client) {
		
		if(seatsWithNames[row][column]==null) {
			seatsWithNames[row][column]=client;
		}
	}
	public boolean isFull() {
		int counter=0;
		for(int i=0; i<seatsWithNames.length;i++) {
			for(int j=0; j<seatsWithNames[0].length;j++) {
				if(seatsWithNames[i][j]==null){
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
