package controller;

import java.time.LocalDate;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Function;

public class FunctionPickerController {
	
	private Main main;
	@FXML
	TableView<Function> functions;
	
	@FXML
	TableColumn<Function, String> movieName;
	
	@FXML
	TableColumn<Function,LocalDate> date;
	
	@FXML
	TableColumn<Function, Integer> hour;
	
	@FXML
	TableColumn<Function, Integer> minute;
	
	@FXML
	TableColumn<Function,String> ampm;
	
	@FXML
	TableColumn<Function, Integer> length;
	@FXML
	private TextField nameField;
	@FXML
	private TextField idField;
	
	public void setMain(Main main) {
		this.main=main;
	}
	
	@FXML
	public void selectedMovie() {
		Function functionObj= functions.getSelectionModel().getSelectedItem();
		if (main.isFull(functionObj)) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Function is full");
			alert.setContentText("Try with another function");
			alert.showAndWait();
		}
		else {
			String name="";
			String id="";
			name= nameField.getText();
			id = idField.getText();
			main.showRoom(name, id, functionObj);
		}
	}
	public void start() {
		movieName.setCellValueFactory(new PropertyValueFactory<Function, String>("movieName"));
		date.setCellValueFactory(new PropertyValueFactory<Function, LocalDate>("date"));
		hour.setCellValueFactory(new PropertyValueFactory<Function, Integer>("hour"));
		minute.setCellValueFactory(new PropertyValueFactory<Function, Integer>("minute"));
		ampm.setCellValueFactory(new PropertyValueFactory<Function, String>("ampmString"));
		length.setCellValueFactory(new PropertyValueFactory<Function, Integer>("lengthInMinutes"));
		
		ObservableList<Function> functionsList=FXCollections.observableArrayList(main.returnFunctions());
		functions.setItems(functionsList);
	}
	
}
