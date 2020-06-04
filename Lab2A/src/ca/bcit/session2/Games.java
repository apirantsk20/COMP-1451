package ca.bcit.session2;

import java.util.ArrayList;
import java.util.Scanner;


public class Games {
	
    private Scanner input;
    private ArrayList<String> word;
    private ArrayList<Integer> num;
    private ArrayList<Double> dub;
	
	public Games() {
		  input = new Scanner(System.in);
		  word = new ArrayList<String>();
		  num = new ArrayList<Integer>();
		  dub = new ArrayList<Double>();
		  
	}
	
	public void textParser() {
		System.out.println("enter a String"); 
	

		
		while(input.hasNext()) {
			if(input.hasNextInt()) {
				int num1 = input.nextInt();
				num.add(num1);
				
			}else if(input.hasNextDouble()) {
				double value = input.nextDouble();

				dub.add(value);
				
			} else  {
				String oneWord = input.next();

				word.add(oneWord);
			
			}
			
		
	}

		System.out.println("The number of intergers is: "+ num.size());
		System.out.println("the value "+ num +" is integer");
		System.out.println("The number of double is: "+ dub.size());
		System.out.println("the value "+ dub +" is double");
		System.out.println("the number of words are: "+word.size());
		System.out.println(word + " is a String");
	}
}
