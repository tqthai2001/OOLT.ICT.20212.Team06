package hust.soict.globalict;

import hust.soict.globalict.Screen.InfectingScreen;
import hust.soict.globalict.Virus.VirusWithEnvelope;
import hust.soict.globalict.Virus.VirusWithoutEnvelope;

public class VirusMain {
	public static void main(String[] args) {
		VirusWithEnvelope v1 = new VirusWithEnvelope();
		VirusWithoutEnvelope v2 = new VirusWithoutEnvelope();
		new InfectingScreen(v2);
		new InfectingScreen(v1);
	}
}