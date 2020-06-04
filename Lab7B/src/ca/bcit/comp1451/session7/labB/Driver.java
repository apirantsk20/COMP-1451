package ca.bcit.comp1451.session7.labB;

import java.util.ArrayList;
public class Driver {
	



	public static void main(String[] args) {
		 ArrayList<Employee> list = new ArrayList<Employee>();
		
		 list.add(new SalesEmployee("Simran", 15, 9.25));
		 list.add(new SalesEmployee(" Ritu", 25, 14.60));
		 list.add(new HourlyEmployee("Harkamal", 20, 14.60));
		 list.add(new HourlyEmployee("Kavita", 40, 18.50));
		
		 for(Employee e :list){
				
				System.out.println(e);
				}

	}

}
