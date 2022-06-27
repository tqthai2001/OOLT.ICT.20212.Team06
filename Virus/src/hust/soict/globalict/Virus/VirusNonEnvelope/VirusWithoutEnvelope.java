package hust.soict.globalict.Virus.VirusNonEnvelope;

import hust.soict.globalict.Virus.Element;
import hust.soict.globalict.Virus.Virus;
import javafx.scene.image.Image;

public abstract class VirusWithoutEnvelope extends Virus {
	public VirusWithoutEnvelope() {
		super();
	}
	public VirusWithoutEnvelope(Element acid_nucleic, Element capsid, String[] symtoms, Image image_overview) {
		super(acid_nucleic, capsid, symtoms, image_overview);
	}
}