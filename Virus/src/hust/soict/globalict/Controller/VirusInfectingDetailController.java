package hust.soict.globalict.Controller;

import java.awt.HeadlessException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import hust.soict.globalict.Virus.Virus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

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
		virus.infect(detailedDescTf, overview, envelope, capsid, hbAcid, btnReplay);
    }

	public VirusInfectingDetailController(Virus virus, JFrame jFrame) throws HeadlessException {
		super(virus, jFrame);
		// TODO Auto-generated constructor stub
	}
}
