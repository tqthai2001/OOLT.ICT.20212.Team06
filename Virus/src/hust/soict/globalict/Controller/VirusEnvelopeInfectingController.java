package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class VirusEnvelopeInfectingController extends VirusController implements Initializable {
	@FXML
    protected Button btnStep1, btnStep2, btnStep3, btnStep4, btnReset;
	@FXML
    private ImageView virusEnvelopeKernel, virusEnvelopeOverview, virusAndEnvelope, cell, cell1;
	@FXML
    private AnchorPane apVirusEnvelopeInfection, apVirusNonEnvelopeInfection;
	@FXML
    protected Label lbTypeOfVirus;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cell1.setOpacity(0);
		virusEnvelopeKernel.setOpacity(0);
		virusAndEnvelope.setOpacity(0);
		lbTypeOfVirus.setText("Infection of Envelope Virus");
		apVirusNonEnvelopeInfection.setVisible(false);
		apVirusEnvelopeInfection.setVisible(true);
	}
	
	@FXML
	void btnStep1Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
		transition.setToX(450);
		transition.setToY(180);
		transition.setNode(virusEnvelopeOverview);
		transition.setDuration(Duration.seconds(3));
		ScaleTransition scaleVirusOverview = new ScaleTransition(Duration.millis(3000), virusEnvelopeOverview);
		scaleVirusOverview.setDelay(Duration.millis(500));
		scaleVirusOverview.setToX(1.5);
		scaleVirusOverview.setToY(1.5);
		scaleVirusOverview.play();
		transition.play();
	}

	@FXML
	void btnStep2Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
    	transition.setNode(virusEnvelopeOverview);
    	transition.setByY(150);
    	transition.setDuration(Duration.millis(2500));
    	Timeline fadeOutCell = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell.opacityProperty(), 0.0)));
    	Timeline fadeInCell1 = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell1.opacityProperty(), 1.0)));
    	fadeOutCell.setDelay(Duration.millis(800));
    	fadeInCell1.setDelay(Duration.millis(800));
    	fadeOutCell.play();
    	fadeInCell1.play();
    	transition.play();
	}

	@FXML
	void btnStep3Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		TranslateTransition transition = new TranslateTransition();
    	transition.setNode(virusEnvelopeOverview);
    	transition.setByY(80);
    	transition.setDuration(Duration.millis(1500));
    	transition.play();
    	TranslateTransition transitionVirusAndEnvelope = new TranslateTransition();
    	transitionVirusAndEnvelope.setNode(virusAndEnvelope);
    	transitionVirusAndEnvelope.setByY(65);
    	transitionVirusAndEnvelope.setDuration(Duration.millis(1800));
    	transitionVirusAndEnvelope.setDelay(Duration.millis(300));
    	transitionVirusAndEnvelope.play();
    	Timeline fadeOutVirusOverview = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(virusEnvelopeOverview.opacityProperty(), 0.0)));
    	fadeOutVirusOverview.play();
    	Timeline fadeInCell = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell.opacityProperty(), 1.0)));
    	fadeInCell.setDelay(Duration.millis(800));
    	fadeInCell.play();
    	Timeline fadeOutCell1 = new Timeline(new KeyFrame(Duration.millis(1200), new KeyValue(cell1.opacityProperty(), 0.0)));
    	fadeOutCell1.setDelay(Duration.millis(800));
    	fadeOutCell1.play();
    	Timeline fadeInVirusAndEnvelope = new Timeline(new KeyFrame(Duration.millis(2000), new KeyValue(virusAndEnvelope.opacityProperty(), 1.0)));
    	fadeInVirusAndEnvelope.setDelay(Duration.millis(500));
    	fadeInVirusAndEnvelope.play();
	}

	@FXML
	void btnStep4Pressed(ActionEvent event) {
		// TODO Auto-generated method stub
		Timeline fadeOutVirusAndEnvelope = new Timeline(new KeyFrame(Duration.millis(2000), new KeyValue(virusAndEnvelope.opacityProperty(), 0.0)));
    	fadeOutVirusAndEnvelope.play();
    	Timeline fadeInVirusKernel = new Timeline(new KeyFrame(Duration.millis(2000), new KeyValue(virusEnvelopeKernel.opacityProperty(), 1.0)));
    	fadeInVirusKernel.play();
	}

	@FXML
	void btnResetPressed(ActionEvent event) {
		// TODO Auto-generated method stub
		cell.setOpacity(1);
    	cell1.setOpacity(0);
		virusEnvelopeKernel.setOpacity(0);
		virusAndEnvelope.setOpacity(0);
		virusEnvelopeOverview.setOpacity(1);
		ScaleTransition scaleVirusOverview = new ScaleTransition(Duration.millis(1), virusEnvelopeOverview);
		scaleVirusOverview.setToX(1);
		scaleVirusOverview.setToY(1);
		scaleVirusOverview.play();
		virusEnvelopeOverview.setTranslateX(0);
		virusEnvelopeOverview.setTranslateY(0);
		virusAndEnvelope.setTranslateX(0);
		virusAndEnvelope.setTranslateY(0);
	}
}
