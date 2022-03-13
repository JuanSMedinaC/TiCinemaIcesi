package application;
	
import controller.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import model.CinemaIcesi;
import model.Function;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private CinemaIcesi cineIcesi=new CinemaIcesi();
	private Stage currentStage = new Stage();
	private Image icon;
	@Override
	public void start(Stage currentStage) {
		icon = new Image("logo.png");
		showLogIn();
	}
	public void showLogIn() {
		VBox root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/logIn.fxml"));
			root = (VBox)loader.load();
			LogInController logInController = loader.getController();
			logInController.setMain(this);
			Scene scene = new Scene(root,300,500);
			currentStage.setScene(scene);
			currentStage.getIcons().add(icon);
			currentStage.setTitle("Cine Icesi");
			currentStage.show();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void showMainMenu() {
		BorderPane root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/mainMenu.fxml"));
			root = (BorderPane)loader.load();
			MainMenuController mainMenuController = loader.getController();
			mainMenuController.setMain(this);
			
			Scene scene = new Scene(root);
			currentStage.setScene(scene);
			currentStage.setHeight(458);
			currentStage.setWidth(656);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showMoviesCatalog() {
		BorderPane catalog;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/moviesCatalog.fxml"));
			catalog = (BorderPane)loader.load();
			MoviesCatalogController moviesCatalogController = loader.getController();
			moviesCatalogController.setMain(this);
			
			BorderPane root;
			Stage stage = currentStage;
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(catalog);
			stage.setWidth(750);
			stage.setHeight(532);
			stage.show();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showRegisterMovies() {
		BorderPane registerMovies;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/registerMovies.fxml"));
			registerMovies = (BorderPane)loader.load();
			RegisterMoviesController regMovCont= loader.getController();
			regMovCont.setMain(this);

			BorderPane root;
			Stage stage = currentStage;
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(registerMovies);
			stage.setWidth(800);
			stage.setHeight(600);
			stage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public boolean validatePassword(String password) throws IOException {
		return cineIcesi.validatePassword(password);
	}
	public void registerFunction(String movieName, LocalDate functionDate, int functionHour, int functionMinute, boolean am, int room, int lengthInMins) {
		cineIcesi.registerFunction(movieName, functionDate, functionHour, functionMinute, am, room, lengthInMins);
	}
	public void registerUser(int row, int column, String clientName, String clientId, int position) {
		cineIcesi.selectSpot(row, column, clientName, clientId, position);
	}
	public ArrayList<Function> returnFunctions(){
		return cineIcesi.returnFunctions();
	}
	public boolean isFull(int position) {
		return cineIcesi.isFull(position);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
