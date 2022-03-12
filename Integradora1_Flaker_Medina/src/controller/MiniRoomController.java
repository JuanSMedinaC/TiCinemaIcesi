package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MiniRoomController {
	
	private Main main;
	@FXML
	private RadioButton a1,a2,a3,a4,a5,a6,a7;
	@FXML
	private RadioButton b1,b2,b3,b4,b5,b6,b7;
	@FXML
	private RadioButton c1,c2,c3,c4,c5,c6,c7;
	@FXML
	private RadioButton d1,d2,d3,d4,d5,d6,d7;
	@FXML
	TextField nameField;
	
	public void setMain(Main main) {
		this.main=main;
	}
	
	public void choseSpot(ActionEvent event) {
		
	
		
	}

}
