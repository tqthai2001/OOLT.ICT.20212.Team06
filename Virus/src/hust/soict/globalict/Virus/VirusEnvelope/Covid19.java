package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import javafx.scene.image.Image;

public class Covid19 extends VirusWithEnvelope {
	private OtherElement mProtein;
	private OtherElement eProtein;
	private OtherElement he;
	private OtherElement spike;
	
	public OtherElement getmProtein() {
		return mProtein;
	}
	public OtherElement geteProtein() {
		return eProtein;
	}
	public OtherElement getHe() {
		return he;
	}
	public OtherElement getSpike() {
		return spike;
	}
	public String getVirusName() {
		return "Covid-19";
	}
	
	public Covid19(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, OtherElement mProtein, OtherElement eProtein,
			OtherElement he, OtherElement spike) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid, envelopeDesc, envelopeImage);
		this.mProtein = mProtein;
		this.eProtein = eProtein;
		this.he = he;
		this.spike = spike;
		this.addElement(spike, he, mProtein, eProtein);
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "ID: " + getId() + " - Virus: " + getVirusName() + "\nSymptoms: " + getSymptoms() + "\nInfecting Method: " + getInfectingMethod();
	}
}