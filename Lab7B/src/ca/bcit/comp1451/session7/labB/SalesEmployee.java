package ca.bcit.comp1451.session7.labB;

public class SalesEmployee extends Employee {
	
	private int numberOfSoldUnits;
	private double commissionRatePerUnit;

	public SalesEmployee(String name, int numberOfSoldUnits, double commissionRatePerUnit) {
		super(name);
		setNumberOfSoldUnits(numberOfSoldUnits);
		setCommissionRatePerUnit(commissionRatePerUnit);
	}

	public int getNumberOfSoldUnits() {
		return numberOfSoldUnits;
	}

	public double getCommissionRatePerUnit() {
		return commissionRatePerUnit;
	}

	public void setNumberOfSoldUnits(int numberOfSoldUnits) {
		if (numberOfSoldUnits >= 0){
			this.numberOfSoldUnits = numberOfSoldUnits;
		}
		else{
			this.numberOfSoldUnits = 0;
		}
	}


	public void setCommissionRatePerUnit(double commissionRatePerUnit) {
		if (commissionRatePerUnit >= 0.0){
			this.commissionRatePerUnit = commissionRatePerUnit;
		}
		else{
			this.commissionRatePerUnit = 0.0;
		}
	}

	
	 @Override
	public double calculatePay() {
		return getNumberOfSoldUnits() * getCommissionRatePerUnit();
	}
	 
	@Override
	public String toString() {
		return super.toString()
	            + "Type of employee : Sales. \n" 
	            + "Number of units sold : "+ getNumberOfSoldUnits() + "\n"
				+ "Commision rate: " + getCommissionRatePerUnit() + "\n"
				+"Total pay: " + calculatePay() +"\n";
	}
	 
}
