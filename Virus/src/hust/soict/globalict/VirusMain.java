package hust.soict.globalict;

import hust.soict.globalict.Screen.MainScreen;

import javax.swing.JFrame;

public class VirusMain {
	public static void main(String[] args) throws Exception {
		JFrame jFrame = new JFrame();
		new MainScreen(jFrame);
	}
}