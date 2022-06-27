package hust.soict.globalict.Virus;

import javafx.scene.image.Image;
public class Element {
	protected String name;
	protected Image image;
	protected String desc;
	
	public Image getImage() {
		return image;
	}
	public String getDesc() {
		return desc;
	}
	public String getName() {
		return name;
	}
	//constructor
	public Element(){
		super();
	}
	public Element(String name, Image image, String desc) {
		super();
		this.name = name;
		this.image = image;
		this.desc = desc;
	}

}
