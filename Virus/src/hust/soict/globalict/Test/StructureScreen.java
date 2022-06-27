package hust.soict.globalict.Test;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import hust.soict.globalict.Controller.VirusStructureController;
import hust.soict.globalict.Virus.Virus;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class StructureScreen extends JFrame {
	private Virus virus;

	public StructureScreen(Virus virus) throws HeadlessException {
		super();
		this.virus = virus;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Virus");
		this.setSize(1280, 720);
		this.setVisible(true);
		
		Platform.runLater(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("../Screen/structure.fxml"));
					VirusStructureController infectingController = new VirusStructureController(virus);
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