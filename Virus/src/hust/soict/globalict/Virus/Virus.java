package hust.soict.globalict.Virus;

import java.util.*;

import javax.swing.JFrame;

import hust.soict.globalict.Screen.InfectingScreen;
import javafx.scene.image.Image;

public class Virus implements InfectingHostCell {
	private int id;
	private Element acid_nucleic;
	private Element capsid;
	private List<String> symtoms = new ArrayList<String>();
	private Image image_overview;
	private static int nbVirus = 0;
	protected ArrayList<Element> listOfElements = new ArrayList<Element>();
	private JFrame jFrame;
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
	public ArrayList<Element> getElements() {
		return listOfElements;
	}
 
	public Virus() {
		super();
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
		return "ID: " + getId();
	}

	@Override
	public void infecting() {
		// TODO Auto-generated method stub
		new InfectingScreen(this, jFrame);
	}
}
