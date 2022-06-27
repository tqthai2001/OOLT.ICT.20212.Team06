package hust.soict.globalict.Virus.VirusNonEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class Rota extends VirusWithoutEnvelope {
	private Element vp1;
	private Element vp3;
	private Element vp4;
	
	public Element getVp1() {
		return vp1;
	}
	public Element getVp3() {
		return vp3;
	}
	public Element getVp4() {
		return vp4;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Rota(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod, Image imageOverview,
			Element vp1, Element vp3, Element vp4) {
		super(acidNucleic, capsid, symptoms, infectingMethod, imageOverview);
		this.vp1 = vp1;
		this.vp3 = vp3;
		this.vp4 = vp4;
		this.listOfElements.add(vp1);
		this.listOfElements.add(vp3);
		this.listOfElements.add(vp4);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
