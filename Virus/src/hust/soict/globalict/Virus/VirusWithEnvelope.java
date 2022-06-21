package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class VirusWithEnvelope extends Virus {
	private Element envelope;
	
	public VirusWithEnvelope() {
		super();
		}
	public VirusWithEnvelope(Element acid_nucleic, Element capsid, Element envelope, String[] symtoms, Image image_overview) {
		super(acid_nucleic, capsid, symtoms, image_overview);
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
