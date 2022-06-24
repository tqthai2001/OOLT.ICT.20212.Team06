package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class Astro extends VirusWithoutEnvelope{
	Element vp25;
	Element vp27;
	public Element getVp25() {
		return vp25;
	}
	public Element getVp27() {
		return vp27;
	}
	public Astro(Element acid_nucleic, Element capsid, String[] symtoms, String infectingMethod, Image image_overview,
			Element vp25, Element vp27) {
		super(acid_nucleic, capsid, symtoms, infectingMethod, image_overview);
		this.vp25 = vp25;
		this.vp27 = vp27;
	}
	
	
}
