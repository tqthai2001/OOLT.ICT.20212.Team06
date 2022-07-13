package hust.soict.globalict.Virus.VirusEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.Envelope;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class VirusWithEnvelope extends Virus {
	protected final Envelope envelope;
	
	public Envelope getEnvelope() {
		return envelope;
	}
	
	public VirusWithEnvelope(List<String> symptoms, List<String> infectingMethod, Image imageOverview,
			AcidNucleic acidNucleic, Capsid capsid, String envelopeDesc, Image envelopeImage) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		this.envelope = new Envelope(envelopeImage, envelopeDesc);
		this.addElement(envelope);
	}
	
	@Override
	public void infect(TextArea detailedDescTf, ImageView overviewImg, ImageView envelopeImg, ImageView capsidImg, HBox hbAcid, Button btnReplay) {
		detailedDescTf.setText("The virus attacks the cell. The capsid separates from the envelope. Then the capsid is dissolved and the"
				+ " nucleic acid remains. The number of nucleic acids copied depends on the virus type.");
		detailedDescTf.setWrapText(true);
		capsidImg.setImage(this.getCapsid().getImage());
		envelopeImg.setImage(((VirusWithEnvelope) this).getEnvelope().getImage());
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
				Timeline fadeInEnvelope = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(envelopeImg.opacityProperty(), 1.0)));
				fadeInEnvelope.play();
				Timeline fadeInCapsid = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(capsidImg.opacityProperty(), 1.0)));
				fadeInCapsid.setOnFinished(e2 -> {
					FadeTransition fadeInHBoxAcid = new FadeTransition(Duration.millis(1500), hbAcid);
					fadeInHBoxAcid.setDelay(Duration.millis(100));
					fadeInHBoxAcid.setFromValue(0);
			        fadeInHBoxAcid.setToValue(1);
			        fadeInHBoxAcid.setOnFinished(e3 -> {
			        	btnReplay.setVisible(true);
			        });
					fadeInHBoxAcid.play();
					FadeTransition fadeOutCapsid = new FadeTransition(Duration.millis(1500), capsidImg);
					fadeOutCapsid.setDelay(Duration.millis(100));
			        fadeOutCapsid.setFromValue(1);
			        fadeOutCapsid.setToValue(0);
			        fadeOutCapsid.play();
				});
				fadeInCapsid.play();
			});
			fadeOutOverview.play();
		});
		transition.play();
	}
}
