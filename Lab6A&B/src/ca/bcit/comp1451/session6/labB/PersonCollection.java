package ca.bcit.comp1451.session6.labB;

import java.util.ArrayList;

public class PersonCollection {
	
	private ArrayList<Person> person;
	
	public PersonCollection() {
		person = new ArrayList<Person>();
	}
	
	public void loadCollection() {
		Person e1 = new Employee("Mahnaz", 24, 25.00, 40);
		Person e2 = new Employee("Harman", 30, 30.50, 28);
		Person e3 = new Employee("Taran", 35, 28.75, 50);
		
		Person s1 = new Student("Simran", 29, false, 100);
		Person s2 = new Student("Prince", 23, true, 65);
		Person s3 = new Student("Harpreet", 50, true, 98);
		
		person.add(e1);
		person.add(e2);
		person.add(e3);
		person.add(s1);
		person.add(s2);
		person.add(s3);
	}
	
	public void testEquality() {
		Person s1 = new Student("Baldev", 29, false, 100);
		Person s2 = new Student("Baldev", 23, true, 100);
		person.add(s1);
		person.add(s2);
		Person e1 = new Employee("Love", 24, 25.00, 40);
		Person e2 = new Employee("Love", 30, 30.50, 28);
		person.add(e1);
		person.add(e2);
		if(s1.equals(s2)) {
			System.out.println("Students are of same object");
		}
		else {
			System.out.println("Students objects are different");
		}
		System.out.println();
		System.out.println(((Student)s1).toString());
		System.out.println(((Student)s2).toString());
		System.out.println();
		if(e1.equals(e2)) {
			System.out.println("Employees are of same object");
		}
		else {
			System.out.println("Employee's objects are different");
		}
		System.out.println();
		System.out.println(((Employee)e1).toString());
		System.out.println(((Employee)e2).toString());
	}
	public void displayAllDetails() {
		for(Person p: person) {
			if(p instanceof Employee) {
			System.out.println(	((Employee)p).toString());
			System.out.println();
			}
			if(p instanceof Student) {
				System.out.println(((Student)p).toString());
				System.out.println();
			}
		}
	}

}
