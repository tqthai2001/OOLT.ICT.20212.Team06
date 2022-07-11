package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Infecting;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class HIV extends VirusWithEnvelope{
	private DispensableElement protease;
	private DispensableElement integrease;
	private DispensableElement tat;
	
	public DispensableElement getProtease() {
		return protease;
	}
	public DispensableElement getReverseTrascriptase() {
		return integrease;
	}
	public DispensableElement getTat() {
		return tat;
	}
	public String getVirusName() {
		return this.getClass().getSimpleName();
	}
		
	public HIV(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid, String envelopeDesc, Image envelopeImage, DispensableElement protease, DispensableElement integrease,
			DispensableElement tat) {
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
