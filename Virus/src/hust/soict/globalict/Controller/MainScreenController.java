package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import hust.soict.globalict.Virus.VirusEnvelope.*;
import hust.soict.globalict.Virus.VirusNonEnvelope.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class MainScreenController implements Initializable{
	protected HIV hiv;
	protected Covid19 covid;
	protected Herpes herpes;
	protected Rota rota;
	protected Astro astro;
	protected Adeno adeno;
	//protected JFrame jFrame;

	public MainScreenController(HIV hiv, Covid19 covid, Herpes herpes, Rota rota, Astro astro, Adeno adeno) {
		this.hiv = hiv;
		this.covid = covid;
		this.herpes = herpes;
		this.rota = rota;
		this.astro = astro;
		this.adeno = adeno;
		//this.jFrame = jFrame;

	}

    @FXML
    private Button virusWithoutEnvelopeBtn;
    
    @FXML
    private Button virusWithEnvelopeBtn;

    @FXML
    private Button quitBtn;

    @FXML
    private Button helpBtn;
    
    @FXML
    private Button hivBtn;

    @FXML
    private Button covid19Btn;

    @FXML
    private Button rotaBtn;
    
    @FXML
    private Button adenoBtn;

    @FXML
    private Button astroBtn;
    
    @FXML
    private Button herpesBtn;
    
    @FXML
    private Button returnBtn;

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
    	hiv.infecting();
    }

    @FXML
    void covid19Btn(ActionEvent event) {
    	covid.infecting();
    }

    @FXML
    void herpesBtn(ActionEvent event) {
    	herpes.infecting();
    }

    @FXML
    void rotaBtn(ActionEvent event) {
    	rota.infecting();
    }

    @FXML
    void astroBtn(ActionEvent event) {
    	adeno.infecting();
    }

    @FXML
    void adenoBtn(ActionEvent event) {
    	astro.infecting();
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
