package ca.bcit.comp1451.session3.labA;

public class Driver {

	public static void main(String[] args) {
StudentDatabase theStudentDataBase = new StudentDatabase();
		
		theStudentDataBase.addStudent("simran");
		theStudentDataBase.addStudent("mom");
		theStudentDataBase.addStudent("papa");
		
		System.out.println("Single Display");
		theStudentDataBase.displayQuizzes("simran");
		System.out.println("---------------");
		
		theStudentDataBase.changeQuizMark("mom", 3, 10);
		theStudentDataBase.changeQuizMark("papa", 2, 8);
		
		theStudentDataBase.showQuizMarks();

	}

}
