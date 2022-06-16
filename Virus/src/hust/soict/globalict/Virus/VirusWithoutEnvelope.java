package hust.soict.globalict.Virus;

import java.util.*;

public class VirusWithoutEnvelope extends Virus {
	
	public VirusWithoutEnvelope(String name, String img, String acid_nucleic, String capsid, String[] symtoms) {
		super(name, img, acid_nucleic, capsid, symtoms);
	}
	
	public String displayDetail() {
		String virus = getId() + " - " + getName() + " - " + getImg() +
				" - " + getAcid_nucleic() + " - " + getCapsid() +
				" - Symtoms: " + getSymtoms();
		return virus;
	}

	
}
