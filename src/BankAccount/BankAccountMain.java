package BankAccount;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount accountManvir = new BankAccount("485667962", 4532, 956.25);
		System.out.println("Account Number " + accountManvir.accountNumber);
		System.out.println("PIN Number " + accountManvir.pin);
		System.out.println("Balance Amount $" + accountManvir.balance);

		BankAccount accountSwaroop = new BankAccount("4856666851", 0556, 850.20);
		System.out.println("Account Number " + accountSwaroop.accountNumber);
		System.out.println("PIN Number " + accountSwaroop.pin);
		System.out.println("Balance Amount $" + accountSwaroop.balance);

		BankAccount accountkuldeep = new BankAccount("4856611662", 3498, 989.76);
		System.out.println("Account Number " + accountkuldeep.accountNumber);
		System.out.println("PIN Number " + accountkuldeep.pin);
		System.out.println("Balance Amount $" + accountkuldeep.balance);

		BankAccount accountNavjot = new BankAccount("4856698101", 1766, 73.52);
		System.out.println("Account Number " + accountNavjot.accountNumber);
		System.out.println("PIN Number " + accountNavjot.pin);
		System.out.println("Balance Amount $" + accountNavjot.balance);

		BankAccount accountSahib = new BankAccount("4856677850", 6388, 1055.25);
		System.out.println("Account Number " + accountSahib.accountNumber);
		System.out.println("PIN Number " + accountSahib.pin);
		System.out.println("Balance Amount $" + accountSahib.balance);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number");
		String accountNumber = sc.next();
		System.out.println("Enter Your PIN Number");
		String pinNumber = sc.next();

		if(accountNumber.equals(accountManvir) && pinNumber.equals(accountManvir)) {
			System.out.println(accountManvir.balance);
		}
		
		
	}

}