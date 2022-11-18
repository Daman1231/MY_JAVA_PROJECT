package CruiseHotel;

import java.util.Scanner;

public class Cruise extends UserDetail {

	String again = "";
	int adults;
	int children;
	double adultPrice;
	double childrenPrice;
	int numOfDays;
	double additionalFeatures;
	int adultBuffetPrice;
	int childrenBuffetPrice;
	String cruiseSelection;
	Scanner sc = new Scanner(System.in);

	private void cruiseSelection() {
		do {
			System.out.println(
					"Please Choose any of the cruise...Scenic Cruise, Sunset Cruise, Mystery Cruise and Discovery Cruise...");
			String selection = sc.nextLine();
			this.cruiseSelection = selection;
			if (selection.equalsIgnoreCase("Discovery Cruise")) {
				Discovery_Cruise discovery_Cruise = new Discovery_Cruise();
				additionalFeatures = discovery_Cruise.adventureGame();
				additionalFeatures = discovery_Cruise.cruise_Detials();
				adultPrice = discovery_Cruise.adultPrice;
				numOfDays = discovery_Cruise.numOfDays;
				childrenPrice = discovery_Cruise.childrenPrice;

			} else if (selection.equalsIgnoreCase("Scenic Cruise")) {
				Scenic_Cruise scenic_Cruise = new Scenic_Cruise();
				scenic_Cruise.cruise_Detials();
				additionalFeatures = scenic_Cruise.spa();
				adultPrice = scenic_Cruise.adultPrice;
				numOfDays = scenic_Cruise.numOfDays;
				childrenPrice = scenic_Cruise.childrenPrice;
			} else if (selection.equalsIgnoreCase("Mystery Cruise")) {
				Mystery_Cruise mystery_Cruise = new Mystery_Cruise();
				mystery_Cruise.cruise_Detials();
				additionalFeatures = mystery_Cruise.casino();
				adultPrice = mystery_Cruise.adultPrice;
				numOfDays = mystery_Cruise.numOfDays;
				childrenPrice = mystery_Cruise.childrenPrice;
			} else if (selection.equalsIgnoreCase("Sunset Cruise")) {
				Sunset_Cruise sunset_Cruise = new Sunset_Cruise();
				sunset_Cruise.cruise_Detials();
				additionalFeatures = sunset_Cruise.candleLight();
				adultPrice = sunset_Cruise.adultPrice;
				numOfDays = sunset_Cruise.numOfDays;
				childrenPrice = sunset_Cruise.childrenPrice;
			} else {
				System.out.println("Invalid Cruise...");
			}

		} while (!(cruiseSelection.equalsIgnoreCase("Scenic Cruise")
				|| cruiseSelection.equalsIgnoreCase("Discovery Cruise")
				|| cruiseSelection.equalsIgnoreCase("Mystery Cruise")
				|| cruiseSelection.equalsIgnoreCase("Sunset Cruise")));
	}

	private void noOfPeople() {
		System.out.println("Enter Number of Adults: ");
		adults = sc.nextInt();
		System.out.println("Enter Number of Children: ");
		children = sc.nextInt();
	}

	private void addBuffet() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.");
		String needBuffet = sc.next();
		if (needBuffet.equalsIgnoreCase("Yes")) {
			adultBuffetPrice = numOfDays * 25 * adults;
			childrenBuffetPrice = numOfDays * 5 * children;
		}
	}

	public void output() {
		cruiseSelection();
		noOfPeople();
		addBuffet();
		double priceOfAdult = adults * adultPrice * numOfDays;
		double priceOfChildren = adults * childrenPrice * numOfDays;
		double buffetTotalPriceAdult = priceOfAdult + adultBuffetPrice;
		double buffetTotalPriceChildren = priceOfChildren + childrenBuffetPrice;
		double totalPrice = priceOfAdult + priceOfChildren + buffetTotalPriceAdult + buffetTotalPriceChildren
				+ additionalFeatures;
		double hst = (totalPrice * 18) / 100;
		double FinalPrice = totalPrice + hst;
		System.out.println(cruiseSelection + "			@" + numOfDays + "nights 	:	$" + totalPrice + "\r\n"
				+ "Lunch Pre-Booked Special Rate Adults	@" + numOfDays + ": 	$" + priceOfAdult + "\r\n"
				+ "Lunch Pre-Booked Special Rate Children @" + numOfDays + "	: 	$" + priceOfChildren + "\r\n"
				+ "Total Price					: 	$" + totalPrice + "\r\n" + "HST	@ 18%					: 	$" + hst
				+ "\r\n" + "Final Price					:	$" + FinalPrice + "\r\n" + "");
	}
}