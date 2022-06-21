package hust.soict.globalict;

import hust.soict.globalict.Database.Database;
import hust.soict.globalict.Virus.*;
import java.util.*;
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
//import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;

public class VirusMain {

	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(System.in);
		Image HIV_acidnucleic_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_acidnucleic.png"));  
		Element HIV_acidnucleic = new Element(HIV_acidnucleic_img, "HIV_acidnucleic description");
		Image HIV_capsid_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_capsid.png"));  
		Element HIV_capsid = new Element(HIV_capsid_img, "HIV_capsid description");
		Image HIV_envelope_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_envelope.png"));  
		Element HIV_envelope = new Element(HIV_envelope_img, "HIV_envelope description");
		Image HIV_protease_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_protease.png"));  
		Element HIV_protease = new Element(HIV_protease_img, "HIV_protease description");
		Image HIV_integrase_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_integrase.png"));  
		Element HIV_integrase = new Element(HIV_integrase_img, "HIV_integrase description");
		Image HIV_tat_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_tat.png"));  
		Element HIV_tat = new Element(HIV_tat_img, "HIV_tat description");
		Image HIV_overview_img = new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\2021 - 2\\OOLT.ICT.20212.Team06\\Virus\\src\\hust\\soict\\globalict\\Assets\\HIV_overview.png"));  
		HIV hiv = new HIV(HIV_acidnucleic, HIV_capsid, HIV_envelope, new String[] {"Fever", "Chills", "Rash", " Night sweats"}, HIV_protease, HIV_integrase, HIV_tat, HIV_overview_img);

		}
}



