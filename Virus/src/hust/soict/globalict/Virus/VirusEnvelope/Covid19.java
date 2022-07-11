package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.scene.image.Image;

public class Covid19 extends VirusWithEnvelope {
	private DispensableElement mProtein;
	private DispensableElement eProtein;
	private DispensableElement he;
	private DispensableElement spike;
	
	public DispensableElement getmProtein() {
		return mProtein;
	}
	public DispensableElement geteProtein() {
		return eProtein;
	}
	public DispensableElement getHe() {
		return he;
	}
	public DispensableElement getSpike() {
		return spike;
	}
	public String getVirusName() {
		return "Covid-19";
	}
	
	public Covid19(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, DispensableElement mProtein, DispensableElement eProtein,
			DispensableElement he, DispensableElement spike) {
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