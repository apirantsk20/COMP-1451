package ca.bcit.comp1451.lab5b;

public class Boat extends Vehicle {
	private boolean isMotorized;

	public Boat(int yearManufactured, String make, String model, boolean isMotorized) {
		super(yearManufactured, make, model);
		setMotorized(isMotorized);
	}

	public boolean isMotorized() {
		return isMotorized;
	}

	public void setMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	}
	
	public void displayDetails() {
		System.out.println("The details of the boat is: ");
		System.out.println("Year manufactured is: " + getYearManufactured());
		System.out.println("Make is: "+ getMake());
		System.out.println("Model is: "+ getModel());
		System.out.println("Boat is motorized: "+ isMotorized());
	}

}
