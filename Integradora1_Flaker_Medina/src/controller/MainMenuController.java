package controller;
import application.Main;
public class MainMenuController {

	private Main main;
	
	public void setMain(Main main) {
		this.main=main;
	}
	public void showMoviesCatalog() {
		main.showMoviesCatalog();
	}
	public void showRegisterMovies() {
		main.showRegisterMovies();
	}
}
