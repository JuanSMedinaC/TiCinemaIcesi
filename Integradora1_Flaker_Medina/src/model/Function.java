package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Function implements Serializable{
	
	private static final long serialVersionUID = -1L;
	
	private String movieName;
	private LocalDate date;
	private int hour;
	private int minute;
	private boolean am;
	private int lengthInMinutes;
	private String[][] clients;
	
	
	private Room room;
	
	
	public Function(String movieName, LocalDate date, int hour, int minute, boolean am, int lengthInMinutes,boolean mediumRoom) {
		this.movieName = movieName;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.am = am;
		this.lengthInMinutes = lengthInMinutes;
		room = new Room(mediumRoom);
		clients = room.returnSeats();
	}
	public void selectSpot(int row, int column, String clientName) {
		
		room.selectSpot(row, column, clientName);
		clients = room.returnSeats();
		
	}
	
	public boolean isFull() {
		return room.isFull();
	}

	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public boolean isAm() {
		return am;
	}


	public void setAm(boolean am) {
		this.am = am;
	}


	public int getLengthInMinutes() {
		return lengthInMinutes;
	}


	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}
	
	
	
}