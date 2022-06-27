package hust.soict.globalict.Virus.VirusEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class HIV extends VirusWithEnvelope {
	private Element protease;
	private Element integrease;
	private Element tat;
	
	public Element getProtease() {
		return protease;
	}
	public Element getReverseTrascriptase() {
		return integrease;
	}
	public Element getTat() {
		return tat;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public HIV(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod,
			Element envelope, Element protease, Element integrase, Element tat, Image imageOverview) {
		super(acidNucleic, capsid, envelope, symptoms, infectingMethod, imageOverview);
		this.protease = protease;
		this.integrease = integrase;
		this.tat = tat;
		this.listOfElements.add(integrase);
		this.listOfElements.add(protease);
		this.listOfElements.add(tat);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
