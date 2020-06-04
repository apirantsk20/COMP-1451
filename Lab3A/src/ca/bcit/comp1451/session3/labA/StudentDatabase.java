package ca.bcit.comp1451.session3.labA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDatabase {
	
	private HashMap<String, int[]> quizMarks;
	public static final int NUM_QUIZZES	= 10;
	public static final int MIN_GRADE		= 0;
	public static final int MAX_GRADE		= 100;
	
	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
		
	}
	
	private String formatName(String name) {
		name = name.toLowerCase();
		name = name.substring(0, 1).toUpperCase()+name.substring(1);
		return name;
	}

	public void addStudent(String studentName) {
		int[] value = new int[NUM_QUIZZES];
		
		quizMarks.put(formatName(studentName), value);
	}

	public void displayQuizzes(String student) {
		System.out.println("Then name of the student is: "+ formatName(student));
		System.out.println();
		int[] marks = quizMarks.get(formatName(student));
		for(int i = 0; i<marks.length; i++) {
			System.out.print(marks[i]+"  ");
		}
		System.out.println();
	}
	
	public void changeQuizMark(String studentName, int whichQuiz, int newMark) {
		if (quizMarks.get(formatName(studentName)) != null && whichQuiz < NUM_QUIZZES) {
			if (newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
				int[] quiz = quizMarks.get(formatName(studentName));
				quiz[whichQuiz] = newMark;
				quizMarks.put(formatName(studentName), quiz);
				System.out.println(formatName(studentName)+" quiz number has been changed");
				System.out.println("new numbers are:");
				System.out.println(Arrays.toString(quiz));
				System.out.println();
			} else {
				System.out.println("Marks must be within 0 and 100.");
			}
		} else {
			System.out.println("Name is invalid or quiz chosen is invalid.");
		}
		}
		
	
		
	
	
	public void showQuizMarks() {
		Set<Map.Entry<String, int[]>> mySet = quizMarks.entrySet();
		for(Map.Entry<String, int[]> k : mySet) {
            String num = Arrays.toString(k.getValue());
			System.out.println(num);
		}
	}
}
