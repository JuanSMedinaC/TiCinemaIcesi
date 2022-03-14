package controller;

import java.io.IOException;

import application.Main;
import exception.WrongUserException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class LogInController {
	
	private Main main;
	
	@FXML
	Label label;
	@FXML
	PasswordField passwordField;
	
	@FXML
	public void enterButton() {
		try {
			if(main.validatePassword(passwordField.getText())) {
				showMainMenu();
			}else {
				label.setText("Contraseña erronea");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WrongUserException e) {
			e.printStackTrace();
		}
	}
	public void setMain(Main main) {
		this.main=main;
	}
	public void showMainMenu() {
		main.showMainMenu();
	}

	
	
}
