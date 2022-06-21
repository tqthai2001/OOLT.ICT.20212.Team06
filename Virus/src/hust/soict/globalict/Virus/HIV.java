package hust.soict.globalict.Virus;

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

	public HIV(Element acid_nucleic, Element capsid, Element envelope, String[] symtoms, Element protease, Element integrase, Element tat, Image image_overview) {
		super(acid_nucleic, capsid, envelope, symtoms, image_overview);
		this.protease = protease;
		this.integrease = integrase;
		this.tat = tat;
	}
}
