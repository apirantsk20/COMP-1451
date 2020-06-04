package ca.bcit.comp1451.session3B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Utilities {
      HashMap<String, Integer> scan;
      Scanner input;
      
      public Utilities() {
    	  scan = new HashMap<String, Integer>();
    	  input = new Scanner(System.in);
      }
      
      public void populateHashMap() {
    	  System.out.println("please enter some text:");
    	  int count = 1;
    	  while(input.hasNext()) {
    		  String word = input.next().toLowerCase();
    		  if(scan.containsKey(word)) {
    			  count++;
    			  scan.put(word, count);
    		  }
    		  else {
    			  scan.put(word, count);
    		  }
    	  }
    	 
      }
      
      public void displayCollection() {
    	 Set<Map.Entry<String, Integer>> display = scan.entrySet();
    	 for(Map.Entry<String, Integer> S: display) {
    		 String key = S.getKey();
    		 int i = S.getValue();
    		 System.out.println("Key value is: "+key);
    		 System.out.println("number of times it appeared: "+i);
    	 }
      }
      
      public void getCount(String word) {
    	  String l = word.toLowerCase();
    	  Set<Map.Entry<String, Integer>> count = scan.entrySet();
    	  for(Map.Entry<String, Integer> c: count) {
    		  String w = c.getKey().toLowerCase();
    		  int num = c.getValue();
    		  if(w.equals(l)) {
    			  System.out.println("This "+ word+" appears "+num+" times.");
    		  }
    	  }
      }
      
      public void displayTheWord(int number) {
    	  Set<Map.Entry<String, Integer>> count = scan.entrySet();
    	  for(Map.Entry<String, Integer> c: count) {
    		  String w = c.getKey().toLowerCase();
    		  if(c.getValue().equals(number)) {
    			  System.out.println("The "+ w + " appears"+ number + " of times.");
    		  }
    	  }
      }
      
      public void removeWord(String word) {
    	 String woo = word.toLowerCase();
    	 if(scan.containsKey(woo)) {
    		 scan.remove(woo);
    	 }
    	 else {
    			  System.out.println("the word \""+  word + "\" doesnot exist in the haspmap.");
    	 }
    	  
      }
      
      
}
