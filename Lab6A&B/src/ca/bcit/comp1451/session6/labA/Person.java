package ca.bcit.comp1451.session6.labA;

public class Person {
	
	private String name;
	private int ageInyears;
	public Person(String name, int ageInyears) {
		super();
		setName(name);
		setAgeInyears(ageInyears);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
		this.name = name;
		}
		else {
			System.out.println("Please enter something in name feild");
		}
	}
	public int getAgeInyears() {
		return ageInyears;
	}
	public void setAgeInyears(int ageInyears) {
		if(ageInyears >0 && ageInyears <130) {
		this.ageInyears = ageInyears;
		}
		else {
			throw new IllegalArgumentException("Please enter a valid age");
		}
	}
	@Override
	public String toString() {
		return "Name is " + name + " and age is " + ageInyears ;
	}
	
	
}
