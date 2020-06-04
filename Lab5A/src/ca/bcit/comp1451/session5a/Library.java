package ca.bcit.comp1451.session5a;

import java.util.ArrayList;

public class Library {
	
	ArrayList<ReadingMaterial> read;

	public Library() {
		super();
		read = new ArrayList<ReadingMaterial>();
	}
	
	public void loadLibrary() {
		ReadingMaterial textbook =  new TextBook("java", 200, 1998, "Sam","Computer");
		ReadingMaterial novel = new Novel("Dark ages", 500, "Dragon Queen", "to kill someone", "abcd");
		ReadingMaterial magazine = new Magazine("Fitness Freak", 100, "monthly", 1000);
		read.add(textbook);
		read.add(novel);
		read.add(magazine);
		
	}
	
	public void displayAllMaterial() {
		for(ReadingMaterial r : read) {
			if(r instanceof TextBook) {
		System.out.println("The details of the magazine are:");
		((TextBook) r).Display();
		System.out.println();
			}
			if(r instanceof Novel) {
				System.out.println("The details of the novel are: ");
				((Novel) r).display();
				System.out.println();
			}
			if(r instanceof Magazine) {
				System.out.println("The details of magazine are:");
				((Magazine) r).displayDetails();
				System.out.println();
			}
		}
	}
	
	public void displayMagzineDetails() {
		for(ReadingMaterial r: read) {
			if(r instanceof Magazine) {
				System.out.println("The details of magazine are: ");
				((Magazine) r).displayDetails();
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Library lib = new Library();
		lib.loadLibrary();
		lib.displayMagzineDetails();
		lib.displayAllMaterial();

	}

}
