package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class Rota extends VirusWithoutEnvelope{
	Element vp1;
	Element vp3;
	Element vp4;
	
	public Element getVp1() {
		return vp1;
	}
	public Element getVp3() {
		return vp3;
	}
	public Element getVp4() {
		return vp4;
	}
	public Rota(Element acid_nucleic, Element capsid, String[] symtoms, String infectingMethod, Image image_overview,
			Element vp1, Element vp3, Element vp4) {
		super(acid_nucleic, capsid, symtoms, infectingMethod, image_overview);
		this.vp1 = vp1;
		this.vp3 = vp3;
		this.vp4 = vp4;
	}
	
	
}
