package ca.bcit.comp1451.Session1LabA;

public class Driver {

	public static void main(String[] args) {
		Dog dog = new Dog("Fido", "Labrador", 5 );
		
		dog.displayDetails();
		
		Dog dog1 = new Dog(args[0], args[1],Integer.parseInt(args[2]));
		dog1.displayDetails();
		
		Kennel kennel = new Kennel();
		kennel.addDog(new Dog("Max", "Pug", 7));
		kennel.addDog(new Dog("Fido", "Labrador", 5));
		System.out.println("before adopting: ");
		kennel.displayDog();
		kennel.adopt("Max");
		System.out.println("after adopting: ");
		kennel.displayDog();

	}

}
