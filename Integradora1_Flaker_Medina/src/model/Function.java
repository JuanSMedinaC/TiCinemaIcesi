package model;

import java.time.LocalDate;

public class Function{
	private String movieName;
	private LocalDate date;
	private int hour;
	private int minute;
	private boolean am;
	private String ampmString;
	private int lengthInMinutes;
	
	
	private Room room;
	
	
	public Function(String movieName, LocalDate date, int hour, int minute, boolean am, int lengthInMinutes,boolean mediumRoom) {
		this.movieName = movieName;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.am = am;
		this.lengthInMinutes = lengthInMinutes;
		room = new Room(mediumRoom);
		if (am==true) {
			ampmString="AM";
		}
		else {
			ampmString="PM";
		}
	}
	public void selectSpot(int row, int column, Client client) {
		room.selectSpot(row, column, client);
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
	
	public boolean isMediumRoom() {
		return room.isMedium();
	}
	
	public boolean isCrossed(Function function) {
		boolean crossed=true;
		int firstFunctionHour24hformat=0;
		int firstFunctionmin=this.minute;
		int firstFunctionEndHour24hformat=0;
		int firstFunctionEndMin24hformat=0;
		int secondFunctionHour24hformat=0;
		int secondFunctionMin=function.getMinute();
		if(isMediumRoom()==function.isMediumRoom()) {
			if (function.getDate()==getDate()) {
				if(am==true) {
					firstFunctionHour24hformat=hour+12;
				}
				else {
					firstFunctionHour24hformat=hour;
				}
				
				if(function.isAm()==true) {
					secondFunctionHour24hformat=function.getHour()+12;
				}
				else {
					secondFunctionHour24hformat=function.getHour();
				}
				//TODO Terminar el cmparador
			}
		}
		else {
			crossed=false;
		}
		return crossed;
		}


	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}
	
	public String getAmpmString() {
		return ampmString;
	}
	
	public void setAmpmString(String ampmString) {
		this.ampmString = ampmString;
	}
	
	public String calculateEndHour() {
		String endHourMinString="";
		int endHour=0;
		int endMin=0;
		
		return endHourMinString;
		
	}
	
	@Override
	public String toString() {
		String time="";
		if (am==true) {
			time="AM";
		}
		else {
			time="PM";
		}
		return movieName +" "+ date + " " + hour +":"+ minute + time;
	}
	
	
}