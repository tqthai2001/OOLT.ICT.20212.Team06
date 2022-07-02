package hust.soict.globalict.Virus.Element;

import javafx.scene.image.Image;

public class Capsid extends Element {
	private int numLayer;

	public int getNumLayer() {
		return numLayer;
	}
	
	@Override
	public String getNameOfElement() {
		// TODO Auto-generated method stub
		return "Capsid";
	}

	public Capsid(Image image, String desc, int numLayer) {
		super(image, desc);
		this.numLayer = numLayer;
	}
}
