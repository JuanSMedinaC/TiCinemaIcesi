package controller;
import java.net.URL;

import java.time.LocalDate;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Function;

public class MoviesCatalogController {//ESTE SOLO MUESTRA LAS FUNCIONES...
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
	
	public void setItems() {
		movieName.setCellValueFactory(new PropertyValueFactory<Function, String>("movieName"));
		date.setCellValueFactory(new PropertyValueFactory<Function, LocalDate>("date"));
		hour.setCellValueFactory(new PropertyValueFactory<Function, Integer>("hour"));
		minute.setCellValueFactory(new PropertyValueFactory<Function, Integer>("minute"));
		ampm.setCellValueFactory(new PropertyValueFactory<Function, String>("ampmString"));
		length.setCellValueFactory(new PropertyValueFactory<Function, Integer>("lengthInMinutes"));
		
		ObservableList<Function> functionsList=FXCollections.observableArrayList(main.returnFunctions());
		functions.setItems(functionsList);
	}
	
	public void setMain(Main main) {
		this.main=main;
	}
}
