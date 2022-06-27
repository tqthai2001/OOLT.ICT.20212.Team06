package hust.soict.globalict.Controller;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import hust.soict.globalict.Screen.StructureScreen;
import hust.soict.globalict.Virus.Virus;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VirusController {
	@FXML
    protected Button btViewInfecting, btViewStructure, btBack;
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
	public VirusController(Button btViewInfecting, Button btViewStructure, Button btBack) {
		super();
		this.btViewInfecting = btViewInfecting;
		this.btViewStructure = btViewStructure;
		this.btBack = btBack;
	}
	
	public void handleSideBar() {
		btViewInfecting.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			this.virus.infecting();
		});
		btViewStructure.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			new StructureScreen(virus);
		});
		btBack.setOnAction((ActionEvent) -> {
			jFrame.setVisible(false);
			new StructureScreen(virus);
		});
	}
}
