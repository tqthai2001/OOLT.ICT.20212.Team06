package hust.soict.globalict.Virus;

import java.util.*;

public class VirusWithEnvelope extends Virus {
	private String envelope;
	
	public VirusWithEnvelope(String name, String img, String acid_nucleic, String capsid, String[] symtoms, String envelope) {
		super(name, img, acid_nucleic, capsid, symtoms);
		this.envelope = envelope;
	}
	public String getEnvelope() {
		return envelope;
	}
	
	public String displayDetail() {
		String virus = getId() + " - " + getName() + " - " + getImg() +
				" - " + getAcid_nucleic() + " - " + getCapsid() +
				" - Symtoms: " + getSymtoms() + " - " + getEnvelope();
		return virus;
	}

	
}
