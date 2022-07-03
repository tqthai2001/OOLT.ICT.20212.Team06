package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelpScreenController implements Initializable{
	private ArrayList<Image> listOfImages = new ArrayList<Image>();
	int i = 0;
    @FXML
    private ImageView helpImg;

    @FXML
    private Button previousBtn;

    @FXML
    private Button nextBtn;

    @FXML
    void previousBtnPressed(ActionEvent event) {
    	if (i<=0) {
    		i = listOfImages.size();
    	}
    	if (i>0) {
    		i--;
        	helpImg.setImage(listOfImages.get(i));
    	}
    }

    @FXML
    void nextBtnPressed(ActionEvent event) {
    	if (i == listOfImages.size()-1) {
    		i = 0;
    	}
	if (i<listOfImages.size()) {
		i++;
    	helpImg.setImage(listOfImages.get(i));
	}
}

    	
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/MainScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/VirusWithEnvelopeScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/VirusWithoutEnvelopeScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/VirusOverviewScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/VirusElementScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/GeneralInfectingScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/Help Screen/InfectingScreenHelp.png")));
    	helpImg.setImage(listOfImages.get(0));
    	helpImg.setX(100);
    }

}
