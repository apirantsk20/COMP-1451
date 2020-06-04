package ca.bcit.comp1451.lab5b;

public class AirPlane extends Vehicle{
	private int maxHeightInFeet;

	public AirPlane(int yearManufactured, String make, String model, int maxHeightInFeet) {
		super(yearManufactured, make, model);
		setMaxHeightInFeet(maxHeightInFeet);
		}

	public int getMaxHeightInFeet() {
		return maxHeightInFeet;
	}

	public void setMaxHeightInFeet(int maxHeightInFeet) {
		this.maxHeightInFeet = maxHeightInFeet;
	}
	
	public void displayDetails() {
		System.out.println("The details of the airplane is: ");
		System.out.println("Manufactured year is: " + getYearManufactured());
		System.out.println("Make is: "+ getMake());
		System.out.println("Model is: "+ getModel());
		System.out.println("Maximum height in feet: "+ getMaxHeightInFeet());
	}

}
