package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.Envelope;
import javafx.scene.image.Image;

public class VirusWithEnvelope extends Virus {
	private final Envelope envelope;
	
	public Envelope getEnvelope() {
		return envelope;
	}
	
	public VirusWithEnvelope(List<String> symptoms, List<String> infectingMethod, Image imageOverview,
			AcidNucleic acidNucleic, Capsid capsid, String envelopeDesc, Image envelopeImage) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		this.envelope = new Envelope(envelopeImage, envelopeDesc);
		this.addElement(envelope);
	}
}
