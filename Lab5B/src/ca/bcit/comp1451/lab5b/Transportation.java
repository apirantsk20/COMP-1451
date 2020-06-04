package ca.bcit.comp1451.lab5b;

import java.util.ArrayList;

public class Transportation {
	ArrayList<Vehicle> vehicle;

	public Transportation() {
		vehicle = new ArrayList<Vehicle>();
	}
	
	public void loadCollection() {
		Vehicle car = new Car(2019, "Mazada", "Mazada3", 100);
		Vehicle boat = new Boat(2011, "titanic", "RMS", false);
		Vehicle airplane = new AirPlane(2020, "Jet", "Airbus A330-200", 4100);
		
		vehicle.add(car);
		vehicle.add(boat);
		vehicle.add(airplane);
	}
	
	public void displayDetails() {
		for(Vehicle v: vehicle) {
			if(v instanceof Car) {
				System.out.println();
				((Car) v).displayDetails();
			}
			if(v instanceof Boat) {
				System.out.println();
				((Boat) v).displayDetails();
			}
			if(v instanceof AirPlane) {
				System.out.println();
				((AirPlane) v).displayDetails();
			}
		}
	}
	
	public void displayAirlineDetails() {
		for(Vehicle v: vehicle) {
			if(v instanceof AirPlane) {
				((AirPlane) v).displayDetails();
			}
		}
	}
	
	public static void main(String[] args) {
		Transportation trans = new Transportation();
		trans.loadCollection();
		trans.displayAirlineDetails();
		trans.displayDetails();
	}

}
