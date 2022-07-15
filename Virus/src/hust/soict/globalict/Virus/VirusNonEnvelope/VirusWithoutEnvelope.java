package hust.soict.globalict.Virus.VirusNonEnvelope;

import java.util.List;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.Envelope;
import hust.soict.globalict.Virus.VirusEnvelope.VirusWithEnvelope;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class VirusWithoutEnvelope extends Virus {
	protected Image virusCoveredImg;
	public Image getVirusCoveredImg() {
		return virusCoveredImg;
	}
	public VirusWithoutEnvelope() {
		super();
	}

	public VirusWithoutEnvelope(List<String> symptoms, List<String> infectingMethod, Image imageOverview, Image virusCoveredImg,
			AcidNucleic acidNucleic, Capsid capsid) {
		super(symptoms, infectingMethod, imageOverview, acidNucleic, capsid);
		this.virusCoveredImg = virusCoveredImg;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void infect(TextArea detailedDescTf, ImageView overviewImg, ImageView envelopeImg, ImageView capsidImg, ImageView vesicleImg, HBox hbAcid, Button btnReplay) {
		detailedDescTf.setText("The virus attacks the cell. Since the virus has no envelope, it can't fuse with the cell membrane."
				+ " After being enclosed by the cell membrane and penetrate the cell. The capsid separates from the envelope."
				+ " Then the capsid is dissolved and the nucleic acid remains. The number of nucleic acids copied depends on the virus type.");
		detailedDescTf.setWrapText(true);
		vesicleImg.setImage(((VirusWithoutEnvelope) this).getVirusCoveredImg());
    	TranslateTransition transition = new TranslateTransition();
    	transition.setNode(overviewImg);
    	transition.setDelay(Duration.millis(500));
    	transition.setToX(400);
		transition.setToY(180);
		transition.setDuration(Duration.seconds(3));
		transition.setOnFinished(e -> {
			FadeTransition fadeOutOverview = new FadeTransition(Duration.millis(1200), overviewImg);
			fadeOutOverview.setDelay(Duration.millis(100));
			fadeOutOverview.setFromValue(1);
			fadeOutOverview.setToValue(0);
			fadeOutOverview.setOnFinished(e1 -> {
				FadeTransition fadeInVesicle = new FadeTransition(Duration.millis(1200), vesicleImg);
				fadeInVesicle.setDelay(Duration.millis(100));
				fadeInVesicle.setFromValue(0);
				fadeInVesicle.setToValue(1);
				fadeInVesicle.setOnFinished(e2 -> {
					FadeTransition fadeOutVesicle= new FadeTransition(Duration.millis(1200), vesicleImg);
					fadeOutVesicle.setDelay(Duration.millis(100));
					fadeOutVesicle.setFromValue(1);
					fadeOutVesicle.setToValue(0);
					fadeOutVesicle.setOnFinished(e3 -> {
						FadeTransition fadeInHBoxAcid = new FadeTransition(Duration.millis(1200), hbAcid);
						fadeInHBoxAcid.setDelay(Duration.millis(100));
						fadeInHBoxAcid.setFromValue(0);
				        fadeInHBoxAcid.setToValue(1);
				        fadeInHBoxAcid.setOnFinished(e4 -> {
				        	btnReplay.setVisible(true);
				        });
						fadeInHBoxAcid.play();
					});
					fadeOutVesicle.play();
				});
				fadeInVesicle.play();
			});
			fadeOutOverview.play();
		});
		transition.play();
	}

}