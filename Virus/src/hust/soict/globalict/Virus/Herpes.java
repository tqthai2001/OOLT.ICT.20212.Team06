package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class Herpes extends VirusWithEnvelope{
	Element tegument;
	Element gB;
	Element gC;
	Element gD;
	Element gHgL;
	public Element getTegument() {
		return tegument;
	}
	public Element getgB() {
		return gB;
	}
	public Element getgC() {
		return gC;
	}
	public Element getgD() {
		return gD;
	}
	public Element getgHgL() {
		return gHgL;
	}
	public Herpes(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod, Image image_overview,
			Element envelope, Element tegument, Element gB, Element gC, Element gD, Element gHgL) {
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview, envelope);
		this.tegument = tegument;
		this.gB = gB;
		this.gC = gC;
		this.gD = gD;
		this.gHgL = gHgL;
	}
	
	
	
}
