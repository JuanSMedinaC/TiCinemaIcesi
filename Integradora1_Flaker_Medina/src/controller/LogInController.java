package controller;

import java.awt.Label;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class LogInController {
	
	private Main main;
	
	@FXML
	Label label;
	@FXML
	PasswordField passwordField;
	
	@FXML
	public void enterButton() {
		if(passwordField.getText().equals(null)) {
			
		}else {
			label.setText("Contraseña invalida");
		}
	}
	public void setMain(Main main) {
		this.main=main;
	}
	public void showMainMenu() {
		main.showMainMenu();
	}
	
	
}
