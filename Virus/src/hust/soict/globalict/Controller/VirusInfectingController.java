package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import hust.soict.globalict.Virus.Virus;
import hust.soict.globalict.Virus.VirusEnvelope.VirusWithEnvelope;
import hust.soict.globalict.Virus.VirusNonEnvelope.VirusWithoutEnvelope;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
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
import javafx.util.Duration;

public class VirusInfectingController extends VirusController implements Initializable {
	private ImageView virusOverview, virusCovered, virusKernel, acid;
	@FXML
    private Button btnStep1, btnStep2, btnStep3, btnStep4, btnStep5, btnReset;
	@FXML
    private ImageView virusEnvelopeKernel, virusNonEnvelopeKernel, virusEnvelopeOverview, virusNonEnvelopeOverview, virusEnvelopeOnly,
    					virusAndEnvelope, virusNonEnvelopeAndEnvelope, cell, cell1, acidNonE, acidE;
	@FXML
    private AnchorPane apVirusEnvelopeInfection, apVirusNonEnvelopeInfection;
	@FXML
    private Label lbTypeOfVirus;
    @FXML
    private TextArea descTf;
    String overviewWithEnvelope = "Direct fusion:\n"
			+ "The viral nucleocapsids enter the cell by the fusion between viral envelope and plasma membrane. "
			+ "Direct fusion, as its name implies, is a mechanism in which two membranes (ie: the viral envelope and cell membrane) fuse. In this case, the viral nucleocapsid is directly delivered to the cytoplasm, leaving the viral envelope behind on the plasma membrane.";
	String overviewWithoutEnvelope = "Receptor-mediated endocytosis:\n"
			+ "A component of viral nucleocapsid triggers the lysis of endosomal membrane necessary for the release of the viral genome to the cytoplasm.";

	public VirusInfectingController(Virus virus, JFrame jFrame) {
		super(virus, jFrame);
		// TODO Auto-generated constructor stub
	}

	public VirusInfectingController(Button btViewInfecting, Button btViewStructure, Button btBack,
			Button btViewInfectingDetail) {
		super(btViewInfecting, btViewStructure, btBack, btViewInfectingDetail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cell1.setOpacity(0);
		virusEnvelopeOnly.setOpacity(0);
		lbTypeOfVirus.setText("Infection of " + virus.getVirusName());
		descTf.setWrapText(true);
		if (virus instanceof VirusWithEnvelope) {
			apVirusEnvelopeInfection.setVisible(true);
			apVirusNonEnvelopeInfection.setVisible(false);
			virusOverview = virusEnvelopeOverview;
			virusCovered = virusAndEnvelope;
			virusKernel = virusEnvelopeKernel;
			acid = acidE;
			descTf.setText(overviewWithEnvelope);
		}
		else if (virus instanceof VirusWithoutEnvelope) {
			apVirusEnvelopeInfection.setVisible(false);
			apVirusNonEnvelopeInfection.setVisible(true);
			virusOverview = virusNonEnvelopeOverview;
			virusCovered = virusNonEnvelopeAndEnvelope;
			virusKernel = virusNonEnvelopeKernel;
			acid = acidNonE;
			descTf.setText(overviewWithoutEnvelope);
		}
		virusKernel.setOpacity(0);
		virusCovered.setOpacity(0);
		acid.setOpacity(0);
		handleSideBar();
	}
	
	@FXML
	void btnStep1Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
		transition.setToX(450);
		transition.setToY(180);
		transition.setNode(virusOverview);
		transition.setDuration(Duration.seconds(3));
		ScaleTransition scaleVirusOverview = new ScaleTransition(Duration.millis(3000), virusOverview);
		scaleVirusOverview.setDelay(Duration.millis(500));
		scaleVirusOverview.setToX(1.5);
		scaleVirusOverview.setToY(1.5);
		scaleVirusOverview.play();
		transition.play();
		descTf.setText("Entry:\nThe virus infects in to our bodies and approaches the target cells.");
	}

