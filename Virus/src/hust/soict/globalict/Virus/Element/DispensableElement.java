package hust.soict.globalict.Virus.Element;

import javafx.scene.image.Image;

public class DispensableElement extends Element {
	private String nameOfElement;

	public String getNameOfElement() {
		return nameOfElement;
	}

	public DispensableElement(String nameOfElement, Image image, String desc) {
		super(image, desc);
		this.nameOfElement = nameOfElement;
	}
}
