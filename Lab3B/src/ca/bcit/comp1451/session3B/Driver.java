package ca.bcit.comp1451.session3B;

public class Driver {

	public static void main(String[] args) {
		Utilities u = new Utilities();
		u.populateHashMap();
		u.displayCollection();
		System.out.println();
		u.getCount("Simran");
		System.out.println();
		u.displayTheWord(2);
		System.out.println();
		u.removeWord("Simran");
		u.displayCollection();

	}

}
