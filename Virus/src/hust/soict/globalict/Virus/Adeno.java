package hust.soict.globalict.Virus;

import javafx.scene.image.Image;

public class Adeno extends VirusWithoutEnvelope{
	Element pentonBase;
	Element fiber;
	Element knobDomain;
	public Element getPentonBase() {
		return pentonBase;
	}
	public Element getFiber() {
		return fiber;
	}
	public Element getKnobDomain() {
		return knobDomain;
	}
	public Adeno(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod, Image image_overview,
			Element pentonBase, Element fiber, Element knobDomain) {
		super(acid_nucleic, capsid, symptoms, infectingMethod, image_overview);
		this.pentonBase = pentonBase;
		this.fiber = fiber;
		this.knobDomain = knobDomain;
		this.listOfElements.add(fiber);
		this.listOfElements.add(knobDomain);
		this.listOfElements.add(pentonBase);
	}
}
