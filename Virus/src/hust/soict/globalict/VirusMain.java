package hust.soict.globalict;

import hust.soict.globalict.Screen.MainScreen;
import hust.soict.globalict.Virus.Element.AcidNucleic;
import hust.soict.globalict.Virus.Element.Capsid;
import hust.soict.globalict.Virus.Element.OtherElement;
import hust.soict.globalict.Virus.VirusEnvelope.Covid19;
import hust.soict.globalict.Virus.VirusEnvelope.HIV;
import hust.soict.globalict.Virus.VirusEnvelope.Herpes;
import hust.soict.globalict.Virus.VirusNonEnvelope.Adeno;
import hust.soict.globalict.Virus.VirusNonEnvelope.Astro;
import hust.soict.globalict.Virus.VirusNonEnvelope.Rota;
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

public class VirusMain {
	public static void main(String[] args) throws Exception {
		JFrame jFrame = new JFrame();
		new MainScreen(jFrame);
	}
}



