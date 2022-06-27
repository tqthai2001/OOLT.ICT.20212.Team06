package hust.soict.globalict.Virus.VirusEnvelope;

import hust.soict.globalict.Virus.Element;
import hust.soict.globalict.Virus.Virus;
import javafx.scene.image.Image;

public abstract class VirusWithEnvelope extends Virus {
	private Element envelope;
	
	public VirusWithEnvelope() {
		super();
	}
	public VirusWithEnvelope(Element acid_nucleic, Element capsid, Element envelope, String[] symtoms, Image image_overview) {
		super(acid_nucleic, capsid, symtoms, image_overview);
		this.envelope = envelope;
		this.listOfElements.add(envelope);
	}
	public Element getEnvelope() {
		return envelope;
	}
}
