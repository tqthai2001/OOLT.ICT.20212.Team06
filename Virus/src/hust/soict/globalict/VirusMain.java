package hust.soict.globalict;

import hust.soict.globalict.Virus.*;
import java.util.*;
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;

public class VirusMain {

	public static void main(String[] args) throws Exception{
//HIV		
		String HIV_infect = "Body fluids, Sex, Mother to child, Blood";
		
		InputStream fis = new FileInputStream("/Assets/HIV/HIV_acidnucleic.png");
		Image HIV_acidnucleic_img = new Image(fis);
		Element HIV_acidnucleic = new Element(HIV_acidnucleic_img,"HIV virus contains two copies of single-stranded RNA (ssRNA), which are transcribed into double-stranded DNA (dsDNA) by a complex reverse transcription process.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_capsid.png");
		Image HIV_capsid_img = new Image(fis);  
		Element HIV_capsid = new Element(HIV_capsid_img, "The capsid (CA) protein of HIV virus is an essential structural component of a virion and facilitates many crucial life cycle steps through interactions with host cell factors.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_envelope.png");
		Image HIV_envelope_img = new Image(fis);  
		Element HIV_envelope = new Element(HIV_envelope_img, "The envelope of the HIV virion consists of a glycoprotein complex, called Env, embedded in a host-sourced phospholipid membrane.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_protease.png");
		Image HIV_protease_img = new Image(fis);  
		Element HIV_protease = new Element(HIV_protease_img, "HIV protease is responsible for processing of the gag and gag-pol polyproteins during virion maturation.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_integrase.png");
		Image HIV_integrase_img = new Image(fis);  
		Element HIV_integrase = new Element(HIV_integrase_img, "HIV integrase is a multidomain enzyme which is required for the integration of viral DNA into the host genome.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_tat.png");
		Image HIV_tat_img = new Image(fis);  
		Element HIV_tat = new Element(HIV_tat_img, "Tat (HIV) is a regulatory protein that drastically enhances the efficiency of viral transcription.[2] Tat stands for \"Trans-Activator of Transcription.");
		
		fis = new FileInputStream("/Assets/HIV/HIV_overview.png");
		Image HIV_overview_img =  new Image(fis);
		
		HIV hiv = new HIV(HIV_acidnucleic, HIV_capsid, new String[] {"Fever", "Chills", "Rash", "Night sweats"}, HIV_infect, HIV_overview_img, HIV_envelope, HIV_protease, HIV_integrase, HIV_tat);
		
//Covid19
		String Covid_infect = "Body Fluids, Air";
		
		fis = new FileInputStream("/Assets/Covid19/covid19_acidnucleic.jpg");
		Image covid_acid_img = new Image(fis);  
		Element covid_acid = new Element(covid_acid_img, "The Acid Nucleic of COVID-19 is a single strand of positive-sense RNA. They duplicate their RNA genome using a specialized polymerase");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_capsid.jpg");
		Image covid_capsid_img = new Image(fis);  
		Element covid_capsid = new Element(covid_capsid_img, "The nucleocapsid of COVID-19, made up of a protein shell known as a capsid and containing the viral nucleic acids, is helical or tubular.");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_envelope.png");
		Image covid_envelope_img = new Image(fis);  
		Element covid_envelope = new Element(covid_envelope_img, "The envelope of COVID-19, forms a homopentameric cation channel that is important for virus pathogenicity");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_eprotein.jpg");
		Image covid_eprotein_img = new Image(fis);  
		Element covid_eprotein = new Element(covid_eprotein_img, "E-protein is a small integral membrane protein, which together with Matrix/Membrane (M) and Spike(S) proteins, constitute coronaviruses’ interface to the external environment.");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_Mprotein.jpg");
		Image covid_Mprotein_img = new Image(fis);  
		Element covid_Mprotein = new Element(covid_Mprotein_img, "The viral membrane proteins (M-protein) often resemble their host counter-parts in the structure and functions");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_spike.jpg");
		Image covid_spike_img = new Image(fis);  
		Element covid_spike = new Element(covid_spike_img, "Coronavirus spike protein binds to receptors on cell surfaces, and is a target for vaccine development.");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_he.jpg");
		Image covid_he_img = new Image(fis);  
		Element covid_he = new Element(covid_he_img, "HEs is a glycoprotein that certain enveloped viruses possess and use as an invading mechanism. HEs helps in the attachment and destruction of certain sialic acid receptors that are found on the host cell surface");
		
		fis = new FileInputStream("/Assets/Covid19/covid19_overview.png");
		Image covid_overview_img = new Image(fis);
		
		Covid19 covid = new Covid19(covid_acid, covid_capsid, new String[] {"Fever","Cough","Tired", "Loss of taste or smell", "Headache", "Shortness of breath"}, Covid_infect, covid_overview_img, covid_envelope, covid_Mprotein, covid_eprotein, covid_he, covid_spike);
		
//Herpes
		String herpes_infect = "Sex, Body fluids, Skin-touching, Oral";
		
		fis = new FileInputStream("/Assets/Herpes/herpes_acidnucleic.png");
		Image herpes_acid_img = new Image(fis);  
		Element herpes_acid = new Element(herpes_acid_img, "The Herpes virus Acid Nucleic is DNA polymerase, which is a key enzyme in the lytic phase of the infection.");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_capsid.png");
		Image herpes_capsid_img = new Image(fis);  
		Element herpes_capsid = new Element(herpes_capsid_img, "Capsid of Herpes virus is icosadeltahedral, conformed of 162 capsomers.");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_envelope.jpg");
		Image herpes_envelope_img = new Image(fis);  
		Element herpes_envelope = new Element(herpes_envelope_img, "Herpes envelope is membrane of cell origin containing viral glycoproteins and membrane receptors");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_tegument.jpg");
		Image herpes_tegument_img = new Image(fis);  
		Element herpes_tegument = new Element(herpes_tegument_img, "Herpes tegument includes proteins involved in virion morphogenesis, control of host expression machinery");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_gB.jpeg");
		Image herpes_gB_img = new Image(fis);  
		Element herpes_gB = new Element(herpes_gB_img, "Like all viral fusogens, gB is composed of a large extraviral or ectodomain, many aspects of gB function are both unique and incompletely understood.");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_gC.jpg");
		Image herpes_gC_img = new Image(fis);  
		Element herpes_gC = new Element(herpes_gC_img, "Although gC is not essential for most herpesviruses studied thus far, it significantly increases the efficiency of infection by providing an additional binding mechanism5 and helps shield the virus from antibody neutralization");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_gD.jpeg");
		Image herpes_gD_img = new Image(fis);  
		Element herpes_gD = new Element(herpes_gD_img, "Glycoprotein D (gD) is a structural component of the herpes simplex virus (HSV) envelope which is essential for virus entry into host cells.");
		
		fis = new FileInputStream("/Assets/Herpes/herpes_gHgL.png");
		Image herpes_gHgL_img = new Image(fis);  
		Element herpes_gHgL = new Element(herpes_gHgL_img, "The unique component of herpesvirus fusion machinery, gH/gL is emerging as a complex of multiple functions: a scaffold for presenting receptor-binding proteins, an activator for gB, and a membrane manipulator");
		
		fis = new FileInputStream("/Herpes/herpes_overview.jpg");
		Image herpes_overview = new Image(fis);
		
		Herpes herpes = new Herpes(herpes_acid, herpes_capsid,new String[] {"Fever", "Swollen lymph nodes", "Body aches and pains", "Unusual tiredness", "Lack of appetite"}, herpes_infect, herpes_overview, herpes_envelope, herpes_tegument, herpes_gB, herpes_gC, herpes_gD, herpes_gHgL);
		
//Rota
		String rota_infect = "Fecal-oral route";
		
		fis = new FileInputStream("/Rota/rota_acidnucleic.jpg");
		Image rota_acid_img = new Image(fis);  
		Element rota_acid = new Element(rota_acid_img, "Rotaviruses, like other non-enveloped, double-strand RNA viruses, package an RNA-dependent RNA polymerase (RdRp) with each duplex of their segmented genomes.");
		
		fis = new FileInputStream("/Assets/Rota/rota_capsid.jpeg");
		Image rota_capsid_img = new Image(fis);  
		Element rota_capsid = new Element(rota_capsid_img, "The rotavirus capsid consists of 11 segments and is contained in the viral core along with the minor structural proteins, VP1 and VP3");
		
		fis = new FileInputStream("/Assets/Rota/rota_vp1.png");
		Image rota_vp1_img = new Image(fis);  
		Element rota_vp1 = new Element(rota_vp1_img, "VP1 is active inside the double-layer particle, each VP1 achieves many rounds of mRNA transcription from its associated genome segment.");
		
		fis = new FileInputStream("/Assets/Rota/rota_vp3.png");
		Image rota_vp3_img = new Image(fis);  
		Element rota_vp3 = new Element(rota_vp3_img, "VP3 was necessary for “capping” the viral messenger RNA (mRNA), enabling it to mimic the host’s capped RNA and thus evade immune response.");
		
		fis = new FileInputStream("/Assets/Rota/rota_vp4.png");
		Image rota_vp4_img = new Image(fis);  
		Element rota_vp4 = new Element(rota_vp4_img, "VP4 spikes protein that constitute the outer capsid of a complete rotavirus particle have been shown to be independent neutralization antigens.");
		
		fis = new FileInputStream("/Assets/Rota/rota_overview.jpg");
		Image rota_overview = new Image(fis);
		
		Rota rota = new Rota(rota_acid, rota_capsid, new String[] {"vomiting", "diarrhoea", "fever", "dry mouth"}, rota_infect, rota_overview, rota_vp1, rota_vp3, rota_vp4);
		
//Astro
		String astro_infect = "Water, hand-touching, oral";
		
		fis = new FileInputStream("/Assets/Astro/astro_acid.png");
		Image astro_acid_img = new Image(fis);  
		Element astro_acid = new Element(astro_acid_img, "Astroviruses are positive-sense, single-stranded RNA viruses. Their genomes contain three open reading frames, but the exact number of encoded proteins remains unknown");
		
		fis = new FileInputStream("/Assets/Astro/astro_capsid.png");
		Image astro_capsid_img = new Image(fis);  
		Element astro_capsid = new Element(astro_capsid_img, "The Astrovirus capsid protein undergoes dramatic proteolytic processing both inside and outside of the host cell. It controls the initial phases of virus infection, including virus attachment, endocytosis, and genome release into the host cell. The astrovirus capsid is the target of host antibodies including virus-neutralizing antibodies.");
		
		fis = new FileInputStream("/Assets/Astro/astro_vp25-27.png");
		Image astro_vp25_img = new Image(fis);  
		Element astro_vp25 = new Element(astro_vp25_img, "The protein VP25 is released during trypsin activation of astrovirus infectivity. The virus can be equally infectious when carrying abundant amounts of VP25.");
		
		fis = new FileInputStream("/Assets/Astro/astro_vp25-27.png");
		Image astro_vp27_img = new Image(fis);  
		Element astro_vp27 = new Element(astro_vp27_img, "VP27 is a capsid spike protein of astroviruses that not only interacts with the host to define cell tropism and mediate cell entry, but also triggers the host immune response ");
		
		fis = new FileInputStream("/Assets/Astro/astro_overview.png");
		Image astro_overview = new Image(fis);
		
		Astro astro = new Astro(astro_acid, astro_capsid, new String[] {"diarrhoea", "vomiting", "fever", "abdominal pain"}, astro_infect, astro_overview, astro_vp25, astro_vp27);
		
//Adeno
		String adeno_infect = "Hand-touching, Body fluids, Air, Water, Oral";
		
		fis = new FileInputStream("/Assets/Adeno/adeno_acid.png");
		Image adeno_acid_img = new Image(fis);  
		Element adeno_acid = new Element(adeno_acid_img, "The adenoviral genomes are linear, non-segmented double-stranded DNA with sizes ranging from 26 kb to 45 kb in length, depending on the serotype");
		
		fis = new FileInputStream("/Assets/Adeno/adeno_capsid.png");
		Image adeno_capsid_img = new Image(fis);  
		Element adeno_capsid = new Element(adeno_capsid_img, "The capsid shell of an adenovirus comprises multiple copies of three major capsid proteins (MCPs; hexon, penton base, and fiber)");
		
		fis = new FileInputStream("/Assets/Adeno/adeno_penton.png");
		Image adeno_penton_img = new Image(fis);  
		Element adeno_penton = new Element(adeno_penton_img, "The adenovirus penton, a noncovalent complex of the pentameric penton base and trimeric fiber proteins, comprises the vertices of the adenovirus capsid and contains all necessary components for viral attachment and internalization");
		
		fis = new FileInputStream("/Assets/Adeno/adeno_fiber.jpg");
		Image adeno_fiber_img = new Image(fis);  
		Element adeno_fiber = new Element(adeno_fiber_img, "The fiber proteins of all human adenovirus serotypes share a common architecture: an N-terminal tail, a central shaft made of repeating sequences, and a C-terminal globular knob domain");
		
		fis = new FileInputStream("/Assets/Adeno/adeno_knob.jpg");
		Image adeno_knob_img = new Image(fis);  
		Element adeno_knob = new Element(adeno_knob_img, "The knob is the domain which interacts with the cellular receptor. the trimeric knob is the ligand for attachment to the adenovirus receptor.");
		
		fis = new FileInputStream("/Assets/Adeno/astro_overview.png");
		Image adeno_overview = new Image(fis);
		
		Adeno adeno = new Adeno(adeno_acid, adeno_capsid, new String[] {"Runny nose", "Sore throat", "Fever", "Severe cough", "Headache", "Pink eye"}, adeno_infect, adeno_overview, adeno_penton, adeno_fiber, adeno_knob);
		
		}
}



