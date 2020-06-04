package ca.bcit.comp1451.session6.labA;

public class Employee extends Person {
	
	private double hourlyRate;
	private int   numberOfWorkingHoursPerWeek;
	public Employee(String name, int ageInyears, double hourlyRate, int numberOfWorkingHoursPerWeek) {
		super(name, ageInyears);
		setHourlyRate(hourlyRate);
		setNumberOfWorkingHoursPerWeek(numberOfWorkingHoursPerWeek);
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate >0) {
		this.hourlyRate = hourlyRate;
		}
		else {
			throw new IllegalArgumentException("Please enter positive salary");
		}
	}
	public int getNumberOfWorkingHoursPerWeek() {
		return numberOfWorkingHoursPerWeek;
	}
	public void setNumberOfWorkingHoursPerWeek(int numberOfWorkingHoursPerWeek) {
		if(numberOfWorkingHoursPerWeek >= 0 && numberOfWorkingHoursPerWeek <=80) {
		this.numberOfWorkingHoursPerWeek = numberOfWorkingHoursPerWeek;
		}
		else {
			throw new IllegalArgumentException("Please enter valid number of hours worked");
		}
	}
	public String fullTime() {
		if(getNumberOfWorkingHoursPerWeek() >= 40) {
			return "The Employee is full time employee.";
		}
		else {
			return "The employee is part time employee.";
		}
	}
	@Override
	public String toString() {
		return  super.toString() +". "+ fullTime();
	}
	
}
