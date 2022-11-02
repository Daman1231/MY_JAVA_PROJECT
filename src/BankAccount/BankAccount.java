package BankAccount;

public class BankAccount {

	String accountNumber;
	int pin;
	double balance;

	public BankAccount(String userAccountNumber, int userPin, double availableBalance) {
		accountNumber = userAccountNumber;
		pin = userPin;
		balance = availableBalance;

	}

	void checkAccountCredentials(String accountNo, int pinNum, double checkBalance) {
		accountNumber = accountNo;
		pin = pinNum;
		balance = checkBalance;
	}
}