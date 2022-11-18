package CruiseHotel;

import java.util.Scanner;

public class UserDetail {

	String email;
	String password;
	String fullName;
	String mobileNumber;
	Scanner sc = new Scanner(System.in);

	public void signUp() {
		System.out.println("Please sign up to book a service.");
		System.out.println("Enter your email address.");
		email = sc.nextLine();
		while (!email.contains("@")) {
			System.out.println("InValid Email Id");
			email = sc.nextLine();
		}
		System.out.println("Enter the password that you want to use");
		password = sc.nextLine();
		while (!(password.length() > 4) && !(password.length() < 8)) {
			System.out.println("InValid Password");
			password = sc.nextLine();
		}
		System.out.println("Enter your Full Name");
		fullName = sc.nextLine();
		System.out.println("Enter your phone number");
		mobileNumber = sc.nextLine();
		while (!(mobileNumber.length() == 10)) {
			System.out.println("Invalid Phone Number.");
			mobileNumber = sc.nextLine();
		}
		System.out.println("Thank you for registering!");
	}

	public void login() {
		String username;
		String passw;
		do {
			System.out.println("Please Enter your UserName");
			username = sc.nextLine();
			System.out.println("Please Enter your Password");
			passw = sc.nextLine();
			if (username.equalsIgnoreCase(email) && passw.equals(password)) {
				System.out.println("Login Succesfull");
			} else {
				System.out.println("Invalid UserName or Password");
			}

		} while (!(username.equalsIgnoreCase(email) && passw.equals(password)));
	}
}
