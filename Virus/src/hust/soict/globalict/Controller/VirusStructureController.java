package hust.soict.globalict.Controller;

import hust.soict.globalict.Virus.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

import hust.soict.globalict.Virus.Virus;

public class VirusStructureController implements Initializable{
	protected Virus virus;
	//construct
	public VirusStructureController(Virus virus) {
		super();
        this.virus = virus;
    }
	@FXML
    private Button btViewInfecting, btViewStructure, btBack;
    @FXML
    private AnchorPane apVirusStructure;

    @FXML
    private TextArea taDesc;

    @FXML
    private ImageView imgStructure;

    @FXML
    private HBox hbElement;

    @FXML
    private Button btnOverview;

    @FXML
    void btnOverviewPressed(ActionEvent event) {
    	imgStructure.setImage(virus.getImage_overview());
        taDesc.setText(virus.getDetail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    imgStructure = new ImageView(virus.getImage_overview());
   // imgStructure.setImage(virus.getImage_overview());
    taDesc.setText(virus.getDetail());
    }


}
