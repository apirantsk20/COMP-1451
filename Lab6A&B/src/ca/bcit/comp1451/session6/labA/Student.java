package ca.bcit.comp1451.session6.labA;

public class Student extends Person {
	
	private Boolean isFullTimeStudent;
	private double gpa;
	
	public Student(String name, int ageInyears, Boolean isFullTimeStudent, double gpa) {
		super(name, ageInyears);
		setIsFullTimeStudent(isFullTimeStudent);
		setGpa(gpa);
	}

	public Boolean getIsFullTimeStudent() {
		return isFullTimeStudent;
	}

	public void setIsFullTimeStudent(Boolean isFullTimeStudent) {
		this.isFullTimeStudent = isFullTimeStudent;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa >=0 && gpa <= 100) {
		this.gpa = gpa;
		}
		else {
			throw new IllegalArgumentException("Please enter valid GPA");
		}
	}
	public String fullTime() {
		if(getIsFullTimeStudent()) {
			return ". Student is full time student";
		}
		else {
			return ". Student is Part time student";
		}
	}

	@Override
	public String toString() {
		return "Students name is " + super.getName() + " and the age is "+ super.getAgeInyears() + fullTime() + " with GPA " + getGpa() ;
	}


}
