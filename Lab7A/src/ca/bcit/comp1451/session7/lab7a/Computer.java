package ca.bcit.comp1451.session7.lab7a;

public class Computer extends Electronics {

	private int cpuSpeed;
	private int memorySizeGB;

	public Computer(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeGB) {
		super(brand, price, warrantyInMonths);
		setCpuSpeed(cpuSpeed);
		setMemorySizeGB(memorySizeGB);
	}

	public int getCpuSpeed() {
		return cpuSpeed;
	}

	public int getMemorySizeGB() {
		return memorySizeGB;
	}

	public void setCpuSpeed(int cpuSpeed) {
		if (cpuSpeed > 0) {
			this.cpuSpeed = cpuSpeed;
		} else {
			this.cpuSpeed = 1;
		}
	}

	public void setMemorySizeGB(int memorySizeGB) {
		if (memorySizeGB > 0) {
			this.memorySizeGB = memorySizeGB;
		} else {
			this.memorySizeGB = 1;
		}
	}

	@Override
	public void increasePrice(double percentage) {
		if (percentage > 0.0) {
			setPriceInCad(getPriceInCad() + (getPriceInCad() * percentage));
			setWarrantyInMonths(getWarrantyInMonths() + 12);
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Cpu Speed: " + cpuSpeed + "MHz, memory size: " + memorySizeGB + " GB";
	}

}
