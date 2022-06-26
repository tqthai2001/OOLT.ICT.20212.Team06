package hust.soict.globalict;

import hust.soict.globalict.Virus.*;
import hust.soict.globalict.Controller.*;
import java.util.*;
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class VirusMain extends Application {
	
	public Virus hiv = new Virus();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 try {
	            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("./Screen/structure.fxml"));
	            VirusStructureController controller = new VirusStructureController(hiv);
	            fxmlloader.setController(controller);
	            Parent root = fxmlloader.load();
	            Scene scene = new Scene(root);
	            primaryStage.setTitle("VIRUS");
	            primaryStage.setScene(scene);
	            primaryStage.show();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	public static void main(String[] args) throws Exception{

		InputStream input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_acidnucleic.png");
		Image HIV_acidnucleic_img = new Image(input);
		Element HIV_acidnucleic = new Element(HIV_acidnucleic_img,"HIV virus contains two copies of single-stranded RNA (ssRNA), which are transcribed into double-stranded DNA (dsDNA) by a complex reverse transcription process.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_capsid.png");
		Image HIV_capsid_img = new Image(input);  
		Element HIV_capsid = new Element(HIV_capsid_img, "The capsid (CA) protein of HIV virus is an essential structural component of a virion and facilitates many crucial life cycle steps through interactions with host cell factors.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_envelope.png");
		Image HIV_envelope_img = new Image(input);  
		Element HIV_envelope = new Element(HIV_envelope_img, "The envelope of the HIV virion consists of a glycoprotein complex, called Env, embedded in a host-sourced phospholipid membrane.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_protease.png");
		Image HIV_protease_img = new Image(input);  
		Element HIV_protease = new Element(HIV_protease_img, "HIV protease is responsible for processing of the gag and gag-pol polyproteins during virion maturation.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_integrase.png");
		Image HIV_integrase_img = new Image(input);  
		Element HIV_integrase = new Element(HIV_integrase_img, "HIV integrase is a multidomain enzyme which is required for the integration of viral DNA into the host genome.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_tat.png");
		Image HIV_tat_img = new Image(input);  
		Element HIV_tat = new Element(HIV_tat_img, "Tat (HIV) is a regulatory protein that drastically enhances the efficiency of viral transcription.[2] Tat stands for \"Trans-Activator of Transcription.");
		
		input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_overview.png");
		Image HIV_overview_img =  new Image(input);
		
		HIV hiv = new HIV(HIV_acidnucleic, HIV_capsid, new String[] {"Fever", "Chills", "Rash", "Night sweats"},HIV_envelope, HIV_protease, HIV_integrase, HIV_tat, HIV_overview_img);

		launch(args);
		
		}
}



