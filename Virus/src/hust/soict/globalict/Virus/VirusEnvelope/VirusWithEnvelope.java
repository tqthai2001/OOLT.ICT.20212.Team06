package hust.soict.globalict.Virus.VirusEnvelope;

import hust.soict.globalict.Virus.Element;
import hust.soict.globalict.Virus.Virus;
import javafx.scene.image.Image;

public abstract class VirusWithEnvelope extends Virus {
	private Element envelope;
	
	public VirusWithEnvelope() {
		super();
	}
	public VirusWithEnvelope(Element acidNucleic, Element capsid, Element envelope, String[] symptoms, String[] infectingMethod, Image imageOverview) {
		super(acidNucleic, capsid, symptoms, infectingMethod, imageOverview);
		this.envelope = envelope;
		this.listOfElements.add(envelope);
	}
	public Element getEnvelope() {
		return envelope;
	}
}
