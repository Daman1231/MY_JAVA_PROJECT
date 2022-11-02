package assignmentweek8;

public class CruiseDetailSignup_Verification {
	String emailID;
	String password;
	String fullName;
	String phoneNumber;
	String username;
	String newUserName = " ";
	String newPassword;

	public CruiseDetailSignup_Verification(String email, String user, String pass, String fullNam, String mobileNum) {
		emailID = email;
		password = pass;
		fullName = fullNam;
		phoneNumber = mobileNum;
		username = user;

	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {

		this.emailID = emailID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login(String userName, String password) {
		boolean isValid = false;
		if ((this.username.equalsIgnoreCase(userName) || this.password.equalsIgnoreCase(password))) {
			System.out.println("Login Succesfull");
			isValid = true;
		} else {
			System.out.println("Invalid UserName or Password");
		}

		return isValid;

	}

	public void updateUserName(String userName, String newUserName) {
		if (this.username.equalsIgnoreCase(userName)) {
			this.username = newUserName;
		}
	}

	public String getupdatedUsername() {
		return username;
	}

	public void updatePassword(String password, String newPassword) {
		if (this.password.equalsIgnoreCase(password)) {
			this.password = newPassword;
		}
	}

	public String getUpdatedPassword() {
		return password;
	}

}
