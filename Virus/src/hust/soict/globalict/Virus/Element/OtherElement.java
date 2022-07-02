package hust.soict.globalict.Virus.Element;

import javafx.scene.image.Image;

public class OtherElement extends Element {
	private String nameOfElement;

	public String getNameOfElement() {
		return nameOfElement;
	}

	public OtherElement(String nameOfElement, Image image, String desc) {
		super(image, desc);
		this.nameOfElement = nameOfElement;
	}
}
