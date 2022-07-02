package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class Astro extends VirusWithoutEnvelope {
	private OtherElement vp25;
	private OtherElement vp27;
	
	public OtherElement getVp25() {
		return vp25;
	}
	public OtherElement getVp27() {
		return vp27;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Astro(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, OtherElement vp25, OtherElement vp27) {
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
