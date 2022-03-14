package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ReportAllController {

	@FXML
	Label reportLabel;
	
	private Main main;
	
	public void setMain(Main main) {
		this.main=main;
	}
	
	public void start() {
		reportLabel.setText(main.printAllFuncsAndPersons());
	}
	
}

