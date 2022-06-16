package hust.soict.globalict.Virus;
import java.util.*;
public class Virus {
	protected int id;
	protected String name;
	protected String img;
	protected String acid_nucleic;
	protected String capsid;
	protected List<String> symtoms = new ArrayList<String>();
	protected static int nbVirus = 0;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getImg() {
		return img;
	}
	public String getAcid_nucleic() {
		return acid_nucleic;
	}
	public String getCapsid() {
		return capsid;
	}
	public List<String> getSymtoms() {
		return symtoms;
	}
	public static int getNbVirus() {
		return nbVirus;
	}
	
	//Constructors
	public Virus() {
	}
	public Virus(String name, String img, String acid_nucleic, String capsid, String[] symtoms) {
		super();
		this.id =  ++nbVirus;
		this.name = name;
		this.img = img;
		this.acid_nucleic = acid_nucleic;
		this.capsid = capsid;
		this.symtoms = Arrays.asList(symtoms);
	}
	public Virus(String name) {
		super();
		this.id =  ++nbVirus;
		this.name = name;
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
		String virus = getId() + " - " + getName() + " - " + getImg() +
				" - " + getAcid_nucleic() + " - " + getCapsid() +
				" - Symtoms: " + getSymtoms();
		return virus;
	}
}
