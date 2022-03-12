package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
public class RegisterMoviesController {

	private Main main;
	
	@FXML
	TextField textField;
	@FXML
	ChoiceBox choiceBox;
	
	public void setMain(Main main) {
		this.main=main;
	}	
	
	
}
