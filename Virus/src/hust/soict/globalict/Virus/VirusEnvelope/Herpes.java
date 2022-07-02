package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class Herpes extends VirusWithEnvelope {
	private OtherElement tegument;
	private OtherElement gB;
	private OtherElement gC;
	private OtherElement gD;
	private OtherElement gHgL;
	
	public OtherElement getTegument() {
		return tegument;
	}
	public OtherElement getgB() {
		return gB;
	}
	public OtherElement getgC() {
		return gC;
	}
	public OtherElement getgD() {
		return gD;
	}
	public OtherElement getgHgL() {
		return gHgL;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Herpes(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, OtherElement tegument, OtherElement gB,
			OtherElement gC, OtherElement gD, OtherElement gHgL) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid, envelopeDesc, envelopeImage);
		this.tegument = tegument;
		this.gB = gB;
		this.gC = gC;
		this.gD = gD;
		this.gHgL = gHgL;
		this.addElement(tegument, gB, gC, gD, gHgL);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
