package ca.bcit.comp1451.lab5b;

public class Car extends Vehicle {
	private int horsePower;

	public Car(int yearManufactured, String make, String model, int horsePower) {
		super(yearManufactured, make, model);
		setHorsePower(horsePower);
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void displayDetails() {
		System.out.println("Details of the car are: ");
		System.out.println("Manufacturing year is: "+ getYearManufactured());
		System.out.println("Make of this car is: "+ getMake());
		System.out.println("Model of this car is: "+ getModel());
		System.out.println("HorsePower of this car is: "+ getHorsePower());
	}

}
