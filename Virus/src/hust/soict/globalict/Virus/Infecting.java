package hust.soict.globalict.Virus;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public interface Infecting {
    public void infect();

	void infect(ImageView overviewImg, ImageView envelopeImg, ImageView capsidImg, HBox hbAcid, Button btnReplay);
}
