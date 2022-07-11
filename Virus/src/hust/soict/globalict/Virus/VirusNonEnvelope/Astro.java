package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.scene.image.Image;

public class Astro extends VirusWithoutEnvelope {
	private DispensableElement vp25;
	private DispensableElement vp27;
	
	public DispensableElement getVp25() {
		return vp25;
	}
	public DispensableElement getVp27() {
		return vp27;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Astro(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, DispensableElement vp25, DispensableElement vp27) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		this.vp25 = vp25;
		this.vp27 = vp27;
		this.addElement(vp25, vp27);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
