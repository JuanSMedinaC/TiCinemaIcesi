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
		
		if(a1.isSelected()) {
			main.selectSpot(0, 0, nameField.getText());
		}else if(a2.isSelected()) {
			main.selectSpot(0, 1, nameField.getText());
		}else if(a3.isSelected()) {
			main.selectSpot(0, 2, nameField.getText());
		}else if(a4.isSelected()) {
			main.selectSpot(0, 3, nameField.getText());
		}else if(a5.isSelected()) {
			main.selectSpot(0, 4, nameField.getText());
		}else if(a6.isSelected()) {
			main.selectSpot(0, 5, nameField.getText());
		}else if(a7.isSelected()) {
			main.selectSpot(0, 6, nameField.getText());
		}else if(b1.isSelected()) {
			main.selectSpot(1, 0, nameField.getText());
		}else if(b2.isSelected()) {
			main.selectSpot(1, 1, nameField.getText());
		}else if(b3.isSelected()) {
			main.selectSpot(1, 2, nameField.getText());
		}else if(b4.isSelected()) {
			main.selectSpot(1, 3, nameField.getText());
		}else if(b5.isSelected()) {
			main.selectSpot(1, 4, nameField.getText());
		}else if(b6.isSelected()) {
			main.selectSpot(1, 5, nameField.getText());
		}else if(b7.isSelected()) {
			main.selectSpot(1, 6, nameField.getText());
		}else if(c1.isSelected()) {
			main.selectSpot(2, 0, nameField.getText());
		}else if(c2.isSelected()) {
			main.selectSpot(2, 1, nameField.getText());
		}else if(c3.isSelected()) {
			main.selectSpot(2, 2, nameField.getText());
		}else if(c4.isSelected()) {
			main.selectSpot(2, 3, nameField.getText());
		}else if(c5.isSelected()) {
			main.selectSpot(2, 4, nameField.getText());
		}else if(c6.isSelected()) {
			main.selectSpot(2, 5, nameField.getText());
		}else if(c7.isSelected()) {
			main.selectSpot(2, 6, nameField.getText());
		}else if(d1.isSelected()) {
			main.selectSpot(3, 0, nameField.getText());
		}else if(d2.isSelected()) {
			main.selectSpot(3, 1, nameField.getText());
		}else if(d3.isSelected()) {
			main.selectSpot(3, 2, nameField.getText());
		}else if(d4.isSelected()) {
			main.selectSpot(3, 3, nameField.getText());
		}else if(d5.isSelected()) {
			main.selectSpot(3, 4, nameField.getText());
		}else if(d6.isSelected()) {
			main.selectSpot(3, 5, nameField.getText());
		}else if(d7.isSelected()) {
			main.selectSpot(3, 6, nameField.getText());
		}
		
	}

}
