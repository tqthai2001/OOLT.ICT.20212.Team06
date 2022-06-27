package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class VirusWithEnvelope extends Virus {
	private Element envelope;
	
	public VirusWithEnvelope() {
		super();
		}
	public VirusWithEnvelope(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod, Image image_overview,  Element envelope){
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview);
		this.envelope = envelope;
		this.listOfElements.add(envelope);
	}
	public Element getEnvelope() {
		return envelope;
	}
}
