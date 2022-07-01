package hust.soict.globalict.Screen;

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
		StructureScreen structureScreen = this;
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Virus Structure");
		this.setSize(1298, 720);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Structure.fxml"));
					VirusStructureController structureController = new VirusStructureController(virus, structureScreen);
					loader.setController(structureController);
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
