package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class Virus {
	protected int id;
	protected Element acid_nucleic;
	protected Element capsid;
	protected List<String> symptoms = new ArrayList<String>();
	protected Image image_overview;
	protected String infectingMethod= new String();
	protected static int nbVirus = 0;
	protected ArrayList<Element> listOfElements = new ArrayList<Element>();
	public int getId() {
		return id;
	}

	public Element getAcid_nucleic() {
		return acid_nucleic;
	}
	public Element getCapsid() {
		return capsid;
	}
	public List<String> getSymptoms() {
		return symptoms;
	}
	public static int getNbVirus() {
		return nbVirus;
	}
	public Image getImage_overview() {
		return image_overview;
	}
	public String getInfectingMethod() {
		return infectingMethod;
	}
	public ArrayList<Element> getElements(){
		return listOfElements;
	}  
//	public Element getElements(String element) {
//        if (listOfElements.contains(element)) {
//            return listOfElements.
//        } else {
//            return null;
//        }
//    }

	
	//Constructors
	public Virus() {
	}
	public Virus(Element acid_nucleic, Element capsid, String[] symptoms, String infectingMethod, Image image_overview) {
		super();
		this.id =  ++nbVirus;
		this.acid_nucleic = acid_nucleic;
		this.capsid = capsid;
		this.symptoms = Arrays.asList(symptoms);
		this.infectingMethod = infectingMethod;
		this.image_overview = image_overview;
		this.listOfElements.add(acid_nucleic);
		this.listOfElements.add(capsid);
	}
	
	public String getDetail() {
		String virus = "symptoms: " + getSymptoms() +  "\nInfecting Methods:" + getInfectingMethod();
		return virus;
	}

	

	
}
