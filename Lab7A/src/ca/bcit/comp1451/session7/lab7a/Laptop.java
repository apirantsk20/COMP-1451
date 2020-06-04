package ca.bcit.comp1451.session7.lab7a;


public class Laptop extends Computer{
	
private double screenSize;
	
	public Laptop(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeGB, double screenSize) {
		super(brand, price, warrantyInMonths, cpuSpeed, memorySizeGB);
		setScreenSize(screenSize);
	}

	
	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		if (screenSize > 0){
			this.screenSize = screenSize;
		}
		else{
			this.screenSize = 1;
		}
	}


	@Override
	public String toString() {
		return super.toString() + ", screen size: " + screenSize + " inches";
	}
	
}
