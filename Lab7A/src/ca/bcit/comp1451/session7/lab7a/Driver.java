package ca.bcit.comp1451.session7.lab7a;


public class Driver {
	
	Electronics[] electronics;

	public Driver(){
		electronics = new Electronics[3];
		loadCollection();
	}

	public void loadCollection(){
		
		Electronics phone = new CellPhone("Nokia TS200", 300.00, 18, 3.5);
		Electronics computer = new Computer("Dell D2100", 1000.00, 24, 2500, 512);
		Electronics laptop = new Laptop("HP N5170", 1500.00, 24, 1500, 256, 15.0);
		
		electronics[0] = phone;
		electronics[1] = computer;
		electronics[2] = laptop;

	}


	public void displayAll(){
		for (int i = 0; i < electronics.length; i++) {
			System.out.println(electronics[i]);
		}
		System.out.println();
	}

	public void increasePrices(double amount) {
		System.out.println("Increasing the prices by "+ amount + "% :");
		System.out.println();
		for (int i = 0; i < electronics.length; i++) {
			electronics[i].increasePrice(5.0);
		}
		}

	public static void main(String[] args){
		
		
		Driver demo = new Driver();
		demo.displayAll();
		demo.increasePrices(0.05);
		demo.displayAll();
	}
}
