package hust.soict.globalict.Virus.VirusNonEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class Astro extends VirusWithoutEnvelope {
	private Element vp25;
	private Element vp27;
	
	public Element getVp25() {
		return vp25;
	}
	public Element getVp27() {
		return vp27;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Astro(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod, Image imageOverview,
			Element vp25, Element vp27) {
		super(acidNucleic, capsid, symptoms, infectingMethod, imageOverview);
		this.vp25 = vp25;
		this.vp27 = vp27;
		this.listOfElements.add(vp27);
		this.listOfElements.add(vp25);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
