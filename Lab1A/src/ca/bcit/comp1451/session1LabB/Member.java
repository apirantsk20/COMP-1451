package ca.bcit.comp1451.session1LabB;

public class Member {
	
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2019;

	private String firstName;
	private String lastName;
	private int yearOfJoining;
	private int monthOfJoining;
	

	
	public Member(String firstName, String lastName, int monthOfJoining, int yearOfJoining) {
		setFirstName(firstName);
		setLastName(lastName);
		setYearOfJoining(yearOfJoining);
		setMonthOfJoining(monthOfJoining);
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		if(firstName != null) {
		this.firstName = firstName;
		}
		else {
			throw new IllegalArgumentException("First Name cannot be null or empty");
		}
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		if(lastName != null) {
		this.lastName = lastName;
		}
		else {
			throw new IllegalArgumentException("Last Name cannot be null or empty");
		}
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}


	public void setYearOfJoining(int yearOfJoining) {
		if(yearOfJoining >= 0 && yearOfJoining <= CURRENT_YEAR) {
		this.yearOfJoining = yearOfJoining;
		}
		else {
			throw new IllegalArgumentException("Please enter a valid year");
		}
	}


	public int getMonthOfJoining() {
		return monthOfJoining;
	}


	public void setMonthOfJoining(int monthOfJoining) {
		if(monthOfJoining >= FIRST_MONTH && monthOfJoining <= LAST_MONTH) {
		this.monthOfJoining = monthOfJoining;
		}
		else {
			throw new IllegalArgumentException("Please enter a valid month number");
		}
	}


	
	public void displayMember() {
		System.out.println("Name of the employee is: "+ getFirstName() + " " + getLastName());
		System.out.println("Month of joining is: "+ getMonthOfJoining());
		System.out.println("Year of joining is: "+ getYearOfJoining());
	}

	
}
