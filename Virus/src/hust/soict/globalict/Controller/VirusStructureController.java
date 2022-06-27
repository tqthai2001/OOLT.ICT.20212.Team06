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
import javafx.event.EventHandler;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JFrame;

public class VirusStructureController extends VirusController implements Initializable{
	private ArrayList<Button> btnElement = new ArrayList<Button>();

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
    	imgStructure.setImage(virus.getImage_overview());
        taDesc.setText(virus.getDetail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	lbStructure.setText("Structure of " + virus.getClass().getSimpleName());
    	imgStructure.setImage(virus.getImage_overview());
    	imgStructure.setX(240);
    	taDesc.setText(virus.getDetail());
   // Iterator iterator = virus.getElements().iterator();
	    for (Element element : virus.getElements()) {	
	    	Button b = new Button(element.getName());
	    	hbElement.getChildren().add(b);
	    	b.setOnAction((ActionEvent)->{
	    		imgStructure.setImage(element.getImage());
	    		imgStructure.fitHeightProperty();
	    		imgStructure.fitWidthProperty();
	    		taDesc.setWrapText(true);
	    	    taDesc.setText(element.getDesc());
	        });
	    }
	    handleSideBar();
    }
}
