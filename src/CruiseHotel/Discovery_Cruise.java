package CruiseHotel;

import java.util.Scanner;

public class Discovery_Cruise extends Cruise {
	double adultPrice = 39.99;
	double childrenPrice = 9.99;
	int numOfDays = 4;
	int adventureGame = 50;
	Scanner sc = new Scanner(System.in);

	public double adventureGame() {
		System.out.println("Do You Want to Add Adventure Game...");
		String adventureGameinput = sc.nextLine();
		if (adventureGameinput.equalsIgnoreCase("Yes")) {
			return adventureGame;
		}
		return 0;
	}

	public double cruise_Detials() {
		System.out.println("The cruise that you have selected is Discovery Cruise which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + adultPrice + " per day\r\n"
				+ "Price for kids above 5			: " + childrenPrice + " per day\r\n" + "");
		getPriceOfAdult();
		getPriceOfChildren();
		return getNoOfDays();
	}

	private double getPriceOfAdult() {
		return adultPrice;
	}

	private double getPriceOfChildren() {
		return childrenPrice;
	}

	private int getNoOfDays() {
		return numOfDays;
	}

}
