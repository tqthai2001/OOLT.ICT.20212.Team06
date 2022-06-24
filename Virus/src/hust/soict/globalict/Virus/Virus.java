package hust.soict.globalict.Virus;

import java.util.*;
import javafx.scene.image.Image;

public class Virus {
	protected int id;
	protected Element acid_nucleic;
	protected Element capsid;
	protected List<String> symtoms = new ArrayList<String>();
	protected String infectingMethod= new String();
	protected Image image_overview;
	protected static int nbVirus = 0;
	
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
	
	public String getInfectingMethod() {
		return infectingMethod;
	}
	

	public Virus(int id, Element acid_nucleic, Element capsid, List<String> symtoms, String infectingMethod,
			Image image_overview) {
		super();
		this.id = id;
		this.acid_nucleic = acid_nucleic;
		this.capsid = capsid;
		this.symtoms = symtoms;
		this.infectingMethod = infectingMethod;
		this.image_overview = image_overview;
	}

	//add symtom
	public void addSymtom(String addedSymtom) {
		if(symtoms.contains(addedSymtom)) {
			System.out.println("This symtom has already been in the list.");
		}else {
			symtoms.add(addedSymtom);
		}
	}
	//remove symtom
	public void removeSymtom(String addedSymtom) {
		if(symtoms.contains(addedSymtom)) {
			symtoms.remove(addedSymtom);
			
		}else {
			System.out.println("This symtom has not been in the list.");
		}
	}
	
	public String displayDetail() {
		String virus = getId() + " - " + 
				" - " + getAcid_nucleic() + " - " + getCapsid() +
				" - Symtoms: " + getSymtoms();
		return virus;
	}


}
