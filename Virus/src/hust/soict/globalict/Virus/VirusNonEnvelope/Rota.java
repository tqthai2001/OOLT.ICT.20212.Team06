package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.scene.image.Image;

public class Rota extends VirusWithoutEnvelope {
	private DispensableElement vp1;
	private DispensableElement vp3;
	private DispensableElement vp4;
	
	public DispensableElement getVp1() {
		return vp1;
	}
	public DispensableElement getVp3() {
		return vp3;
	}
	public DispensableElement getVp4() {
		return vp4;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Rota(List<String> symptoms, List<String> infectingMethod, Image imageOverview, Image virusCoveredImg, AcidNucleic acidNucleic,
			Capsid capsid, DispensableElement vp1, DispensableElement vp3, DispensableElement vp4) {
		super(symptoms, infectingMethod, imageOverview, virusCoveredImg, acidNucleic, capsid);
		this.vp1 = vp1;
		this.vp3 = vp3;
		this.vp4 = vp4;
		this.addElement(vp1, vp3, vp4);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
