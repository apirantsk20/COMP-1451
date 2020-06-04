package bcit.ca.comp1451.assignment01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionRecord {
	LocalDate ldate = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private double amountInCad;
	private Date date;
	private String accountNumber;
	private String transactionType;
	
	public TransactionRecord(double amountInCad, Date date, String accountNumber, String transactionType) {
		setAmountInCad(amountInCad);
		setDate(date);
		setAccountNumber(accountNumber);
		setTransactionType(transactionType);
	}

	public double getAmountInCad() {
		return amountInCad;
	}

	public void setAmountInCad(double amountInCad) {
		if(amountInCad>0) {
		this.amountInCad = amountInCad;
		}
		else {
			throw new IllegalArgumentException("Please enter positive number and number greater than zero");
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		if(date != null) {
		this.date = date;
		}
		else {
			throw new IllegalArgumentException("Please enter valid date");
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if(!accountNumber.isEmpty()) {
		this.accountNumber = accountNumber;
		}
		else {
			throw new IllegalArgumentException("Please enter account number");
		}
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		if(transactionType.equalsIgnoreCase("withdraw") || transactionType.equalsIgnoreCase("deposit")) {
		this.transactionType = transactionType;
		}
		else {
			throw new IllegalArgumentException("Please enter withdraw or deposit");
		}
	}
	
	public void displayTransactionRecord() {
		System.out.println("Type of transaction is: "+ getTransactionType());
		System.out.println("Amount of transaction: "+ getAmountInCad());
		System.out.println("Date of transation is: "+ ldate.format(formatter));
		System.out.println();
	}

}
