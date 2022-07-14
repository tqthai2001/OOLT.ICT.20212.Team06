package hust.soict.globalict.Virus;

import java.util.*;

import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.Element;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Virus {
	private int id;
	private static int nbVirus = 0;
	private List<String> symptoms = new ArrayList<String>();
	private List<String> infectingMethod = new ArrayList<String>();
	private Image imageOverview;
	private ImageView imageView;
	private AcidNucleic acidNucleic;
	private Capsid capsid;
	protected ArrayList<Element> listOfElements = new ArrayList<Element>();
	
	public int getId() {
		return id;
	}
	public List<String> getSymptoms() {
		return symptoms;
	}
	public List<String> getInfectingMethod() {
		return infectingMethod;
	}
	public Image getImageOverview() {
		return imageOverview;
	}
	public ImageView getImageView() {
		return imageView;
	}
	public AcidNucleic getAcidNucleic() {
		return acidNucleic;
	}
	public Capsid getCapsid() {
		return capsid;
	}
	public ArrayList<Element> getElements() {
		return listOfElements;
	}
	public String getVirusName() {
		return "Virus";
	}
 
	public Virus() {
		super();
	}
	public Virus(List<String> symptoms, List<String> infectingMethod, Image imageOverview, AcidNucleic acidNucleic,
			Capsid capsid) {
		super();
		this.id = ++nbVirus;
		this.symptoms = symptoms;
		this.infectingMethod = infectingMethod;
		this.imageOverview = imageOverview;
		this.imageView = new ImageView();
		this.imageView.setImage(imageOverview);
		this.acidNucleic = acidNucleic;
		this.capsid = capsid;
		this.addElement(acidNucleic, capsid);
	}
	
	public void addElement(Element element) {
		listOfElements.add(element);
	}
	public void addElement(Element ... listElements) {
		for (Element element : listElements) {
			listOfElements.add(element);
		}
	}
	
	public String getDetail() {
		return "ID: " + getId();
	}

	public void infect(TextArea detailedDescTf, ImageView overviewImg, ImageView envelopeImg, ImageView capsidImg, HBox hbAcid,
			Button btnReplay) {
		// TODO Auto-generated method stub
	}
}
