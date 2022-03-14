package controller;
import application.Main;
import javafx.fxml.FXML;
public class MainMenuController {

	private Main main;
	
	public void setMain(Main main) {
		this.main=main;
	}
	@FXML
	public void showMoviesCatalog() {
		main.showMoviesCatalog();
	}
	@FXML
	public void showRegisterMovies() {
		main.showRegisterMovies();
	}
	@FXML
	public void showMainMenu() {
		main.showMainMenu();
	}
	@FXML
	public void showFunctionPicker() {
		main.showFunctionPicker();
	}
	@FXML
	public void showFullReport() {
		main.showFullReport();
	}
}
