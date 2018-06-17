package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main_Controller implements Initializable {
	Price_Management price=new Price_Management();
	 static Stage primaryStage=new Stage() ;
		public static String value="";
		public static String value2="";
		public static boolean var1;
		public static boolean var2;
		@FXML TextField Budget;
		@FXML RadioButton yes;
		@FXML RadioButton No;
		@FXML Label final_label=new Label("Hellow");
		@FXML Button Thanks;
		Scene scene;
		 public static int Price=0;
		 public static String Text;
	
  
	public void Hatchback(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("Hatchback.fxml"));
			 scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
	}
	public void SUV(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("SUV.fxml"));
		 scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
	}
	public void Sedan(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("Sedan.fxml"));
			 scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
	}
	public void MPV(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("MPV.fxml"));
			 scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
	}
	public void Crossover(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("Crossover.fxml"));
			scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
			 
	}
	public void Coupe(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("Coupe.fxml"));
			scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
			 value=((Button)event.getSource()).getText();
			 System.out.println(value);
	}
	public void commonButtonFunction(ActionEvent event) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("Customer_information.fxml"));
			scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
		    value2=((Button)event.getSource()).getText();
			Price= price.carType(price.carManagement(value), value2);
			
			
	}
	public void transactionProcess(ActionEvent event) throws Exception {
		String Bud=Budget.getText();
		int Budget=Integer.parseInt(Bud);
		int Loan=Price-Budget;
	
		
		if(var1&&!var2) {
			if(Loan>0) {
			 Text="Sir, You have taken a loan of tk "+Loan+"$";
			final_label.setText(Text);
			}
			else {
			    Text="Sir, You do not need any loan, you can buy easily with your budget tk"+Budget+"$";
				final_label.setText(Text);
			}
		}
		else if(var2&&!var1) {
			if(Loan<=0) {
				Text="Congratulation Sir, You have bought this Car ";
				final_label.setText(Text);
				System.out.println(final_label.getText());
			}
			else {
				Text="you need to take loan sir ,otherwise you can not afford this car";
				final_label.setText(Text);
			}
		}
		else if((var1&var2)||(!var1&&!var2)) {
			Text="Go back! Select yes or no please ";
			final_label.setText(Text);
		}
	}
	public void customerInformation(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Ending Page.fxml"));
	    scene = new Scene(root,500,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		var1=yes.isSelected();
		var2=No.isSelected();
	}
	public void handleCloseButtonAction(ActionEvent event) {
	    Stage stage = (Stage) Thanks.getScene().getWindow();
	    stage.close();
	}
	public void goBackToLoan(ActionEvent event) throws Exception {
		 
		 Parent root= FXMLLoader.load(getClass().getResource("Customer_information.fxml"));
		    scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	public void goBack(ActionEvent event) throws Exception {
		 String noSpace = value.replaceAll("\\s", "");
		String file=noSpace+".fxml";
		 Parent root= FXMLLoader.load(getClass().getResource(file));
			scene = new Scene(root,500,600);
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		final_label.setText("");
		final_label.setWrapText(true);
	}
}
