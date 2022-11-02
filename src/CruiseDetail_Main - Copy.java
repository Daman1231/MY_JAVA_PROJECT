
import java.util.Scanner;

public class CruiseDetail_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String again;
		String continueSelection;
		String cruiseSelec;
		int index = 0;

		CruiseDetail_SignUp cruiseDetail_SignUp = new CruiseDetail_SignUp("daman.singh00786@gmail.com", 1234,
				"Daman_Preet_Singh", "6474020546", "Daman", 1100);
		System.out.println("Welcome to Cruise Booking.");
		System.out.println("Please sign up to book a cruise.");

		cruiseDetail_SignUp.getEmailId();
		cruiseDetail_SignUp.setEmailId("daman.singh00786@gmail.com");

		cruiseDetail_SignUp.getName();
		cruiseDetail_SignUp.updateUsername("Daman_Preet_Singh", "Daman");
		String updatedUsername = cruiseDetail_SignUp.getUpdatedUsername();
		System.out.println(updatedUsername);

		cruiseDetail_SignUp.getPassword();
		cruiseDetail_SignUp.updatePassword(1234, 1100);
		int updatedPassword = cruiseDetail_SignUp.getUpdatedPassword();
		System.out.println(updatedPassword);

		cruiseDetail_SignUp.getNumber();

		System.out.println("Thank you for registering!");

		do {
			cruiseDetail_SignUp.getEnterUserName();
			cruiseDetail_SignUp.setEnterUsername(updatedUsername);
			cruiseDetail_SignUp.getEnterPassword();
			cruiseDetail_SignUp.setEnterUserPassword(updatedPassword);
		} while ((!updatedUsername.equals(updatedUsername)) && ((updatedPassword != updatedPassword)));

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

		do {
			System.out.println(
					"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
			continueSelection = sc.nextLine();
		} while (!continueSelection.equalsIgnoreCase("Y"));

		int chnangeExistingPassword = cruiseDetail_SignUp.getChangePassword();
		System.out.println("Updated Password is: " + chnangeExistingPassword);

	}

}