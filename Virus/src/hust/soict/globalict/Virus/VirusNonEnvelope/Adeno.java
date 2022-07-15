package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.scene.image.Image;

public class Adeno extends VirusWithoutEnvelope {
	private DispensableElement pentonBase;
	private DispensableElement fiber;
	private DispensableElement knobDomain;
	
	public DispensableElement getPentonBase() {
		return pentonBase;
	}
	public DispensableElement getFiber() {
		return fiber;
	}
	public DispensableElement getKnobDomain() {
		return knobDomain;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Adeno(List<String> symptoms, List<String> infectingMethod, Image imageOverview, Image virusCoveredImg, AcidNucleic acidNucleic,
			Capsid capsid, DispensableElement pentonBase, DispensableElement fiber, DispensableElement knobDomain) {
		super(symptoms, infectingMethod, imageOverview, virusCoveredImg, acidNucleic, capsid);
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
