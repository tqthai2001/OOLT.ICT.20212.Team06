package hust.soict.globalict.Virus.VirusNonEnvelope;

import hust.soict.globalict.Virus.Element;
import javafx.scene.image.Image;

public class Adeno extends VirusWithoutEnvelope {
	private Element pentonBase;
	private Element fiber;
	private Element knobDomain;
	
	public Element getPentonBase() {
		return pentonBase;
	}
	public Element getFiber() {
		return fiber;
	}
	public Element getKnobDomain() {
		return knobDomain;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Adeno(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod, Image imageOverview, Element pentonBase,
			Element fiber, Element knobDomain) {
		super(acidNucleic, capsid, symptoms, infectingMethod, imageOverview);
		this.pentonBase = pentonBase;
		this.fiber = fiber;
		this.knobDomain = knobDomain;
		this.listOfElements.add(fiber);
		this.listOfElements.add(knobDomain);
		this.listOfElements.add(pentonBase);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
