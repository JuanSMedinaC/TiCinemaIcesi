package controller;

import application.Main;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RegisterasdMoviesController{
	
	private Main main;
	
	@FXML
	ChoiceBox<String> roomChoice;
	@FXML
	DatePicker datePicker;
	@FXML
	TextField textField;
	
	String[] rooms = {"Big","Normal"};

	public void setMain(Main main) {
		this.main=main;
	}
}
