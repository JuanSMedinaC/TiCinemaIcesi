package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Client;
import model.Function;

public class MediumRoomController {
	private Main main;
	@FXML
	private Button a1,a2,a3,a4,a5,a6,a7;
	@FXML
	private Button b1,b2,b3,b4,b5,b6,b7;
	@FXML
	private Button c1,c2,c3,c4,c5,c6,c7;
	@FXML
	private Button d1,d2,d3,d4,d5,d6,d7;
	@FXML
	private Button e1,e2,e3,e4,e5,e6,e7;
	@FXML
	private Button f1,f2,f3,f4,f5,f6,f7;
	
	private String userName;
	private String userId;
	private Function functionToReg;
	
	@FXML
	void buttona1() {
		int row=0;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu(); 
	}
	@FXML
	void buttona2() {
		int row=0;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttona3() {
		int row=0;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	
	
	
	@FXML
	void buttona4() {
		int row=0;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttona5() {
		int row=0;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
		
	}
	@FXML
	void buttona6() {
		int row=0;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttona7() {
		int row=0;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb1() {
		int row=1;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb2() {
		int row=1;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb3() {
		int row=1;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb4() {
		int row=1;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb5() {
		int row=1;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb6() {
		int row=1;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonb7() {
		int row=1;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc1() {
		int row=2;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc2() {
		int row=2;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc3() {
		int row=2;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc4() {
		int row=2;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc5() {
		int row=2;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc6() {
		int row=2;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonc7() {
		int row=2;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond1() {
		int row=3;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond2() {
		int row=3;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond3() {
		int row=3;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond4() {
		int row=3;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond5() {
		int row=3;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond6() {
		int row=3;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttond7() {
		int row=3;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone1() {
		int row=4;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone2() {
		int row=4;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone3() {
		int row=4;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone4() {
		int row=4;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone5() {
		int row=4;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone6() {
		int row=4;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttone7() {
		int row=4;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf1() {
		int row=5;
		int column=0;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf2() {
		int row=5;
		int column=1;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf3() {
		int row=5;
		int column=2;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf4() {
		int row=5;
		int column=3;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf5() {
		int row=5;
		int column=4;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf6() {
		int row=5;
		int column=5;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
	}
	@FXML
	void buttonf7() {
		int row=5;
		int column=6;
		main.registerUser(row, column, userName, userId, functionToReg); main.showMainMenu();
		
	}
	
	
	public void setButtonsReg(Function function, String name, String id) {
		userName=name;
		userId=id;
		functionToReg=function;
		Client[][] seats=function.getSeats();
		for (int row=0;row<seats.length;row++) {
			for(int column=0;column<seats[0].length;column++) {
				if (seats[row][column]!=null) {
					int newrow=row+1;
					int newcolumn=column+1;
					calulateCoordsToButton(newrow, newcolumn);
				}
			}
		}
		
	}
	
	public void calulateCoordsToButton(int row, int column) {
		if(row==1) {
			if (column==1) {
				a1.setStyle("-fx-background-color: #5DADE2;");
				a1.setDisable(true);
			}
			else if(column==2) {
				a2.setStyle("-fx-background-color: #5DADE2;");
				a2.setDisable(true);
			}

			else if(column==3) {
				a3.setStyle("-fx-background-color: #5DADE2;");
				a3.setDisable(true);
			}

			else if(column==4) {
				a4.setStyle("-fx-background-color: #5DADE2;");
				a4.setDisable(true);
			}

			else if(column==5) {
				a5.setStyle("-fx-background-color: #5DADE2;");
				a5.setDisable(true);
			}

			else if(column==6) {
				a6.setStyle("-fx-background-color: #5DADE2;");
				a6.setDisable(true);
			}

			else if(column==7) {
				a7.setStyle("-fx-background-color: #5DADE2;");
				a7.setDisable(true);
			}
			
		}
		else if(row==2){
			if (column==1) {
				b1.setStyle("-fx-background-color: #5DADE2;");
				b1.setDisable(true);
			}
			else if(column==2) {
				b2.setStyle("-fx-background-color: #5DADE2;");
				b2.setDisable(true);
			}

			else if(column==3) {
				b3.setStyle("-fx-background-color: #5DADE2;");
				b3.setDisable(true);
			}

			else if(column==4) {
				b4.setStyle("-fx-background-color: #5DADE2;");
				b4.setDisable(true);
			}

			else if(column==5) {
				b5.setStyle("-fx-background-color: #5DADE2;");
				b5.setDisable(true);
			}

			else if(column==6) {
				b6.setStyle("-fx-background-color: #5DADE2;");
				b6.setDisable(true);
			}

			else if(column==7) {
				b7.setStyle("-fx-background-color: #5DADE2;");
				b7.setDisable(true);
			}
		}

		else if(row==3){
			if (column==1) {
				c1.setStyle("-fx-background-color: #5DADE2;");
				c1.setDisable(true);
			}
			else if(column==2) {
				c2.setStyle("-fx-background-color: #5DADE2;");
				c2.setDisable(true);
			}

			else if(column==3) {
				c3.setStyle("-fx-background-color: #5DADE2;");
				c3.setDisable(true);
			}

			else if(column==4) {
				c4.setStyle("-fx-background-color: #5DADE2;");
				c4.setDisable(true);
			}

			else if(column==5) {
				c5.setStyle("-fx-background-color: #5DADE2;");
				c5.setDisable(true);
			}

			else if(column==6) {
				c6.setStyle("-fx-background-color: #5DADE2;");
				c6.setDisable(true);
			}

			else if(column==7) {
				c7.setStyle("-fx-background-color: #5DADE2;");
				c7.setDisable(true);
			}
		}
		else if(row==4){
			if (column==1) {
				d1.setStyle("-fx-background-color: #5DADE2;");
				d1.setDisable(true);
			}
			else if(column==2) {
				d2.setStyle("-fx-background-color: #5DADE2;");
				d2.setDisable(true);
			}

			else if(column==3) {
				d3.setStyle("-fx-background-color: #5DADE2;");
				d3.setDisable(true);
			}

			else if(column==4) {
				d4.setStyle("-fx-background-color: #5DADE2;");
				d4.setDisable(true);
			}

			else if(column==5) {
				d5.setStyle("-fx-background-color: #5DADE2;");
				d5.setDisable(true);
			}

			else if(column==6) {
				d6.setStyle("-fx-background-color: #5DADE2;");
				d6.setDisable(true);
			}

			else if(column==7) {
				d7.setStyle("-fx-background-color: #5DADE2;");
				d7.setDisable(true);
			}
		}
		else if(row==5){
			if (column==1) {
				e1.setStyle("-fx-background-color: #5DADE2;");
				e1.setDisable(true);
			}
			else if(column==2) {
				e2.setStyle("-fx-background-color: #5DADE2;");
				e2.setDisable(true);
			}

			else if(column==3) {
				e3.setStyle("-fx-background-color: #5DADE2;");
				e3.setDisable(true);
			}

			else if(column==4) {
				e4.setStyle("-fx-background-color: #5DADE2;");
				e4.setDisable(true);
			}

			else if(column==5) {
				e5.setStyle("-fx-background-color: #5DADE2;");
				e5.setDisable(true);
			}

			else if(column==6) {
				e6.setStyle("-fx-background-color: #5DADE2;");
				e6.setDisable(true);
			}

			else if(column==7) {
				e7.setStyle("-fx-background-color: #5DADE2;");
				e7.setDisable(true);
			}
		}
		else if(row==6){
			if (column==1) {
				f1.setStyle("-fx-background-color: #5DADE2;");
				f1.setDisable(true);
			}
			else if(column==2) {
				f2.setStyle("-fx-background-color: #5DADE2;");
				f2.setDisable(true);
			}

			else if(column==3) {
				f3.setStyle("-fx-background-color: #5DADE2;");
				f3.setDisable(true);
			}

			else if(column==4) {
				f4.setStyle("-fx-background-color: #5DADE2;");
				f4.setDisable(true);
			}

			else if(column==5) {
				f5.setStyle("-fx-background-color: #5DADE2;");
				f5.setDisable(true);
			}

			else if(column==6) {
				f6.setStyle("-fx-background-color: #5DADE2;");
				f6.setDisable(true);
			}

			else if(column==7) {
				f7.setStyle("-fx-background-color: #5DADE2;");
				f7.setDisable(true);
			}
		}
	}
	
	public void setMain(Main main) {
		this.main=main;
	}

}
