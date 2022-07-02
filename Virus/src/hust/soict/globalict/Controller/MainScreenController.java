package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import hust.soict.globalict.Screen.StructureScreen;
import hust.soict.globalict.Virus.VirusEnvelope.*;
import hust.soict.globalict.Virus.VirusNonEnvelope.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class MainScreenController implements Initializable {
	private HIV hiv;
	private Covid19 covid;
	private Herpes herpes;
	private Rota rota;
	private Astro astro;
	private Adeno adeno;
	private JFrame jFrame;

	public MainScreenController(HIV hiv, Covid19 covid, Herpes herpes, Rota rota, Astro astro, Adeno adeno, JFrame jFrame) {
		this.hiv = hiv;
		this.covid = covid;
		this.herpes = herpes;
		this.rota = rota;
		this.astro = astro;
		this.adeno = adeno;
		this.jFrame = jFrame;
	}

    @FXML
    private Button virusWithoutEnvelopeBtn, virusWithEnvelopeBtn, quitBtn, helpBtn, hivBtn, covid19Btn,
    		rotaBtn, adenoBtn, astroBtn, herpesBtn, returnBtn;

    @FXML
    void virusWithEnvelopeBtnPressed(ActionEvent event) {
    	hivBtn.setVisible(true);
    	covid19Btn.setVisible(true);
    	herpesBtn.setVisible(true);
    	returnBtn.setVisible(true);
    	virusWithoutEnvelopeBtn.setVisible(false);
    	virusWithEnvelopeBtn.setVisible(false);
    }

    @FXML
    void virusWithoutEnvelopeBtnPressed(ActionEvent event) {
    	rotaBtn.setVisible(true);
    	astroBtn.setVisible(true);
    	adenoBtn.setVisible(true);
    	returnBtn.setVisible(true);
    	virusWithoutEnvelopeBtn.setVisible(false);
    	virusWithEnvelopeBtn.setVisible(false);
    }

    @FXML
    void helpBtnPressed(ActionEvent event) {
    }

    @FXML
    void quitBtn(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit");
    	alert.setHeaderText("Application Closing");
    	alert.setContentText("Do you want to quit?");
    	
    	if (alert.showAndWait().get() == ButtonType.OK){
    		System.exit(0);
    	} 
    }

    @FXML
    void hivBtnPressed(ActionEvent event) {
    	new StructureScreen(hiv, jFrame);
    }

    @FXML
    void covid19Btn(ActionEvent event) {
    	new StructureScreen(covid, jFrame);
    }

    @FXML
    void herpesBtn(ActionEvent event) {
    	new StructureScreen(herpes, jFrame);
    }

    @FXML
    void rotaBtn(ActionEvent event) {
    	new StructureScreen(rota, jFrame);
    }

    @FXML
    void astroBtn(ActionEvent event) {
    	new StructureScreen(astro, jFrame);
    }

    @FXML
    void adenoBtn(ActionEvent event) {
    	new StructureScreen(adeno, jFrame);
    }
    
    @FXML
    void returnBtnPressed(ActionEvent event) {
    	hivBtn.setVisible(false);
    	covid19Btn.setVisible(false);
    	herpesBtn.setVisible(false);
    	rotaBtn.setVisible(false);
    	astroBtn.setVisible(false);
    	adenoBtn.setVisible(false);
    	returnBtn.setVisible(false);
    	virusWithoutEnvelopeBtn.setVisible(true);
    	virusWithEnvelopeBtn.setVisible(true);
    }
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	hivBtn.setVisible(false);
    	covid19Btn.setVisible(false);
    	herpesBtn.setVisible(false);
    	rotaBtn.setVisible(false);
    	astroBtn.setVisible(false);
    	adenoBtn.setVisible(false);
    	returnBtn.setVisible(false);
    }
}
