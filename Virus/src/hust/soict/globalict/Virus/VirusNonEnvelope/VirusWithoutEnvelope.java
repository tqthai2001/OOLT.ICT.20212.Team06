package hust.soict.globalict.Virus.VirusNonEnvelope;

import hust.soict.globalict.Virus.Element;
import hust.soict.globalict.Virus.Virus;
import javafx.scene.image.Image;

public abstract class VirusWithoutEnvelope extends Virus {
	public VirusWithoutEnvelope() {
		super();
	}
	public VirusWithoutEnvelope(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod, Image imageOverview) {
		super(acidNucleic, capsid, symptoms, infectingMethod, imageOverview);
	}
}