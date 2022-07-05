package hust.soict.globalict.Screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;

import hust.soict.globalict.Controller.MainScreenController;

import hust.soict.globalict.Virus.VirusEnvelope.Covid19;
import hust.soict.globalict.Virus.VirusEnvelope.HIV;
import hust.soict.globalict.Virus.VirusEnvelope.Herpes;
import hust.soict.globalict.Virus.VirusNonEnvelope.Adeno;
import hust.soict.globalict.Virus.VirusNonEnvelope.Astro;
import hust.soict.globalict.Virus.VirusNonEnvelope.Rota;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainScreen extends JFrame {
	private HIV hiv;
	private Covid19 covid;
	private Herpes herpes;
	private Rota rota;
	private Astro astro;
	private Adeno adeno;
	private JFrame jFrame;
	
	public MainScreen(JFrame jFrame) throws HeadlessException {
		super();
//		this.hiv = hiv;
//		this.covid = covid;
//		this.herpes = herpes;
//		this.rota = rota;
//		this.astro = astro;
//		this.adeno = adeno;
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
