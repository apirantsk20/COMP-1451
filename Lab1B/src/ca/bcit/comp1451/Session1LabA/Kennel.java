package ca.bcit.comp1451.Session1LabA;

import java.util.ArrayList;
import java.util.Iterator;

public class Kennel {

	private ArrayList<Dog> dog;

	public Kennel() {
		
		dog = new ArrayList<Dog>();
		
	}
	
	public void addDog(Dog theDog) {

		if(theDog != null) {
			dog.add(theDog);
		}
		
	}
	
	public void displayDog() {
		for(Dog d : dog) {
			d.displayDetails();
		}
	}
	
	public void adopt(String name) {
		Iterator<Dog> iter = dog.iterator();
		while(iter.hasNext()) {
			Dog d = iter.next();
			if(d.getName().equalsIgnoreCase(name) ) {
				iter.remove();
			}
			else {
				System.out.println("there is no dog of this name");
			}
		}
		
		
	}
	
}
