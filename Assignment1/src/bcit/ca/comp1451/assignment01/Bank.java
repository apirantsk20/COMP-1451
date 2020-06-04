package bcit.ca.comp1451.assignment01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bank {
	private String bankName;
	HashMap<String, Account> account;
	private Scanner input;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		account = new HashMap<String, Account>();
		input = new Scanner(System.in);
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		if(bankName != null) {
		this.bankName = bankName;
		}
		else {
			throw new IllegalArgumentException("Please enter the name of the bank");
		}
	}
	
	public void addAccount(Account toadd) {
		if(toadd != null) {
			account.put(toadd.getAccountNumber(), toadd);
		}
	}
	
	public Account getAccount(String accountNumber) {
		if(accountNumber!=null) {
			Set<HashMap.Entry<String,Account>> map = account.entrySet();
			for(Map.Entry<String, Account> a: map) {
				if(a.getKey().contains(accountNumber)) {
					a.getValue().displayAccount();
					return a.getValue();
				}
			
			else {
				System.out.println(accountNumber+" account number is not present in the list");
			}
			}
		}
		else {
			throw new IllegalArgumentException("Please enter account number");
		}
		
		return null;
	}
	
	public void showTransactions(String name) {
		String name1 = "";
		int count = 0;
		Set<HashMap.Entry<String, Account>> map = account.entrySet();
		for(Map.Entry<String, Account> m: map) {
		name1 =	m.getValue().getCustomer().getName();
		if(name1.equalsIgnoreCase(name)) {
			m.getValue().displayTransaction();
			m.getValue().displayAccount();
			count++;
		}
		}
		if(count == 0) {
			System.out.println(name +" this customer is not in the list.");
		}
	}
	
	public void displayAccountNumbers() {
		Set<HashMap.Entry<String, Account>> map = account.entrySet();
		for(Map.Entry<String, Account> m: map) {
			System.out.println(m.getKey());
		}
	}
	
	public void makeTransaction() {
		String quit = "";
		System.out.println("Please enter account number: ");
		
				String accNum = input.next();
		if(account.containsKey(accNum)) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Transactions");
			System.out.println("Please enter Y anytime whenever you want to quit.");
			while(input.hasNext() && !quit.equalsIgnoreCase("yes")) {
				if(input.hasNextInt()) {
				
				int num1 = input.nextInt();
				if(num1==1) {
					System.out.println("please enter amount to deposit: ");
					double deposit = input.nextDouble();
					account.get(accNum).deposit(deposit);
					TransactionRecord t = new TransactionRecord(deposit,account.get(accNum).getDateOfAccountCreated(), accNum.toUpperCase(), "deposit");
					account.get(accNum).addTransaction(t);
					account.get(accNum).displayAccount();
				}
				else if(num1 == 2) {
					System.out.println("Please enter amount to withdraw: ");
					double withdraw = input.nextDouble();
					account.get(accNum).withdraw(withdraw);
					TransactionRecord t = new TransactionRecord(withdraw,account.get(accNum).getDateOfAccountCreated(), accNum.toUpperCase(), "withdraw");
					account.get(accNum).addTransaction(t);
					account.get(accNum).displayAccount();
				}
				else if(num1 == 3) {
					System.out.println("Your transaction record is: ");
					System.out.println();
					account.get(accNum).displayTransaction();
				}
				
				
				else {
					String oneWord = input.next();
					if(oneWord.equalsIgnoreCase("y")) {
						quit = "yes";
					}
				}
				}
				
			}
		}
		else {
			System.out.println("this account number does not match the list.");
		}
		System.out.println("you are out of the transaction now.");
		
	}

}
