package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class Virus {
	protected int id;
	protected Element acid_nucleic;
	protected Element capsid;
	protected List<String> symtoms = new ArrayList<String>();
	protected Image image_overview;
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
	public List<String> getSymtoms() {
		return symtoms;
	}
	public static int getNbVirus() {
		return nbVirus;
	}
	public Image getImage_overview() {
		return image_overview;
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
	public Virus(Element acid_nucleic, Element capsid, String[] symtoms, Image image_overview) {
		super();
		this.id =  ++nbVirus;
		this.acid_nucleic = acid_nucleic;
		this.capsid = capsid;
		this.symtoms = Arrays.asList(symtoms);
		this.image_overview = image_overview;
		this.listOfElements.add(acid_nucleic);
		this.listOfElements.add(capsid);
	}
	
	public String getDetail() {
		String virus = "Symtoms: " + getSymtoms() +  "\nInfecting Methods:";
		return virus;
	}

	
}
