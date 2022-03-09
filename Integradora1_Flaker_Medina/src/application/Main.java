package application;
	
import controller.*;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
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
		VBox root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/mainMenu.fxml"));
			root = (VBox)loader.load();
			MainMenuController mainMenuController = loader.getController();
			mainMenuController.setMain(this);
			Scene scene = new Scene(root, 800,300);
			currentStage.setScene(scene);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showMoviesCatalog() {
		VBox root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/moviesCatalog.fxml"));
			root = (VBox)loader.load();
			MoviesCatalogController moviesCatalogController = loader.getController();
			moviesCatalogController.setMain(this);
			Scene scene = new Scene(root,800,500);
			currentStage.setScene(scene);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showRegisterMovies() {
		VBox root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/registerMovies.fxml"));
			root = (VBox)loader.load();
			
			Scene scene = new Scene(root,800,500);
			currentStage.setScene(scene);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
