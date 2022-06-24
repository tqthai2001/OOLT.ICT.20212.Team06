package hust.soict.globalict.Virus;

import java.util.List;

import javafx.scene.image.Image;

public class HIV extends VirusWithEnvelope {
	Element protease;
	Element integrease;
	Element tat;
	public Element getProtease() {
		return protease;
	}
	public Element getReverseTrascriptase() {
		return integrease;
	}
	public Element getTat() {
		return tat;
	}
	public HIV(int id, Element acid_nucleic, Element capsid, List<String> symtoms, String infectingMethod,
			Image image_overview, Element envelope, Element protease, Element integrease, Element tat) {
		super(id, acid_nucleic, capsid, symtoms, infectingMethod, image_overview, envelope);
		this.protease = protease;
		this.integrease = integrease;
		this.tat = tat;
	}

	
}
