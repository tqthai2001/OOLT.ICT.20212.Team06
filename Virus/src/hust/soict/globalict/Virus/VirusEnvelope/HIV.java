package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class HIV extends VirusWithEnvelope {
	private OtherElement protease;
	private OtherElement integrease;
	private OtherElement tat;
	
	public OtherElement getProtease() {
		return protease;
	}
	public OtherElement getReverseTrascriptase() {
		return integrease;
	}
	public OtherElement getTat() {
		return tat;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
		
	public HIV(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, OtherElement protease, OtherElement integrease,
			OtherElement tat) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid, envelopeDesc, envelopeImage);
		this.protease = protease;
		this.integrease = integrease;
		this.tat = tat;
		this.addElement(protease, integrease, tat);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}
