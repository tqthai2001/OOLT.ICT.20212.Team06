package hust.soict.globalict.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import hust.soict.globalict.Test.StructureScreen;
import hust.soict.globalict.Virus.Covid19;
import hust.soict.globalict.Virus.Element;
import hust.soict.globalict.Virus.HIV;
import hust.soict.globalict.Virus.VirusWithEnvelope;
import hust.soict.globalict.Virus.VirusWithoutEnvelope;
import javafx.scene.image.Image;

public class MainMenu {
	public static void main(String[] args) throws Exception {
		//HIV
		 String HIV_infect = "Body fluids, Sex, Mother to child, Blood";
		 InputStream input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_acidnucleic.png");
			Image HIV_acidnucleic_img = new Image(input);
			Element HIV_acidnucleic = new Element("Acid Nucleic", HIV_acidnucleic_img,"HIV virus contains two copies of single-stranded RNA (ssRNA), which are transcribed into double-stranded DNA (dsDNA) by a complex reverse transcription process.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_capsid.png");
			Image HIV_capsid_img = new Image(input);  
			Element HIV_capsid = new Element("Capsid", HIV_capsid_img, "The capsid (CA) protein of HIV virus is an essential structural component of a virion and facilitates many crucial life cycle steps through interactions with host cell factors.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_envelope.png");
			Image HIV_envelope_img = new Image(input);  
			Element HIV_envelope = new Element("Envelope", HIV_envelope_img, "The envelope of the HIV virion consists of a glycoprotein complex, called Env, embedded in a host-sourced phospholipid membrane.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_protease.png");
			Image HIV_protease_img = new Image(input);  
			Element HIV_protease = new Element("Protease", HIV_protease_img, "HIV protease is responsible for processing of the gag and gag-pol polyproteins during virion maturation.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_integrase.png");
			Image HIV_integrase_img = new Image(input);  
			Element HIV_integrase = new Element("Integrase", HIV_integrase_img, "HIV integrase is a multidomain enzyme which is required for the integration of viral DNA into the host genome.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_tat.png");
			Image HIV_tat_img = new Image(input);  
			Element HIV_tat = new Element("Tat", HIV_tat_img, "Tat (HIV) is a regulatory protein that drastically enhances the efficiency of viral transcription.[2] Tat stands for \"Trans-Activator of Transcription.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_overview.png");
			Image HIV_overview_img =  new Image(input);
			HIV hiv = new HIV(HIV_acidnucleic, HIV_capsid, new String[] {"Fever", "Chills", "Rash", "Night sweats"}, HIV_infect, HIV_overview_img,HIV_envelope, HIV_protease, HIV_integrase, HIV_tat);

			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_acidnucleic.jpg");
			Image covid_acid_img = new Image(input);  
			Element covid_acid = new Element("Acid Nucleic", covid_acid_img, "The Acid Nucleic of COVID-19 is a single strand of positive-sense RNA. They duplicate their RNA genome using a specialized polymerase");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_capsid.jpg");
			Image covid_capsid_img = new Image(input);  
			Element covid_capsid = new Element("Capsid", covid_capsid_img, "The nucleocapsid of COVID-19, made up of a protein shell known as a capsid and containing the viral nucleic acids, is helical or tubular.");
//COVID19
			String Covid_infect = "Body Fluids, Air";
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_envelope.png");
			Image covid_envelope_img = new Image(input);  
			Element covid_envelope = new Element("Envelope", covid_envelope_img, "The envelope of COVID-19, forms a homopentameric cation channel that is important for virus pathogenicity");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_eprotein.jpg");
			Image covid_eprotein_img = new Image(input);  
			Element covid_eprotein = new Element("Eprotein", covid_eprotein_img, "E-protein is a small integral membrane protein, which together with Matrix/Membrane (M) and Spike(S) proteins, constitute coronaviruses’ interface to the external environment.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_Mprotein.jpg");
			Image covid_Mprotein_img = new Image(input);  
			Element covid_Mprotein = new Element("Mprotein", covid_Mprotein_img, "The viral membrane proteins (M-protein) often resemble their host counter-parts in the structure and functions");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_spike.jpg");
			Image covid_spike_img = new Image(input);  
			Element covid_spike = new Element("Spike", covid_spike_img, "Coronavirus spike protein binds to receptors on cell surfaces, and is a target for vaccine development.");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_he.jpg");
			Image covid_he_img = new Image(input);  
			Element covid_he = new Element("He", covid_he_img, "HEs is a glycoprotein that certain enveloped viruses possess and use as an invading mechanism. HEs helps in the attachment and destruction of certain sialic acid receptors that are found on the host cell surface");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_overview.png");
			Image covid_overview_img = new Image(input);
			
			Covid19 covid = new Covid19(covid_acid, covid_capsid, new String[] {"Fever","Cough","Tired", "Loss of taste or smell", "Headache", "Shortness of breath"}, Covid_infect, covid_overview_img, covid_envelope, covid_Mprotein, covid_eprotein, covid_he, covid_spike);
		new StructureScreen(hiv);
		new StructureScreen(covid);
	}
}