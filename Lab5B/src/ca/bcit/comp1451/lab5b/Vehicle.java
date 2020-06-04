package ca.bcit.comp1451.lab5b;

public class Vehicle {
	private int yearManufactured;
	private String make; 
	private String model;
	public Vehicle(int yearManufactured, String make, String model) {
		setYearManufactured(yearManufactured);
		setMake(make);
		setModel(model);
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		if(yearManufactured >0) {
		this.yearManufactured = yearManufactured;
		}
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		if(make != null && make.trim().length() > 0) {
		this.make = make;}
		else {
			this.make = "unknown";
		}
	}
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model != null && model.trim().length()>0) {
		this.model = model;
		}
		else {
			this.model = "unknown";
		}
	}
	
}
