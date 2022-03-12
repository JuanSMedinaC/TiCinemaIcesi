package controller;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import model.Function;

public class FunctionPickerController {
	
	private Main main;
	@FXML
	private ComboBox<Function> availableMovies;
	
	
	public void setMain(Main main) {
		this.main=main;
	}
	
	@FXML
	public void select(ActionEvent event) {
		
		String title = availableMovies.getSelectionModel().getSelectedItem().toString();
	}
	public void start() {
		ObservableList<Function> list = FXCollections.observableArrayList(main.returnFunctions());
		availableMovies.setItems(list);
	}
}