	@FXML
	void btnStep2Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
    	transition.setNode(virusOverview);
    	transition.setToY(330);
    	transition.setDuration(Duration.millis(2500));
    	Timeline fadeOutCell = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell.opacityProperty(), 0.0)));
    	Timeline fadeInCell1 = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell1.opacityProperty(), 1.0)));
    	fadeOutCell.setDelay(Duration.millis(800));
    	fadeInCell1.setDelay(Duration.millis(800));
    	fadeOutCell.play();
    	fadeInCell1.play();
    	transition.play();
    	descTf.setText("Attachment:\nThe virus attaches itself to the host-cell.");
	}

	@FXML
	void btnStep3Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
    	transition.setNode(virusOverview);
    	transition.setByY(80);
    	transition.setDuration(Duration.millis(1500));
    	transition.play();
    	TranslateTransition transitionVirusAndEnvelope = new TranslateTransition();
    	transitionVirusAndEnvelope.setNode(virusCovered);
    	transitionVirusAndEnvelope.setByY(65);
    	transitionVirusAndEnvelope.setDuration(Duration.millis(1800));
    	transitionVirusAndEnvelope.setDelay(Duration.millis(300));
    	transitionVirusAndEnvelope.play();
    	Timeline fadeOutVirusOverview = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(virusOverview.opacityProperty(), 0.0)));
    	fadeOutVirusOverview.play();
    	Timeline fadeInCell = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell.opacityProperty(), 1.0)));
    	fadeInCell.setDelay(Duration.millis(800));
    	fadeInCell.play();
    	Timeline fadeOutCell1 = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell1.opacityProperty(), 0.0)));
    	fadeOutCell1.setDelay(Duration.millis(800));
    	fadeOutCell1.play();
    	Timeline fadeInVirusAndEnvelope = new Timeline(new KeyFrame(Duration.millis(2000), new KeyValue(virusCovered.opacityProperty(), 1.0)));
    	fadeInVirusAndEnvelope.setDelay(Duration.millis(500));
    	fadeInVirusAndEnvelope.play();
    	descTf.setText("Penetration:\nThe virus is brought into the target cell.");
	}

	@FXML
	void btnStep4Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		Timeline fadeOutVirusAndEnvelope = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(virusCovered.opacityProperty(), 0.0)));
    	fadeOutVirusAndEnvelope.play();
    	Timeline fadeInVirusEnvelopeOnly = new Timeline(new KeyFrame(Duration.millis(500), new KeyValue(virusEnvelopeOnly.opacityProperty(), 1.0)));
    	fadeInVirusEnvelopeOnly.play();
    	Timeline fadeInVirusKernel = new Timeline(new KeyFrame(Duration.millis(1500), new KeyValue(virusKernel.opacityProperty(), 1.0)));
    	fadeInVirusKernel.play();
    	TranslateTransition transitionKernel = new TranslateTransition();
    	transitionKernel.setNode(virusEnvelopeKernel);
    	transitionKernel.setToX(250);
    	transitionKernel.setDuration(Duration.millis(2500));
    	transitionKernel.play();
    	descTf.setText("Uncoating:\nThe virus loses its envelope (if it is enveloped) or capsid (if it is non-enveloped).");
	}
	
	@FXML
	void btnStep5Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		Timeline fadeOutVirusKernel = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(virusKernel.opacityProperty(), 0.0)));
		fadeOutVirusKernel.play();
		Timeline fadeInAcid = new Timeline(new KeyFrame(Duration.millis(1250), new KeyValue(acid.opacityProperty(), 1.0)));
		fadeInAcid.play();
		ScaleTransition scaleAcid = new ScaleTransition(Duration.millis(1500), acid);
		scaleAcid.setDelay(Duration.millis(500));
		scaleAcid.setToX(3);
		scaleAcid.setToY(3);
		scaleAcid.play();
		descTf.setText("Replication, Assembly and Release:\n"
				+ "Viral RNA is released into the nucleus, where it is replicated and assembled. Finally, new viral particles are released.");
	}

	@FXML
	void btnResetPressed(ActionEvent event) {
		// TODO Auto-generated method stub
		cell.setOpacity(1);
    	cell1.setOpacity(0);
		virusKernel.setOpacity(0);
		virusKernel.setTranslateX(0);
		virusKernel.setTranslateY(0);
		virusCovered.setOpacity(0);
		virusOverview.setOpacity(1);
		virusEnvelopeOnly.setOpacity(0);
		acid.setOpacity(0);
		ScaleTransition scaleAcid = new ScaleTransition(Duration.millis(1), acid);
		scaleAcid.setToX(1);
		scaleAcid.setToY(1);
		scaleAcid.play();
		ScaleTransition scaleVirusOverview = new ScaleTransition(Duration.millis(1), virusOverview);
		scaleVirusOverview.setToX(1);
		scaleVirusOverview.setToY(1);
		scaleVirusOverview.play();
		virusOverview.setTranslateX(0);
		virusOverview.setTranslateY(0);
		virusCovered.setTranslateX(0);
		virusCovered.setTranslateY(0);
		if (virus instanceof VirusWithEnvelope) {
			descTf.setText(overviewWithEnvelope);
		}
		else if (virus instanceof VirusWithoutEnvelope) {
			descTf.setText(overviewWithoutEnvelope);
		}
	}
}
