package hust.soict.globalict.Virus.VirusEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class Covid19 extends VirusWithEnvelope {
	private Element Mprotein;
	private Element Eprotein;
	private Element he;
	private Element Spike;

	public Element getMprotein() {
		return Mprotein;
	}
	public Element getEprotein() {
		return Eprotein;
	}
	public Element getHe() {
		return he;
	}
	public Element getSpike() {
		return Spike;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Covid19(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod,
			Image imageOverview, Element envelope, Element mprotein, Element eprotein, Element he, Element spike) {
		super(acidNucleic, capsid, envelope, symptoms, infectingMethod, imageOverview);
		this.Mprotein = mprotein;
		this.Eprotein = eprotein;
		this.he = he;
		this.Spike = spike;
		this.listOfElements.add(spike);
		this.listOfElements.add(he);
		this.listOfElements.add(eprotein);
		this.listOfElements.add(mprotein);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}