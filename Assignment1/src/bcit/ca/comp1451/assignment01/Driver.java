package bcit.ca.comp1451.assignment01;

public class Driver {

	public static void main(String[] args) {
		Customer cus1 = new Customer("simran", "Surrey", "26 jan 1991");
		Customer cus2 = new Customer("harpreet", "India", "9 sept 1972");
		Customer cus3 = new Customer("baldev", "Punjab", "11 feb 1964");
		Customer cus4 = new Customer("jagmeet", "haryana", "7 dec 1994");
		
		Account acc1 = new Account(cus1, new Date(7, 5, 2020));
		Account acc2 = new Account(cus2, new Date(12, 4, 1991));
		Account acc3 = new Account(cus3, new Date(4, 4, 2010));
		Account acc4 = new Account(cus4, new Date(5,8,1995));
		
		Bank bank = new Bank("Scotia");
		bank.addAccount(acc1);
		bank.addAccount(acc2);
		bank.addAccount(acc3);
		bank.addAccount(acc3);
		bank.addAccount(acc4);
		
		bank.displayAccountNumbers();
		bank.makeTransaction();

	}

}
