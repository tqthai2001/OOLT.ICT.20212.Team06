package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class VirusWithoutEnvelope extends Virus {
	
	public VirusWithoutEnvelope() {
		super();
	}
	
	public VirusWithoutEnvelope(Element acid_nucleic, Element capsid, String[] symtoms, String infectingMethod, Image image_overview) {
		super(acid_nucleic, capsid, symtoms, infectingMethod, image_overview);
	}
	
}
