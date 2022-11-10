
public class CruiseDetailSignup_Verification1 {

	String emailID;
	int password;
	String fullName;
	String phoneNumber;

	public CruiseDetailSignup_Verification1(String email, int pass, String fullNam, String mobileNum) {
		emailID = email;
		password = pass;
		fullName = fullNam;
		phoneNumber = mobileNum;

	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		if(emailID.equals(this.emailID)) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}
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

	public void setPassword(int password) {
		this.password = password;
	}
}
