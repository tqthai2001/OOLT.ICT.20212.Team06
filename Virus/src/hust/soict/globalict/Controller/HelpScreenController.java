package hust.soict.globalict.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import hust.soict.globalict.Screen.MainScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelpScreenController implements Initializable {
	private ArrayList<Image> listOfImages = new ArrayList<Image>();
	private static int i = 0;
	private JFrame jFrame;
    @FXML
    private ImageView helpImg;
    
    public HelpScreenController(JFrame jFrame) {
		// TODO Auto-generated constructor stub
    	this.jFrame = jFrame;
	};

    @FXML
    void previousBtnPressed(ActionEvent event) {
    	if (i==0) {
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
    		i = -1;
    	}
		if (i<listOfImages.size()) {
			i++;
	    	helpImg.setImage(listOfImages.get(i));
		}
    }
    
    @FXML
    void backBtnPressed(ActionEvent event) {
    	jFrame.setVisible(false);
    	new MainScreen(jFrame);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/MainScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/VirusWithEnvelopeScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/VirusWithoutEnvelopeScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/VirusOverviewScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/VirusElementScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/GeneralInfectingScreenHelp.png")));
    	listOfImages.add(new Image(getClass().getResourceAsStream("../Assets/HelpScreen/InfectingScreenHelp.png")));
    	helpImg.setImage(listOfImages.get(0));
    	helpImg.setX(100);
    }
}
