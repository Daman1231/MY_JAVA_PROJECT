
public class License_Method {

	String license(String currentLicense) {
		String licenseToBeApplied = null;
		
		 if(currentLicense.equals("No_License")) {
			licenseToBeApplied = "G1";
		}
		else if(currentLicense.equals("G1")) {
			licenseToBeApplied = "G2";
		}
		else if(currentLicense.equals("G2")) {
			
			licenseToBeApplied = "G";
		}
		else if(currentLicense.equals("G")) {
			licenseToBeApplied = "Drive Safe";
		}
		
		
		return licenseToBeApplied;
	}
	
}