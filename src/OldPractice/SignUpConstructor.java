package OldPractice;

import java.util.Scanner;

public class SignUpConstructor {

	String email;
	String password;
	String fullName;
	int phoneNumber;
	String enteredEmail;
	String enteredPass;
	Scanner sc = new Scanner(System.in);

	public SignUpConstructor(String email, String pass, String fullNAme) {

		this.email = email;
		this.password = pass;
		this.fullName = fullNAme;
	}

	protected void registr() {
		System.out.println("Enter Email Id");
		email = sc.nextLine();
		System.out.println("Enter Password");
		password = sc.nextLine();
		System.out.println("Enter Full Name");
		fullName = sc.nextLine();
		System.out.println("Enter Phone Number");
		phoneNumber = sc.nextInt();
	}

	public void login() {
		System.out.println("Enter Email");
		enteredEmail = sc.next();
		System.out.println("Enter Password");
		enteredPass = sc.next();
		if ((enteredEmail.equals(email)) || (enteredPass.equalsIgnoreCase(password))) {
			System.out.println("Valid Email and Password");
		} else {
			System.out.println("InValid Email and Password");
		}
	}

}
