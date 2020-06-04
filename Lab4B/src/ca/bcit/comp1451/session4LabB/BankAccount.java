package ca.bcit.comp1451.session4LabB;

public class BankAccount {
	
	private String name;
	private double balance;
	
	
	
	public BankAccount(String name, double balance) {
		setName(name);
		setBalance(balance);
	}
	
	public BankAccount(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
		this.name = name;
		}
		else {
			this.name = "unknown";
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 0) {
		this.balance = balance;
		}
	}
	
	public void deposit(double d) {
		if(d>0) {
			balance = d+balance;
		}
	}
	
	public void withdraw(double w) {
		if(w>0 && w <= balance) {
			balance = balance - w;
		}
	}
	
	public void applyInterest() {
		balance = balance * 1.05;
	}

}
