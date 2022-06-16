package hust.soict.globalict.Database;

import hust.soict.globalict.Virus.*;
import java.util.*;
public class Database {
	public static final int MAX_NUMBERS_ITEMS = 200;
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Virus> virusesInDatabase = new ArrayList<Virus> ();
	
	//add virus
	public void addVirus(Virus item) {
		if ((virusesInDatabase.contains(item) == false) && (virusesInDatabase.size() < MAX_NUMBERS_ITEMS)) {
			virusesInDatabase.add(item);
		} else {
			System.out.println("Fail to add virus to database!");
		}
	}
	public void addVirus(Virus ... itemList) {
		for(Virus item : itemList) {
			if ((virusesInDatabase.contains(item) == false) && (virusesInDatabase.size() < MAX_NUMBERS_ITEMS)) {
				this.addVirus(item);
			} else {
				System.out.println("Fail to add virus to database!");
			}
		}
	}
	
	// Remove virus
		public void removeVirus(Virus virus) {
				if(this.virusesInDatabase.size() > 0) {
					this.virusesInDatabase.remove(virus);
					System.out.println("Item has been removed!");
				}else
					System.out.println("The cart is empty. Nothing to remove.");
			}
		public void removeByIdMediaStore(int id) {
			int count = 0;
	    	if(virusesInDatabase.size() == 0) {
	    		System.out.println("There is nothing to remove.");
	    	}else {
				for(int i = 0; i < virusesInDatabase.size(); i++) {
					if(virusesInDatabase.get(i).getId() == id) {
						this.removeVirus(virusesInDatabase.get(i));
					}else count++;
				}
				if(count == virusesInDatabase.size()) {
					System.out.println("ID is invalid. That virus may not be in the database.");
				}
	    	}
		}
		
		//Display all virus in database
		public void displayVirusInDatabase() {
			System.out.println("Your store: ");
			for(Virus virusInDatabase : virusesInDatabase) {
				System.out.println(virusInDatabase.displayDetail());
			}	
		}
		
		//Search virus by ID
		public Virus searchByIdInStore(int id) {
			for(Virus virusInDatabase : this.virusesInDatabase) {
				if(virusInDatabase.getId() == id) {
					return virusInDatabase;
				}
			}
			return null;
		}
}
