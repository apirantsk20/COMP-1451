package ca.bcit.comp1451.session2.labB;

import java.util.Random;

public class Dice {
	
	private int faceValue;
	private Random random;
	
	public Dice() {
		random = new Random();
	}
	
	public int roll(){
		faceValue = 0;
		 for(int count = 0; count < 6; count++) {
			 faceValue = random.nextInt(6) + 1;
		 }
		return faceValue;
	}


}
