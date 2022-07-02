package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import javafx.scene.image.Image;

public class VirusWithoutEnvelope extends Virus {
	public VirusWithoutEnvelope() {
		super();
	}

	public VirusWithoutEnvelope(List<String> symptoms, List<String> infectingMethod, Image imageOverview,
			AcidNucleic acidNucleic, Capsid capsid) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		// TODO Auto-generated constructor stub
	}
}