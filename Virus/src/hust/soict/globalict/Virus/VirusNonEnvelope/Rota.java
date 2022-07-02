package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class Rota extends VirusWithoutEnvelope {
	private OtherElement vp1;
	private OtherElement vp3;
	private OtherElement vp4;
	
	public OtherElement getVp1() {
		return vp1;
	}
	public OtherElement getVp3() {
		return vp3;
	}
	public OtherElement getVp4() {
		return vp4;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
	
	public Rota(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, OtherElement vp1, OtherElement vp3, OtherElement vp4) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
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
