package ca.bcit.comp1451.session7.lab7a;


	public class CellPhone extends Electronics {
		
		private double batteryLifeTime;

		public CellPhone(String brand, double price, int warrantyInMonths, double batteryLifeTime) {
			super(brand, price, warrantyInMonths);
			setBatteryLifeTime(batteryLifeTime);
		}
		
		public double getBatteryLifeTime() {
			return batteryLifeTime;
		}

		public void setBatteryLifeTime(double batteryLifeTime) {
			if (batteryLifeTime >= 0.0){
				this.batteryLifeTime = batteryLifeTime;
			}
		}
@Override
		public void increasePrice(double percentage){
			if (percentage > 0.0){
				setPriceInCad(getPriceInCad() + (getPriceInCad() * percentage));
				setWarrantyInMonths(getWarrantyInMonths() + 6);
			}
		}
		
		@Override
		public String toString() {
			return super.toString() + "Battery lifetime: " + batteryLifeTime + " hours.";
		}
	

}
