package ca.bcit.comp1451.session7.labB;

public abstract class Employee {
	private String name;

	public Employee(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length()>0){
			this.name = name;
		}
		else{
			this.name = "Unknown";
		}
	}
	
	public abstract double calculatePay();

	@Override
	public String toString() {
		return "Employee name: " + getName() + "\n";
	}
	
}
