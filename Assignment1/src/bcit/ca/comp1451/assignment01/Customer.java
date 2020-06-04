package bcit.ca.comp1451.assignment01;

public class Customer {
	private String name;
	private String address;
	private String dob;
	public Customer(String name, String address, String dob) {
		
		setName(name);
		setAddress(address);
		setDob(dob);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.isEmpty()) {
		this.name = formatName(name);
		}
		else {
			throw new IllegalArgumentException("Please enter name");
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(!address.isEmpty()) {
		this.address = address;
		}
		else {
			throw new IllegalArgumentException("Please enter address");
		}
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		if(!dob.isEmpty()) {
		this.dob = dob;
		}
		else {
			throw new IllegalArgumentException("Please enter date of birth");
		}
	}
	
	public String formatName(String word) {
		String word1 = word.toLowerCase();
		word1 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
		return word1;
	}

}
