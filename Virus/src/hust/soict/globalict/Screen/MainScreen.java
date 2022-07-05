package hust.soict.globalict.Screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;

import hust.soict.globalict.Controller.MainScreenController;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainScreen extends JFrame {
	private JFrame jFrame;
	
	public MainScreen(JFrame jFrame) throws HeadlessException {
		super();
		MainScreen mainScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Virus Main Menu");
		this.setSize(1298, 720);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
					MainScreenController mainScreenController = new MainScreenController(mainScreen);
					loader.setController(mainScreenController);
					Parent root = loader.load();
					Scene scene = new Scene(root);
					fxPanel.setScene(scene);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
	}
}
