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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

public class VirusStructureController implements Initializable{
	protected Virus virus;
	protected ArrayList<Button> btnElement = new ArrayList<Button>();
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
        imgStructure.setX(240);
        taDesc.setText(virus.getDetail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
	    	    taDesc.setText(element.getDesc());
	        });
	    }
    }


}
