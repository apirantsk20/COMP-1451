package ca.bcit.comp1451.Session1LabA;

public class Dog {

	private String name;
	private String breed;
	private int ageInYears;
	public Dog(String name, String breed, int ageInYears) {
		setName(name);
		setBreed(breed);
		setAgeInYears(ageInYears);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		if(breed == null) {
			throw new IllegalArgumentException("breed cannot be null");
		}
		this.breed = breed;
	}
	public int getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(int ageInYears) {
		if(ageInYears < 0) {
			throw new IllegalArgumentException("age cannot be negative");
		}
		this.ageInYears = ageInYears;
	}
	
	public void displayDetails() {
		System.out.println("Name of the dog is: "+name);
		System.out.println("Breed of the dog is: "+ breed);
		System.out.println("Age of the dog is: "+ageInYears);
	}
	
	
	
}

