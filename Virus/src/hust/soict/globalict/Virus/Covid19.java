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
	public Covid19(Element acid_nucleic, Element capsid, String[] symptoms,
			Image image_overview, Element envelope, Element mprotein, Element eprotein, Element he, Element spike) {
		super(acid_nucleic, capsid, envelope, symptoms, image_overview);
		this.Mprotein = mprotein;
		this.Eprotein = eprotein;
		this.he = he;
		this.Spike = spike;
		this.listOfElements.add(spike);
		this.listOfElements.add(he);
		this.listOfElements.add(eprotein);
		this.listOfElements.add(mprotein);
	}
	
}