package CruiseHotel;

import java.util.Scanner;

public class Hotel extends UserDetail {
	String selection;
	int adults, children;
	int price;
	double adultBuffetPrice;
	double childrenBuffetPrice;
	int noOfStayDays;

	public void hotelSelection() {
		do {
			System.out.println("We Have 2 different Suites available in Hotel. Delux Suite and Family Suite");
			Scanner sc = new Scanner(System.in);
			String selectHotel = sc.nextLine();
			this.selection = selectHotel;
			if (selection.equalsIgnoreCase("Delux Suite")) {
				Deluxe_Suite deluxe_Suite = new Deluxe_Suite();
				deluxe_Suite.deluxDetail();
				price = deluxe_Suite.price();
			} else if (selection.equalsIgnoreCase("Family Suite")) {
				Family_Suite family_Suite = new Family_Suite();
				family_Suite.familyDetail();
				price = family_Suite.price();
			} else {
				System.out.println("InValid Selection");
			}
		} while (!(selection.equalsIgnoreCase("Delux Suite") || selection.equalsIgnoreCase("Family Suite")));
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
		System.out.println("Enter the Number of Days you want to stay: ");
		noOfStayDays = sc.nextInt();
		if (needBuffet.equalsIgnoreCase("Yes")) {
			adultBuffetPrice = noOfStayDays * 25 * adults;
			childrenBuffetPrice = noOfStayDays * 5 * children;
		}
	}

	public void output() {
		double priceOfSuite = noOfStayDays * price;
		double buffetPriceForAdult = adultBuffetPrice;
		double buffetPriceForChildren = childrenBuffetPrice;
		double totalPrice = buffetPriceForAdult + buffetPriceForChildren + priceOfSuite;

		double hst = (totalPrice * 18) / 100;
		double finalPrice = totalPrice + hst;
		System.out.println("The total amount you will be charged is\r\n" + priceOfSuite + "			@" + noOfStayDays
				+ "nights 	:	$" + totalPrice + "\r\n" + "Lunch Pre-Booked Special Rate Adults	@ " + adults
				+ "	: 	$" + buffetPriceForAdult + "\r\n" + "Lunch Pre-Booked Special Rate Children @" + children
				+ "	: 	$" + buffetPriceForChildren + "\r\n" + "Total Price					: 	$" + totalPrice + "\r\n"
				+ "HST	@ 18%					: 	$" + hst + "\r\n" + "Final Price					:	$"
				+ finalPrice + "\r\n" + "");
	}
}
