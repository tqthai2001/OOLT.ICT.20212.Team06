package hust.soict.globalict.Virus.Element;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Element {
	private int id;
	private static int nbElement = 0;
	private String desc;
	private Image image;
	private ImageView elementImageView;
	
	public int getId() {
		return id;
	}
	public Image getImage() {
		return image;
	}
	public String getDesc() {
		return desc;
	}

	public Element(Image image, String desc) {
		super();
		this.id = ++nbElement;
		this.image = image;
		this.desc = desc;
		this.elementImageView = new ImageView();
		this.elementImageView.setImage(image);
	}
	
	public String getNameOfElement() {
		return "Element";
	}
}
