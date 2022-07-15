package hust.soict.globalict.Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JFrame;

import hust.soict.globalict.Screen.HelpScreen;
import hust.soict.globalict.Screen.StructureScreen;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.DispensableElement;
import hust.soict.globalict.Virus.VirusEnvelope.*;
import hust.soict.globalict.Virus.VirusNonEnvelope.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class MainScreenController implements Initializable {
	private HIV hiv;
	private Covid19 covid;
	private Herpes herpes;
	private Rota rota;
	private Astro astro;
	private Adeno adeno;
	private JFrame jFrame;

	public MainScreenController(JFrame jFrame) {
		this.jFrame = jFrame;
	}

    @FXML
    private Button virusWithoutEnvelopeBtn, virusWithEnvelopeBtn, quitBtn, helpBtn, hivBtn, covid19Btn,
    		rotaBtn, adenoBtn, astroBtn, herpesBtn, returnBtn;

    @FXML
    void virusWithEnvelopeBtnPressed(ActionEvent event) {
    	hivBtn.setVisible(true);
    	covid19Btn.setVisible(true);
    	herpesBtn.setVisible(true);
    	returnBtn.setVisible(true);
    	virusWithoutEnvelopeBtn.setVisible(false);
    	virusWithEnvelopeBtn.setVisible(false);
    }

    @FXML
    void virusWithoutEnvelopeBtnPressed(ActionEvent event) {
    	rotaBtn.setVisible(true);
    	astroBtn.setVisible(true);
    	adenoBtn.setVisible(true);
    	returnBtn.setVisible(true);
    	virusWithoutEnvelopeBtn.setVisible(false);
    	virusWithEnvelopeBtn.setVisible(false);
    }

    @FXML
    void quitBtnPressed(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit");
    	alert.setHeaderText("Application Closing");
    	alert.setContentText("Do you want to quit?");
    	
    	if (alert.showAndWait().get() == ButtonType.OK){
    		System.exit(0);
    	} 
    }
    
    @FXML
    void helpBtnPressed(ActionEvent event) {
    	jFrame.setVisible(false);
    	new HelpScreen(jFrame);
    }

    @FXML
    void hivBtnPressed(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(hiv, jFrame);
    }

    @FXML
    void covid19Btn(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(covid, jFrame);
    }

    @FXML
    void herpesBtn(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(herpes, jFrame);
    }

    @FXML
    void rotaBtn(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(rota, jFrame);
    }

    @FXML
    void astroBtn(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(astro, jFrame);
    }

    @FXML
    void adenoBtn(ActionEvent event) {
    	jFrame.setVisible(false);
    	new StructureScreen(adeno, jFrame);
    }
    
    @FXML
    void returnBtnPressed(ActionEvent event) {
    	hivBtn.setVisible(false);
    	covid19Btn.setVisible(false);
    	herpesBtn.setVisible(false);
    	rotaBtn.setVisible(false);
    	astroBtn.setVisible(false);
    	adenoBtn.setVisible(false);
    	returnBtn.setVisible(false);
    	virusWithoutEnvelopeBtn.setVisible(true);
    	virusWithEnvelopeBtn.setVisible(true);
    }
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1){
    	hivBtn.setVisible(false);
    	covid19Btn.setVisible(false);
    	herpesBtn.setVisible(false);
    	rotaBtn.setVisible(false);
    	astroBtn.setVisible(false);
    	adenoBtn.setVisible(false);
    	returnBtn.setVisible(false);
		InputStream input;
		try {
	//		------------------------------ HIV ------------------------------
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_acidnucleic.png");
			Image HIV_acidnucleic_img = new Image(input);
			AcidNucleic HIV_acidnucleic = new AcidNucleic(HIV_acidnucleic_img, "HIV virus contains two copies of single-stranded RNA (ssRNA), which are transcribed into double-stranded DNA (dsDNA) by a complex reverse transcription process", "RNA", 3);
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_capsid.png");
			Image HIV_capsid_img = new Image(input);
			Capsid HIV_capsid = new Capsid(HIV_capsid_img, "The capsid (CA) protein of HIV virus is an essential structural component of a virion and facilitates many crucial life cycle steps through interactions with host cell factors", 1);
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_protease.png");
			Image HIV_protease_img = new Image(input);
			DispensableElement HIV_protease = new DispensableElement("Protease", HIV_protease_img, "HIV protease is responsible for processing of the gag and gag-pol polyproteins during virion maturation");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_integrase.png");
			Image HIV_integrase_img = new Image(input);  
			DispensableElement HIV_integrase = new DispensableElement("Integrase", HIV_integrase_img, "HIV integrase is a multidomain enzyme which is required for the integration of viral DNA into the host genome");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_tat.png");
			Image HIV_tat_img = new Image(input);
			DispensableElement HIV_tat = new DispensableElement("Tat", HIV_tat_img, "Tat (HIV) is a regulatory protein that drastically enhances the efficiency of viral transcription. Tat stands for \"Trans-Activator of Transcription\"");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_overview.png");
			Image HIV_overview_img = new Image(input);
			
			List<String> HIV_infect = Arrays.asList("Body fluids", "Sex", "Mother to child", "Blood");
			List<String> HIV_symptoms = Arrays.asList("Fever", "Chills", "Rash", "Night sweats");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/HIV/HIV_envelope.png");
			Image HIV_envelope_img = new Image(input);
			
			hiv = new HIV(HIV_symptoms, HIV_infect, HIV_overview_img, HIV_acidnucleic, HIV_capsid,
					"The envelope of the HIV virion consists of a glycoprotein complex, called Env, embedded in a host-sourced phospholipid membrane",
					HIV_envelope_img, HIV_protease, HIV_integrase, HIV_tat);
			
	//		------------------------------ Covid ------------------------------
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_acidnucleic.png");
			Image covid_acid_img = new Image(input);  
			AcidNucleic covid_acid = new AcidNucleic(covid_acid_img, "The Acid Nucleic of COVID-19 is a single strand of positive-sense RNA. They duplicate their RNA genome using a specialized polymerase", "RNA", 5);
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_capsid.png");
			Image covid_capsid_img = new Image(input);  
			Capsid covid_capsid = new Capsid(covid_capsid_img, "The nucleocapsid of COVID-19, made up of a protein shell known as a capsid and containing the viral nucleic acids, is helical or tubular", 1);
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_eprotein.png");
			Image covid_eprotein_img = new Image(input);
			DispensableElement covid_eprotein = new DispensableElement("E-Protein", covid_eprotein_img, "E-protein is a small integral membrane protein, which together with Matrix/Membrane (M) and Spike(S) proteins, constitute coronaviruses interface to the external environment");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_Mprotein.png");
			Image covid_Mprotein_img = new Image(input);  
			DispensableElement covid_Mprotein = new DispensableElement("M-Protein", covid_Mprotein_img, "The viral membrane proteins (M-protein) often resemble their host counter-parts in the structure and functions");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_spike.png");
			Image covid_spike_img = new Image(input);  
			DispensableElement covid_spike = new DispensableElement("Spike", covid_spike_img, "Coronavirus spike protein binds to receptors on cell surfaces, and is a target for vaccine development");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_he.png");
			Image covid_he_img = new Image(input);
			DispensableElement covid_he = new DispensableElement("He", covid_he_img, "HEs is a glycoprotein that certain enveloped viruses possess and use as an invading mechanism. HEs helps in the attachment and destruction of certain sialic acid receptors that are found on the host cell surface");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_overview.png");
			Image covid_overview_img = new Image(input);
			
			List<String> covid_infect = Arrays.asList("Body Fluids", "Air");
			List<String> covid_symptoms = Arrays.asList("Fever", "Cough", "Tired", "Loss of taste or smell", "Headache", "Shortness of breath");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Covid19/covid19_envelope.png");
			Image covid_envelope_img = new Image(input);
			
			covid = new Covid19(covid_symptoms, covid_infect, covid_overview_img, covid_acid, covid_capsid,
					"The envelope of COVID-19, forms a homopentameric cation channel that is important for virus pathogenicity",
					covid_envelope_img, covid_Mprotein, covid_eprotein, covid_he, covid_spike);
			
	//		------------------------------ Herpes ------------------------------
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_acidnucleic.png");
			Image herpes_acid_img = new Image(input);
			AcidNucleic herpes_acid = new AcidNucleic(herpes_acid_img, "The Herpes virus Acid Nucleic is DNA polymerase, which is a key enzyme in the lytic phase of the infection", "DNA", 2);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_capsid.png");
			Image herpes_capsid_img = new Image(input);  
			Capsid herpes_capsid = new Capsid(herpes_capsid_img, "Capsid of Herpes virus is icosadeltahedral, conformed of 162 capsomers", 1);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_tegument.jpg");
			Image herpes_tegument_img = new Image(input);  
			DispensableElement herpes_tegument = new DispensableElement("Tegument", herpes_tegument_img, "Herpes tegument includes proteins involved in virion morphogenesis, control of host expression machinery");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_gB.jpeg");
			Image herpes_gB_img = new Image(input);  
			DispensableElement herpes_gB = new DispensableElement("gB", herpes_gB_img, "Like all viral fusogens, gB is composed of a large extraviral or ectodomain, many aspects of gB function are both unique and incompletely understood");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_gC.jpg");
			Image herpes_gC_img = new Image(input);  
			DispensableElement herpes_gC = new DispensableElement("gC", herpes_gC_img, "Although gC is not essential for most herpesviruses studied thus far, it significantly increases the efficiency of infection by providing an additional binding mechanism5 and helps shield the virus from antibody neutralization");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_gD.jpeg");
			Image herpes_gD_img = new Image(input);  
			DispensableElement herpes_gD = new DispensableElement("gD", herpes_gD_img, "Glycoprotein D (gD) is a structural component of the herpes simplex virus (HSV) envelope which is essential for virus entry into host cells");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_gHgL.png");
			Image herpes_gHgL_img = new Image(input);  
			DispensableElement herpes_gHgL = new DispensableElement("gHgL", herpes_gHgL_img, "The unique component of herpesvirus fusion machinery, gH/gL is emerging as a complex of multiple functions: a scaffold for presenting receptor-binding proteins, an activator for gB, and a membrane manipulator");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_overview.png");
			Image herpes_overview = new Image(input);
			
			List<String> herpes_infect = Arrays.asList("Sex", "Body fluids", "Skin-touching", "Oral");
			List<String> herpes_symptoms = Arrays.asList("Fever", "Swollen lymph nodes", "Body aches and pains", "Unusual tiredness", "Lack of appetite");
			
			input = new FileInputStream("src/hust/soict/globalict/Assets/Herpes/herpes_envelope.jpg");
			Image herpes_envelope_img = new Image(input);
	
			herpes = new Herpes(herpes_symptoms, herpes_infect, herpes_overview, herpes_acid, herpes_capsid,
					"Herpes envelope is membrane of cell origin containing viral glycoproteins and membrane receptors",
					herpes_envelope_img, herpes_tegument, herpes_gB, herpes_gC, herpes_gD, herpes_gHgL);
	
	//		------------------------------ Rota ------------------------------
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_acidnucleic.png");
			Image rota_acid_img = new Image(input);  
			AcidNucleic rota_acid = new AcidNucleic(rota_acid_img, "Rotaviruses, like other non-enveloped, double-strand RNA viruses, package an RNA-dependent RNA polymerase (RdRp) with each duplex of their segmented genomes", "RNA", 2);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_capsid.png");
			Image rota_capsid_img = new Image(input);  
			Capsid rota_capsid = new Capsid(rota_capsid_img, "The rotavirus capsid consists of 11 segments and is contained in the viral core along with the minor structural proteins, VP1 and VP3", 3);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_vp1.png");
			Image rota_vp1_img = new Image(input);  
			DispensableElement rota_vp1 = new DispensableElement("Vp2", rota_vp1_img, "VP1 is active inside the double-layer particle, each VP1 achieves many rounds of mRNA transcription from its associated genome segment");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_vp3.png");
			Image rota_vp3_img = new Image(input);  
			DispensableElement rota_vp3 = new DispensableElement("Vp3", rota_vp3_img, "VP3 was necessary for the viral messenger RNA (mRNA), enabling it to mimic the host’s capped RNA and thus evade immune response");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_vp4.png");
			Image rota_vp4_img = new Image(input);  
			DispensableElement rota_vp4 = new DispensableElement("Vp4", rota_vp4_img, "VP4 spikes protein that constitute the outer capsid of a complete rotavirus particle have been shown to be independent neutralization antigens");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rota_overview.png");
			Image rota_overview = new Image(input);
			input = new FileInputStream("src/hust/soict/globalict/Assets/Rota/rotaCovered.png");
			Image rota_covered = new Image(input);
			
			List<String> rota_infect = Arrays.asList("Fecal-oral route");
			List<String> rota_symptoms = Arrays.asList("Vomiting", "Diarrhoea", "Fever", "Dry mouth");
	
			rota = new Rota(rota_symptoms, rota_infect, rota_overview, rota_covered, rota_acid, rota_capsid, rota_vp1, rota_vp3, rota_vp4);
			
	//		------------------------------ Astro ------------------------------
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astro_acid.png");
			Image astro_acid_img = new Image(input);  
			AcidNucleic astro_acid = new AcidNucleic(astro_acid_img, "Astroviruses are positive-sense, single-stranded RNA viruses. Their genomes contain three open reading frames, but the exact number of encoded proteins remains unknown", "RNA", 1);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astro_capsid.png");
			Image astro_capsid_img = new Image(input);  
			Capsid astro_capsid = new Capsid(astro_capsid_img, "The Astrovirus capsid protein undergoes dramatic proteolytic processing both inside and outside of the host cell. It controls the initial phases of virus infection, including virus attachment, endocytosis, and genome release into the host cell. The astrovirus capsid is the target of host antibodies including virus-neutralizing antibodies", 1);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astro_vp25-27.png");
			Image astro_vp25_img = new Image(input);  
			DispensableElement astro_vp25 = new DispensableElement("Vp25", astro_vp25_img, "The protein VP25 is released during trypsin activation of astrovirus infectivity. The virus can be equally infectious when carrying abundant amounts of VP25");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astro_vp25-27.png");
			Image astro_vp27_img = new Image(input);
			DispensableElement astro_vp27 = new DispensableElement("Vp27", astro_vp27_img, "VP27 is a capsid spike protein of astroviruses that not only interacts with the host to define cell tropism and mediate cell entry, but also triggers the host immune response");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astro_overview.png");
			Image astro_overview = new Image(input);
			input = new FileInputStream("src/hust/soict/globalict/Assets/Astro/astroCovered.png");
			Image astro_covered = new Image(input);
			
			List<String> astro_infect = Arrays.asList("Water", "Hand-touching", "Oral");
			List<String> astro_symptoms = Arrays.asList("Diarrhoea", "Vomiting", "Fever", "Abdominal pain");
			
			astro = new Astro(astro_symptoms, astro_infect, astro_overview, astro_covered, astro_acid, astro_capsid, astro_vp25, astro_vp27);
			
	//		------------------------------ Adeno ------------------------------		
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_acid.png");
			Image adeno_acid_img = new Image(input);  
			AcidNucleic adeno_acid = new AcidNucleic(adeno_acid_img, "The adenoviral genomes are linear, non-segmented double-stranded DNA with sizes ranging from 26 kb to 45 kb in length, depending on the serotype", "DNA", 2);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_capsid.png");
			Image adeno_capsid_img = new Image(input);  
			Capsid adeno_capsid = new Capsid(adeno_capsid_img, "The capsid shell of an adenovirus comprises multiple copies of three major capsid proteins (MCPs; hexon, penton base, and fiber)", 1);
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_penton.png");
			Image adeno_penton_img = new Image(input);  
			DispensableElement adeno_penton = new DispensableElement("Penton", adeno_penton_img, "The adenovirus penton, a noncovalent complex of the pentameric penton base and trimeric fiber proteins, comprises the vertices of the adenovirus capsid and contains all necessary components for viral attachment and internalization");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_fiber.jpg");
			Image adeno_fiber_img = new Image(input);  
			DispensableElement adeno_fiber = new DispensableElement("Fiber", adeno_fiber_img, "The fiber proteins of all human adenovirus serotypes share a common architecture: an N-terminal tail, a central shaft made of repeating sequences, and a C-terminal globular knob domain");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_knob.jpg");
			Image adeno_knob_img = new Image(input);  
			DispensableElement adeno_knob = new DispensableElement("Knob", adeno_knob_img, "The knob is the domain which interacts with the cellular receptor. the trimeric knob is the ligand for attachment to the adenovirus receptor");
	
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adeno_overview.png");
			Image adeno_overview = new Image(input);
			input = new FileInputStream("src/hust/soict/globalict/Assets/Adeno/adenoCovered.png");
			Image adeno_covered = new Image(input);
			
			List<String> adeno_infect = Arrays.asList("Water", "Hand-touching", "Oral", "Body fluids", "Air");
			List<String> adeno_symptoms = Arrays.asList("Runny nose", "Sore throat", "Fever", "Severe cough", "Headache", "Pink eye");
			
			adeno = new Adeno(adeno_symptoms, adeno_infect, adeno_overview, adeno_covered, adeno_acid, adeno_capsid, adeno_penton, adeno_fiber, adeno_knob);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
