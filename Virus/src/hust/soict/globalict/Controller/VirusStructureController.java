package hust.soict.globalict.Controller;

import hust.soict.globalict.Virus.*;
import hust.soict.globalict.Virus.Element.Element;
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
    	lbStructure.setText("Structure of " + virus.getVirusName());
    	imgStructure.setImage(virus.getImageOverview());
    	centerImage(imgStructure);
    	taDesc.setText(virus.getDetail());
    	virus.getStructure(imgStructure, taDesc, hbElement);
	    handleSideBar();
    }
    
    public static void centerImage(ImageView imgStructure) {
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
