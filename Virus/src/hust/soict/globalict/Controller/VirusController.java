package hust.soict.globalict.Controller;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import hust.soict.globalict.Screen.InfectingDetailScreen;
import hust.soict.globalict.Screen.InfectingScreen;
import hust.soict.globalict.Screen.MainScreen;
import hust.soict.globalict.Screen.StructureScreen;
import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.VirusEnvelope.Covid19;
import hust.soict.globalict.Virus.VirusEnvelope.HIV;
import hust.soict.globalict.Virus.VirusEnvelope.Herpes;
import hust.soict.globalict.Virus.VirusNonEnvelope.Adeno;
import hust.soict.globalict.Virus.VirusNonEnvelope.Astro;
import hust.soict.globalict.Virus.VirusNonEnvelope.Rota;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VirusController {
	@FXML
    protected Button btViewInfecting, btViewStructure, btBack, btViewInfectingDetail;
	protected Virus virus;
	protected JFrame jFrame;
	
	protected Virus getVirus() {
		return virus;
	}
	public void setVirus(Virus virus) {
		this.virus = virus;
	}
	
	public VirusController() {
		super();
	}
	public VirusController(Virus virus, JFrame jFrame) throws HeadlessException {
		super();
		this.virus = virus;
		this.jFrame = jFrame;
	}
	public VirusController(Button btViewInfecting, Button btViewStructure, Button btBack,
			Button btViewInfectingDetail) {
		super();
		this.btViewInfecting = btViewInfecting;
		this.btViewStructure = btViewStructure;
		this.btBack = btBack;
		this.btViewInfectingDetail = btViewInfectingDetail;
	}
	
	public void handleSideBar() {
		btViewInfecting.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			new InfectingScreen(virus, jFrame);
		});
		btViewStructure.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			new StructureScreen(virus, jFrame);
		});
		btBack.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
		});
		btViewInfectingDetail.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			new InfectingDetailScreen(virus, jFrame);
		});
	}
}
