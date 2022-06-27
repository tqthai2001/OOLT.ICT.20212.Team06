package hust.soict.globalict.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class MainController {
	public void Close(ActionEvent event){
		Platform.exit();
		System.exit(0);
	}
	
	
	
}
