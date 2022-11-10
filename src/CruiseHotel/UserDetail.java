package CruiseHotel;

import java.util.Scanner;

public class UserDetail {

	String email;
	String password;
	String fullName;
	String mobileNumber;

	public void signUp() {
		System.out.println("Please sign up to book a service.");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your email address.");
			String email = sc.nextLine();
			if (email.contains("@")) {
				this.email = email;
			} else {
				System.out.println("InValid Email Id");
			}
		} while (!email.contains("@"));
		String pass = "";
		do {
			System.out.println("Enter the password that you want to use");
			pass = sc.nextLine();
			if (pass.length() > 4 && pass.length() < 8) {
				this.password = pass;
			} else {
				System.out.println("InValid Password");
			}
		} while (!(pass.length() > 4) && (pass.length() < 8));

		System.out.println("Enter your Full Name");
		String fullName = sc.nextLine();
		this.fullName = fullName;

		String num = "";
		do {
			System.out.println("Enter your phone number");
			num = sc.nextLine();
			if (num.length() == 10) {
				this.mobileNumber = num;
			} else {
				System.out.println("Invalid Phone Number.");
			}
			System.out.println("Thank you for registering!");

		} while (!(num.length() == 10));

	}

	public void login() {
		String username = "";
		String passw = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter your UserName");
			username = sc.nextLine();
			System.out.println("Please Enter your Password");
			passw = sc.nextLine();
			if (username.equals(this.email) && passw.equalsIgnoreCase(this.password)) {
				System.out.println("Login Succesfull");
			} else {
				System.out.println("Invalid UserName or Password");
			}

		} while (!username.equals(this.email) && passw.equalsIgnoreCase(this.password));
//		System.exit(0);
	}

}
