package controller;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Function;

public class MoviesCatalogController implements Initializable {//ESTE SOLO MUESTRA LAS FUNCIONES...
	private Main main;
	
	@FXML
	private TableView<Function> functions;
	
	@FXML
	private TableColumn<Function, String> movieName;
	
	@FXML
	private TableColumn<Function,LocalDate> date;
	
	@FXML
	private TableColumn<Function, Integer> hour;
	
	@FXML
	private TableColumn<Function, Integer> minute;
	
	@FXML
	private TableColumn<Function,String> ampm;
	
	@FXML
	private TableColumn<Function, Integer> length;
	
	ObservableList<Function> functionsList= FXCollections.observableArrayList();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		movieName.setCellValueFactory(new PropertyValueFactory<Function, String>("movieName"));
		date.setCellValueFactory(new PropertyValueFactory<Function, LocalDate>("date"));
		hour.setCellValueFactory(new PropertyValueFactory<Function, Integer>("hour"));
		minute.setCellValueFactory(new PropertyValueFactory<Function, Integer>("minute"));
		ampm.setCellValueFactory(new PropertyValueFactory<Function, String>("ampmString"));
		length.setCellValueFactory(new PropertyValueFactory<Function, Integer>("lengthInMinutes"));
		
	}
	
	public void setItems() {
		functionsList.addAll(main.returnFunctions());
		functions.setItems(functionsList);
	}
	
	public void setMain(Main main) {
		this.main=main;
	}
}
