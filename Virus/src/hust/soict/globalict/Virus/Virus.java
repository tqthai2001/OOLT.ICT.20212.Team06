package hust.soict.globalict.Virus;

import java.util.*;

import javax.swing.JFrame;

import hust.soict.globalict.Screen.InfectingScreen;
import javafx.scene.image.Image;

public class Virus implements InfectingHostCell {
	private int id;
	private static int nbVirus = 0;
	private Element acidNucleic;
	private Element capsid;
	private List<String> symptoms = new ArrayList<String>();
	private List<String> infectingMethod = new ArrayList<String>();
	private Image imageOverview;
	protected ArrayList<Element> listOfElements = new ArrayList<Element>();
	private JFrame jFrame;
	public int getId() {
		return id;
	}
	public Element getAcidNucleic() {
		return acidNucleic;
	}
	public Element getCapsid() {
		return capsid;
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
	public ArrayList<Element> getElements() {
		return listOfElements;
	}
 
	public Virus() {
		super();
	}
	public Virus(Element acidNucleic, Element capsid, String[] symptoms, String[] infectingMethod, Image imageOverview) {
		super();
		this.id =  ++nbVirus;
		this.acidNucleic = acidNucleic;
		this.capsid = capsid;
		this.symptoms = Arrays.asList(symptoms);
		this.infectingMethod = Arrays.asList(infectingMethod);
		this.imageOverview = imageOverview;
		this.listOfElements.add(acidNucleic);
		this.listOfElements.add(capsid);
	}
	
	public String getDetail() {
		return "ID: " + getId();
	}

	@Override
	public void infecting() {
		// TODO Auto-generated method stub
		new InfectingScreen(this, jFrame);
	}
}
