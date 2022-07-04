package hust.soict.globalict.Screen;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import hust.soict.globalict.Controller.HelpScreenController;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HelpScreen extends JFrame {
	public HelpScreen(JFrame jFrame) throws HeadlessException {
		super();
		HelpScreen helpScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Help");
		this.setSize(1298, 720);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("HelpScreen.fxml"));
					HelpScreenController helpScreenController = new HelpScreenController(helpScreen);
					loader.setController(helpScreenController);
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
