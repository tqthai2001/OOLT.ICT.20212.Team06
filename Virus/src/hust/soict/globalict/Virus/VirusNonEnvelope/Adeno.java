package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class Adeno extends VirusWithoutEnvelope {
	private OtherElement pentonBase;
	private OtherElement fiber;
	private OtherElement knobDomain;
	
	public OtherElement getPentonBase() {
		return pentonBase;
	}
	public OtherElement getFiber() {
		return fiber;
	}
	public OtherElement getKnobDomain() {
		return knobDomain;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Adeno(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, OtherElement pentonBase, OtherElement fiber, OtherElement knobDomain) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		this.pentonBase = pentonBase;
		this.fiber = fiber;
		this.knobDomain = knobDomain;
		this.addElement(pentonBase, fiber, knobDomain);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
