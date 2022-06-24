package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class Covid19 extends VirusWithEnvelope{
	Element Mprotein;
	Element Eprotein;
	Element he;
	Element Spike;
	public Element getMprotein() {
		return Mprotein;
	}
	public Element getEprotein() {
		return Eprotein;
	}
	public Element getHe() {
		return he;
	}
	public Element getSpike() {
		return Spike;
	}
	public Covid19(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod,
			Image image_overview, Element envelope, Element mprotein, Element eprotein, Element he, Element spike) {
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview, envelope);
		Mprotein = mprotein;
		Eprotein = eprotein;
		this.he = he;
		Spike = spike;
	}
	
}
