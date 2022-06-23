package hust.soict.globalict;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VirusMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("./Screen/Infecting.fxml"));
			Parent root = loader.load();
			primaryStage.setTitle("Virus");
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
            primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception{
		launch(args);
	}
}