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

	public void cruiseSelection() {
		do {
			System.out.println(
					"Please Choose any of the cruise...Scenic Cruise, Sunset Cruise, Mystery Cruise and Discovery Cruise...");
			Scanner sc = new Scanner(System.in);
			String selection = sc.nextLine();
			this.cruiseSelection = selection;
			if (selection.equalsIgnoreCase("Discovery Cruise")) {
				Discovery_Cruise discovery_Cruise = new Discovery_Cruise();
				discovery_Cruise.cruise_Detials();
				numOfDays = discovery_Cruise.getNoOfDays();
				adultPrice = discovery_Cruise.getPriceOfAdult();
				childrenPrice = discovery_Cruise.getPriceOfChildren();
				additionalFeatures = discovery_Cruise.adventureGame();
			} else if (selection.equalsIgnoreCase("Scenic Cruise")) {
				Scenic_Cruise scenic_Cruise = new Scenic_Cruise();
				scenic_Cruise.cruise_Detials();
				numOfDays = scenic_Cruise.getNoOfDays();
				childrenPrice = scenic_Cruise.getPriceOfChildren();
				adultPrice = scenic_Cruise.getPriceOfAdult();
				additionalFeatures = scenic_Cruise.spa();
			} else if (selection.equalsIgnoreCase("Mystery Cruise")) {
				Mystery_Cruise mystery_Cruise = new Mystery_Cruise();
				mystery_Cruise.cruise_Detials();
				numOfDays = mystery_Cruise.getNoOfDays();
				childrenPrice = mystery_Cruise.getPriceOfChildren();
				adultPrice = mystery_Cruise.getPriceOfAdult();
				additionalFeatures = mystery_Cruise.casino();
			} else if (selection.equalsIgnoreCase("Sunset Cruise")) {
				Sunset_Cruise sunset_Cruise = new Sunset_Cruise();
				sunset_Cruise.cruise_Detials();
				numOfDays = sunset_Cruise.getNoOfDays();
				childrenPrice = sunset_Cruise.getPriceOfChildren();
				adultPrice = sunset_Cruise.getPriceOfAdult();
				additionalFeatures = sunset_Cruise.candleLight();
			} else {
				System.out.println("Invalid Cruise...");
			}
//			System.out.println("Please press Y if you want to continue with the selection or\n"
//					+ "press any other alphabet to select another");
//			again = sc.nextLine();

		} while (!(cruiseSelection.equalsIgnoreCase("Scenic Cruise")
				|| cruiseSelection.equalsIgnoreCase("Discovery Cruise")
				|| cruiseSelection.equalsIgnoreCase("Mystery Cruise")
				|| cruiseSelection.equalsIgnoreCase("Sunset Cruise")));

	}

	public void noOfPeople() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Adults: ");
		adults = sc.nextInt();
		System.out.println("Enter Number of Children: ");
		children = sc.nextInt();

	}

	public void addBuffet() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.");
		Scanner sc = new Scanner(System.in);
		String needBuffet = sc.next();
		if (needBuffet.equalsIgnoreCase("Yes")) {
			adultBuffetPrice = numOfDays * 25 * adults;
			childrenBuffetPrice = numOfDays * 5 * children;
		}
	}

	public void output() {
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