package hust.soict.globalict.Virus.VirusEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class Herpes extends VirusWithEnvelope {
	private Element tegument;
	private Element gB;
	private Element gC;
	private Element gD;
	private Element gHgL;
	
	public Element getTegument() {
		return tegument;
	}
	public Element getgB() {
		return gB;
	}
	public Element getgC() {
		return gC;
	}
	public Element getgD() {
		return gD;
	}
	public Element getgHgL() {
		return gHgL;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Herpes(Element acidNucleic, Element capsid, Element envelope, String[] symptoms, String[] infectingMethod,
			Image imageOverview, Element tegument, Element gB, Element gC, Element gD, Element gHgL) {
		super(acidNucleic, capsid, envelope, symptoms, infectingMethod, imageOverview);
		this.tegument = tegument;
		this.gB = gB;
		this.gC = gC;
		this.gD = gD;
		this.gHgL = gHgL;
		this.listOfElements.add(tegument);
		this.listOfElements.add(gB);
		this.listOfElements.add(gC);
		this.listOfElements.add(gHgL);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
