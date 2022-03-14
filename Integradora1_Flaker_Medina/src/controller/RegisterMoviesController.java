package controller;

import java.time.LocalDate;

import application.Main;
import exception.CrossedFunctionException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
public class RegisterMoviesController {

	private Main main;
	
	@FXML
	TextField nameField, timeField, lengthField;
	@FXML
	RadioButton amButton, pmButton, mediumRoomButton, miniRoomButton;
	@FXML
	DatePicker datePicker;
	@FXML
	Button submitButton;
	
	@FXML
	void submitFunction() {
		registerFunction();
	}
	
	public void registerFunction() {
		String name="";
		String time="";
		String[] separatedTime= new String[2];
		int hour=-1;
		int minute=-1;
		int length=-1;
		LocalDate functionDate;
		boolean am=false;
		//room will be considered as "1" for miniRoom and "2" for medium room
		int room=-1;
		
		name=nameField.getText();
		time=timeField.getText();
		separatedTime=time.split(":");
		hour=Integer.parseInt(separatedTime[0]);		
		minute=Integer.parseInt(separatedTime[1]);
		length=Integer.parseInt(lengthField.getText());
		functionDate=datePicker.getValue();
		if(amButton.isSelected()) {
			am=true;
		}
		else if(pmButton.isSelected()) {
			am=false;
		}
		else {
			//Tirar excepción
		}
		if(miniRoomButton.isSelected()) {
			room=1;
		}
		else if(mediumRoomButton.isSelected()) {
			room=2;
		}
		else {
			//Tirar excepción
		}
		try {
			main.registerFunction(name, functionDate, hour, minute, am, room, length);
			main.showMoviesCatalog();
		} catch (CrossedFunctionException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Function crossed with one already created");
			alert.setContentText("You may create the function in another schedule");
			alert.showAndWait();
		}
	}
	
	public void setMain(Main main) {
		this.main=main;
	}	
	
	
}
