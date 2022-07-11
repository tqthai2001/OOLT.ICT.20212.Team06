package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.scene.image.Image;

public class Herpes extends VirusWithEnvelope {
	private DispensableElement tegument;
	private DispensableElement gB;
	private DispensableElement gC;
	private DispensableElement gD;
	private DispensableElement gHgL;
	
	public DispensableElement getTegument() {
		return tegument;
	}
	public DispensableElement getgB() {
		return gB;
	}
	public DispensableElement getgC() {
		return gC;
	}
	public DispensableElement getgD() {
		return gD;
	}
	public DispensableElement getgHgL() {
		return gHgL;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Herpes(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, DispensableElement tegument, DispensableElement gB,
			DispensableElement gC, DispensableElement gD, DispensableElement gHgL) {
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
