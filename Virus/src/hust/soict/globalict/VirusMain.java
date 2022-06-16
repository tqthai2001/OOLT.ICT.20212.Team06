package hust.soict.globalict;
import hust.soict.globalict.Database.Database;
import hust.soict.globalict.Virus.*;
import java.util.*;
public class VirusMain {

	public static void main(String[] args) {
		Database database = new Database();
		Scanner scanner = new Scanner(System.in);
		
		Virus hiv = new VirusWithEnvelope("HIV", "img1", "HIV DNA", "HIV Capsid", new String[] {"Fever", "Chills", "Rash", " Night sweats"}, "HIV Envelope");
		database.addVirus(hiv);
		database.displayVirusInDatabase();
		}
	}


