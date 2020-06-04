package bcit.ca.comp1451.assignment01;

import java.util.ArrayList;

public class Account {

	private static int num = 1000;
	private Customer customer;
	private String accountNumber;
	private Date dateOfAccountCreated;
	private double balance;
	private ArrayList<TransactionRecord> record;
	
	public Account(Customer customer, Date dateOfAccountCreated) {
		record = new ArrayList<TransactionRecord>();
		accountNumber = createAccountNumber();
		setCustomer(customer);
		setDateOfAccountCreated(dateOfAccountCreated);
	}
	
	private String createAccountNumber() {
	  num++;
	  return "A"+ Integer.toString(num);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Date getDateOfAccountCreated() {
		return dateOfAccountCreated;
	}

	public void setDateOfAccountCreated(Date dateOfAccountCreated) {
		this.dateOfAccountCreated = dateOfAccountCreated;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit (double amount) {
		
		if(amount>0) {
			this.balance = amount + this.balance;
			return true;
		}
		else {
			System.out.println("the amount deposited is invalid");
			return false;
		}
	}
	
	public boolean withdraw(double amount) {
		if(amount>0 && amount <= balance) {
			this.balance = this.balance-amount;
			return true;
		}
		else {
			System.out.println("the amount to withdraw is invalid");
			return false;
		}
	}
	
	public void addTransaction(TransactionRecord transaction) {
		record.add(transaction);
	}
	
	public void displayTransaction() {
		for(TransactionRecord r: record) {
			r.displayTransactionRecord();
		}
	}
	
	public void displayAccount() {
		System.out.println("Customer's full name is: "+ customer.formatName(customer.getName()));
		System.out.println("Account Number is: "+ getAccountNumber());
		System.out.println("Balance of this customer is: "+ getBalance());
		System.out.println("the date when account was created is: "+ dateOfAccountCreated.displayDate(dateOfAccountCreated.getDay(), dateOfAccountCreated.getMonth(), dateOfAccountCreated.getYear()));
	}

}
