package hust.soict.globalict.Virus.Element;

import javafx.scene.image.Image;

public class AcidNucleic extends Element {
	private String type;
	private int numCopy;
	
	public String getType() {
		return type;
	}
	public int getNumCopy() {
		return numCopy;
	}
	
	@Override
	public String getNameOfElement() {
		// TODO Auto-generated method stub
		return "Acid Nucleic";
	}

	public AcidNucleic(Image image, String desc, String type, int numCopy) {
		super(image, desc);
		this.type = type;
		this.numCopy = numCopy;
	}
}
