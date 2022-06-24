package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class VirusWithEnvelope extends Virus {
	private Element envelope;
	
	public VirusWithEnvelope(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod,
			Image image_overview, Element envelope) {
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview);
		this.envelope = envelope;
	}

	public Element getEnvelope() {
		return envelope;
	}
	
	public String displayDetail() {
		String virus = getId() + " - " +
				" - " + getAcid_nucleic() + " - " + getCapsid() +
				" - Symtoms: " + getSymtoms() + " - " + getEnvelope();
		return virus;
	}

	
}
