package hust.soict.globalict.Controller;

import java.awt.HeadlessException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.VirusEnvelope.VirusWithEnvelope;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class VirusInfectingDetailController extends VirusController implements Initializable {
	@FXML
    private ImageView capsid, envelope, hostcell, overview;
    @FXML
    private AnchorPane apMain;
    @FXML
    private Button btnPlay, btnReplay;
    @FXML
    private Label lbNameVirus;
    @FXML
    private HBox hbAcid;
    @FXML
    private TextArea detailedDescTf;
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lbNameVirus.setText("Infection of " + virus.getVirusName());
		overview.setImage(virus.getImageOverview());
		envelope.setOpacity(0);
		hbAcid.setOpacity(0);
		capsid.setOpacity(0);
		btnPlay.setVisible(true);
		btnReplay.setVisible(false);
		handleSideBar();
		for (int i = 0; i < virus.getAcidNucleic().getNumCopy(); i++) {
			ImageView acid = new ImageView();
			acid.setImage(virus.getAcidNucleic().getImage());
			acid.setFitWidth(80);
			acid.setPreserveRatio(true);
			hbAcid.getChildren().add(acid);
		}
	}
	
//		if (virus instanceof VirusWithEnvelope) {
//			detailedDescTf.setText("The virus attacks the cell. The capsid separates from the envelope. Then the capsid is dissolved and the"
//					+ " nucleic acid remains. The number of nucleic acids copied depends on the virus type.");
//		}
//		else {
//			detailedDescTf.setText("The virus attacks the cell. Since the virus has no envelope, it can't fuse with the cell membrane."
//					+ " After being enclosed by the cell membrane and penetrate the cell. The capsid separates from the envelope."
//					+ " Then the capsid is dissolved and the nucleic acid remains. The number of nucleic acids copied depends on the virus type.");
//		}
//		for (int i = 0; i < virus.getAcidNucleic().getNumCopy(); i++) {
//			ImageView acid = new ImageView();
//			acid.setImage(virus.getAcidNucleic().getImage());
//			acid.setFitWidth(80);
//			acid.setPreserveRatio(true);
//			hbAcid.getChildren().add(acid);
//		}
//		if (virus instanceof VirusWithEnvelope) {
//			capsid.setImage(virus.getCapsid().getImage());
//			envelope.setImage(((VirusWithEnvelope) virus).getEnvelope().getImage());
//		}
	
//    private void processInfection() {
//    	TranslateTransition transition = new TranslateTransition();
//    	transition.setNode(overview);
//    	transition.setDelay(Duration.millis(500));
//    	transition.setToX(450);
//		transition.setToY(400);
//		transition.setDuration(Duration.seconds(3));
//		transition.setOnFinished(e -> {
//			FadeTransition fadeOutOverview = new FadeTransition(Duration.millis(1200), overview);
//			fadeOutOverview.setDelay(Duration.millis(100));
//			fadeOutOverview.setFromValue(1);
//			fadeOutOverview.setToValue(0);
//			fadeOutOverview.setOnFinished(e1 -> {
//				Timeline fadeInEnvelope = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(envelope.opacityProperty(), 1.0)));
//				fadeInEnvelope.play();
//				Timeline fadeInCapsid = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(capsid.opacityProperty(), 1.0)));
//				fadeInCapsid.setOnFinished(e2 -> {
//					FadeTransition fadeInHBoxAcid = new FadeTransition(Duration.millis(1500), hbAcid);
//					fadeInHBoxAcid.setDelay(Duration.millis(100));
//					fadeInHBoxAcid.setFromValue(0);
//			        fadeInHBoxAcid.setToValue(1);
//			        fadeInHBoxAcid.setOnFinished(e3 -> {
//			        	btnReplay.setVisible(true);
//			        });
//					fadeInHBoxAcid.play();
//					FadeTransition fadeOutCapsid = new FadeTransition(Duration.millis(1500), capsid);
//					fadeOutCapsid.setDelay(Duration.millis(100));
//			        fadeOutCapsid.setFromValue(1);
//			        fadeOutCapsid.setToValue(0);
//			        fadeOutCapsid.play();
//				});
//				fadeInCapsid.play();
//			});
//			fadeOutOverview.play();
//		});
//		transition.play();
//	}
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	btnPlay.setVisible(false);
    	//processInfection();
    	virus.infect(detailedDescTf, overview, envelope, capsid, hbAcid, btnReplay);
    }

    @FXML
    void btnReplayPressed(ActionEvent event) {
    	btnReplay.setVisible(false);
    	envelope.setOpacity(0);
		hbAcid.setOpacity(0);
		capsid.setOpacity(0);
		overview.setOpacity(1);
		overview.setTranslateX(0);
		overview.setTranslateY(0);
		//processInfection();
		virus.infect(detailedDescTf, overview, envelope, capsid, hbAcid, btnReplay);
    }


	public VirusInfectingDetailController(Virus virus, JFrame jFrame) throws HeadlessException {
		super(virus, jFrame);
		// TODO Auto-generated constructor stub
	}
}
