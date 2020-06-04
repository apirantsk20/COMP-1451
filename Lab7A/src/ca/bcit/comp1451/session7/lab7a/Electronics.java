package ca.bcit.comp1451.session7.lab7a;
  

	public abstract class Electronics {
		private String brand;
		private double price;
		private int warrantyInMonths;
		
		
		public Electronics(String brand, double price, int warrantyInMonths) {
			setBrand(brand);
			setPriceInCad(price);
			setWarrantyInMonths(warrantyInMonths);
		}

		public String getBrand() {
			return brand;
		}

		public double getPriceInCad() {
			return price;
		}

		public int getWarrantyInMonths() {
			return warrantyInMonths;
		}

		public void setBrand(String brand) {
			if (brand != null && !brand.equals("")){
				this.brand = brand;
			}
			else{
				this.brand = "Unknown";
			}
		}

		public void setPriceInCad(double price) {
			if (price > 0.0){
				this.price = price;
			}
			else{
				this.price = 1;
			}
		}

		public void setWarrantyInMonths(int warrantyInMonths) {
			if (warrantyInMonths >= 0){
				this.warrantyInMonths = warrantyInMonths;
			}
			
		}
		
		public abstract void increasePrice(double percentage);


		
		@Override
		public String toString() {
			return this.getClass().getSimpleName() + " " + brand + ", $" + price + ", Warranty length: " + warrantyInMonths + " months. ";
		}
		

}
