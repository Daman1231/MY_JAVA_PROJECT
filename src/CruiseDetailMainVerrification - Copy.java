

import java.util.Scanner;

public class CruiseDetailMainVerrification {
	public static void main(String[] args) {
		String email;
		int password;
		String name;
		String phoneNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Cruise Booking.\r\n"
				+ "Please sign up to book a cruise.\r\n"
				+ "");
		System.out.println("Enter your email address");
		email = sc.next();
		System.out.println("Enter the password that you want to use");
		password = sc.nextInt();
		System.out.println("Enter your Full Name");
		name = sc.next();
		System.out.println("Enter your phone number");
		phoneNum = sc.next();
		System.out.println("Thank you for registering!");
		
		CruiseDetailSignup_Verification detailSignup_Verification = new CruiseDetailSignup_Verification(email, password, name, phoneNum);
		detailSignup_Verification.setEmailID(email);
		detailSignup_Verification.getEmailID();
		
		detailSignup_Verification.getFullName();
		detailSignup_Verification.setFullName(name);
		detailSignup_Verification.getPhoneNumber();
		detailSignup_Verification.setPhoneNumber(phoneNum);
		detailSignup_Verification.setPassword(password);
		
		
		String again;
		String cruiseSelec;
		int index = 0;
		CruiseDetails scenicCruise = new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruiseDetails sunsetCruise = new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruiseDetails discoveryCruise = new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruiseDetails mysteryCruise = new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2);
		CruiseDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
							+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
			cruiseSelec = sc.nextLine();
			int counTry = 1;
			while (!cruiseSelec.equalsIgnoreCase("Scenic Cruise") && !cruiseSelec.equalsIgnoreCase("Sunset Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Discovery Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Mystery Cruise")) {
				++counTry;
				if (counTry > 3) {
					System.out.println("Please Start over,you have reached the input limit");
					System.exit(0);
				}
				System.out.println("Invalid Selection try again below");
				cruiseSelec = sc.nextLine();
			}

			for (int i = 0; i < cruiseDetails.length; i++) {
				if ((cruiseSelec).equalsIgnoreCase(cruiseDetails[i].cruiseSelection)) {
					index = i;
					System.out.println("The cruise that you have selected is " + cruiseDetails[i].cruiseSelection
							+ " which is a " + cruiseDetails[i].numDay + " day cruise\r\n"
							+ "Price for Adults	(greater than 12)	: " + cruiseDetails[i].priceForAdult
							+ " per day\r\n" + "Price for kids above 5			: " + cruiseDetails[i].priceForchildren
							+ " per day\r\n" + "");
					break;
				}

			}
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			again = sc.nextLine();
		} while (!again.equalsIgnoreCase("Y"));

		System.out.println("Enter the number of adults");
		int numAdults = sc.nextInt();
		System.out.println("Enter the number of children");
		int numChildren = sc.nextInt();
		int ageAboveFive = 0;
		int age;
		if (numChildren > 0) {
			for (int i = 0; i < numChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				age = sc.nextInt();
				while (age >= 13 || age <= 0) {
					System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
					age = sc.nextInt();
				}

				if (age >= 5) {
					ageAboveFive++;
				}
			}
		}

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
						+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
		String buffetMeal = sc.next();
		cruiseDetails[index].setbuffetPrice(buffetMeal);
		cruiseDetails[index].output(numAdults, ageAboveFive);

	}
}

