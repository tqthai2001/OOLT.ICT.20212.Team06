package hust.soict.globalict.Screen;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import hust.soict.globalict.Controller.VirusInfectingController;
import hust.soict.globalict.Virus.Virus;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class InfectingScreen extends JFrame {
	private Virus virus;

	public InfectingScreen(Virus virus, JFrame jFrame) throws HeadlessException {
		super();
		this.virus = virus;
		InfectingScreen infectingScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Virus Infecting");
		this.setSize(1298, 720);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		Platform.runLater(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Infecting.fxml"));
					VirusInfectingController infectingController = new VirusInfectingController(virus, infectingScreen);
					loader.setController(infectingController);
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
