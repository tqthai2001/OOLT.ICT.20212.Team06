package hust.soict.globalict.Controller;

import hust.soict.globalict.Virus.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFrame;

public class VirusStructureController extends VirusController implements Initializable {
	public VirusStructureController(Virus virus, JFrame jFrame) {
		super(virus, jFrame);
    }
	
    public VirusStructureController(Button btViewInfecting, Button btViewStructure, Button btBack) {
		super(btViewInfecting, btViewStructure, btBack);
		// TODO Auto-generated constructor stub
	}
    
    @FXML
    private Label lbStructure;

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
    	imgStructure.setImage(virus.getImageOverview());
        taDesc.setText(virus.getDetail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	lbStructure.setText("Structure of " + virus.getClass().getSimpleName());
    	imgStructure.setImage(virus.getImageOverview());
    	centerImage();
    	taDesc.setText(virus.getDetail());
	    for (Element element : virus.getElements()) {	
	    	Button b = new Button(element.getName());
	    	hbElement.getChildren().add(b);
	    	b.setOnAction((ActionEvent)->{
	    		imgStructure.setImage(element.getImage());
	    		centerImage();
	    		taDesc.setWrapText(true);
	    	    taDesc.setText(element.getDesc());
	        });
	    }
	    handleSideBar();
    }
    private void centerImage() {
        Image img = imgStructure.getImage();
        if (img != null) {
            double w = 0;
            double h = 0;

            double ratioX = imgStructure.getFitWidth() / img.getWidth();
            double ratioY = imgStructure.getFitHeight() / img.getHeight();

            double reducCoeff = 0;
            if (ratioX >= ratioY) {
                reducCoeff = ratioY;
            } else {
                reducCoeff = ratioX;
            }

            w = img.getWidth() * reducCoeff;
            h = img.getHeight() * reducCoeff;

            imgStructure.setX((imgStructure.getFitWidth() - w) / 2);
            imgStructure.setY((imgStructure.getFitHeight() - h) / 2);
        }
    }
}
