package bcit.ca.comp1451.assignment01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Date {
	private static final int CURRENT_YEAR = 2020;
	private int day;
	private int month;
	private int year;
	HashMap<Integer, String> date;
	
	public Date(int day, int month, int year) {
		date = new HashMap<Integer, String>();
		setDay(day);
		setMonth(month);
		setYear(year);
		populate();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) {
		this.day = day;
		}
		else {
			this.day = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>=1 && month <= 12) {
		this.month = month;
		}
		else {
			this.month = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=1900 && year<= CURRENT_YEAR) {
		this.year = year;
		}
		else {
			this.year = 1900;
		}
	}
	
	private void populate() {
		date.put(1, "January");
		date.put(2, "Febuary");
		date.put(3,"March");
		date.put(4, "April");
		date.put(5, "May");
		date.put(6, "June");
		date.put(7, "July");
		date.put(8, "August");
		date.put(9, "September");
		date.put(10, "October");
		date.put(11, "November");
		date.put(12, "December");
		
	}
	
	public String displayDate(int day, int month, int year) {
		String strDate = "";
		if(day>=1 && day<=31 && month >= 1 && month <= 31 && year >=1900 && year <= CURRENT_YEAR) {
		String month1 = "";
		if(month < 10) {
			month1 = "0" + Integer.toString(getMonth());
		}
		else {
			month1 = Integer.toString(getMonth());
		}
		
		Set<HashMap.Entry<Integer, String>> map = date.entrySet();
		for(Map.Entry<Integer, String> m: map) {
	if(month == m.getKey()) {
		System.out.println(month1+"/"+m.getValue()+"/"+year);
	}
		}

	}
		return strDate;
}
}
