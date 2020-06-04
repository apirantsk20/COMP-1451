package ca.bcit.comp1451.session2.labB;

public class Games {
	public static final int NUMBER = 11;

	Dice dice = new Dice();
	
	public void playChicago() {
		int pointCounter = 0;
		int index = 0;
		while(index < NUMBER) {
			int roundCounter = index+2;
			
			int fDice = dice.roll();
			int sDice = dice.roll();
			
			System.out.println("Round number: "+ roundCounter);
			System.out.println("First die value was "+ fDice);
			System.out.println("Second die value was "+ sDice);
			System.out.println();
			
			if ((fDice + sDice) == roundCounter) {
				System.out.println("Points earned 1");
				pointCounter++;
			}
			
			index++;
		}
		System.out.println("Your score for the game was: "+pointCounter);

	}
}
