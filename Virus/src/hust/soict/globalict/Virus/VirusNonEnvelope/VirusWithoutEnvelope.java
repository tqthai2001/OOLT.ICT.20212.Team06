package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class VirusWithoutEnvelope extends Virus {
	public VirusWithoutEnvelope() {
		super();
	}

	public VirusWithoutEnvelope(List<String> symptoms, List<String> infectingMethod, Image imageOverview,
			AcidNucleic acidNucleic, Capsid capsid) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void infect(TextArea detailedDescTf, ImageView overviewImg, ImageView envelopeImg, ImageView capsidImg, HBox hbAcid, Button btnReplay) {
		detailedDescTf.setText("The virus attacks the cell. Since the virus has no envelope, it can't fuse with the cell membrane."
				+ " After being enclosed by the cell membrane and penetrate the cell. The capsid separates from the envelope."
				+ " Then the capsid is dissolved and the nucleic acid remains. The number of nucleic acids copied depends on the virus type.");
		detailedDescTf.setWrapText(true);
    	TranslateTransition transition = new TranslateTransition();
    	transition.setNode(overviewImg);
    	transition.setDelay(Duration.millis(500));
    	transition.setToX(450);
		transition.setToY(400);
		transition.setDuration(Duration.seconds(3));
		transition.setOnFinished(e -> {
			FadeTransition fadeOutOverview = new FadeTransition(Duration.millis(1200), overviewImg);
			fadeOutOverview.setDelay(Duration.millis(100));
			fadeOutOverview.setFromValue(1);
			fadeOutOverview.setToValue(0);
			fadeOutOverview.setOnFinished(e1 -> {
				FadeTransition fadeInHBoxAcid = new FadeTransition(Duration.millis(1500), hbAcid);
				fadeInHBoxAcid.setDelay(Duration.millis(100));
				fadeInHBoxAcid.setFromValue(0);
		        fadeInHBoxAcid.setToValue(1);
		        fadeInHBoxAcid.setOnFinished(e3 -> {
		        	btnReplay.setVisible(true);
		        });
				fadeInHBoxAcid.play();
			});
			fadeOutOverview.play();
		});
		transition.play();
	}
}