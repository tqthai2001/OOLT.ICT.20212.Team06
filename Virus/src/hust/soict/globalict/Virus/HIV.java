package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class HIV extends VirusWithEnvelope {
	Element protease;
	Element integrease;
	Element tat;
	public Element getProtease() {
		return protease;
	}
	public Element getReverseTrascriptase() {
		return integrease;
	}
	public Element getTat() {
		return tat;
	}
	
	public HIV() {
	}
	public HIV(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod, Image image_overview, Element envelope, Element protease, Element integrase, Element tat) {
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview, envelope);
		this.protease = protease;
		this.integrease = integrase;
		this.tat = tat;
		this.listOfElements.add(integrase);
		this.listOfElements.add(protease);
		this.listOfElements.add(tat);
	}
}
