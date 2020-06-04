package ca.bcit.comp1451.session7.labB;

public class HourlyEmployee extends Employee {
	private int numberOfHours;
	private double payRate;

	public HourlyEmployee(String name, int numberOfHours, double payRate) {
		super(name);
		setNumberOfHours(numberOfHours);
		setPayRate(payRate);
	}
	
	public int getNumberOfHours() {
		return numberOfHours;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setNumberOfHours(int numberOfHours) {
		if (numberOfHours >= 0){
			this.numberOfHours = numberOfHours;
		}
		
	}

	public void setPayRate(double payRate) {
		if (payRate >= 0.0){
			this.payRate = payRate;
		}
		
	}

	@Override
	public double calculatePay() {
		return getPayRate() * getNumberOfHours();
	}

	@Override
	public String toString() {
		return super.toString()
	           +"Type of employee: hourly."+ "\n"
	           +"Rate of pay: "     + getPayRate() + "\n"
	           +"Number of hours: " + getNumberOfHours() +"\n" 
			   + "Total pay: " + calculatePay() +"\n";
	}
	
}
