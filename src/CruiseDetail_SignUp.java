
import java.util.Scanner;

public class CruiseDetail_SignUp {
	String emailId;
	int password;
	String name;
	String number;
	String userName;
	int userPassword;
	int countTry = 0;

	public CruiseDetail_SignUp(String email, int requiredPassword, String fullName, String phoneNumber, String user,
			int pass) {
		emailId = email;
		password = requiredPassword;
		name = fullName;
		number = phoneNumber;
		userName = user;
		pass = userPassword;
	}

	public void setEmailId(String email) {

		if (email.equals(emailId)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}
	}

	public void getEmailId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email Address.");
		emailId = sc.next();

	}

	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Current Valid Full Name to Update it");
		name = sc.next();
		return name;
	}

	public void updateUsername(String currentUsername, String newUsername) {
		if (this.name.equalsIgnoreCase(currentUsername)) {
			this.name = newUsername;
		} else {
			System.out.println("You Have entered a Wrong UserName");
		}

	}

	public String getUpdatedUsername() {
		return name;
	}

	public String getuserName() {
		return name;
	}

	public void updatePassword(int currentPassword, int newPassword) {
		if (this.password == currentPassword) {
			this.password = newPassword;
		} else {
			System.out.println("You Have entered a Wrong Password");
		}

	}

	public int getUpdatedPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		number = sc.next();
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPassword(int currentPassword, int newPassword) {

		if (password == currentPassword) {
			password = newPassword;
		} else {
			System.out.println("You Have Entered a Wrong Password.");
		}
	}

	public void getPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Current Valid Password to Update it");
		password = sc.nextInt();

	}

	public void loginUsername(String newUsername) {
		name = newUsername;

	}

	public void setEnterUsername(String username) {

		if (userName.equals(name)) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}

	}

	public void getEnterUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName ");
		userName = sc.next();
	}

	public void setEnterUserPassword(int pass) {

		if (pass == password) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}

	public String validateUserName(String enteredUserName) {
		if (this.name.equalsIgnoreCase(enteredUserName)) {

		}
		return enteredUserName;
	}

	public void getEnterPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pasword ");
		password = sc.nextInt();
	}

	public void changePassword(int currentPass, int newPassword) {
		if (this.password == currentPass) {
			currentPass = newPassword;
		} else {
			System.out.println("Wrong Password");
		}
	}

	public int getChangePassword() {
		return password;
	}

}