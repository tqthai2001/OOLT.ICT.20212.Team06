package hust.soict.globalict.Virus;

import javafx.scene.image.Image;
public class Element {
	protected Image image;
	protected String desc;
	
	public Image getImage() {
		return image;
	}
	public String getDesc() {
		return desc;
	}
	
	//constructor
	public Element(){
	}
	public Element(Image image, String desc) {
		super();
		this.image = image;
		this.desc = desc;
	}
}
