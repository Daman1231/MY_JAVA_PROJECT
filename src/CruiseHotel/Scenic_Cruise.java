package CruiseHotel;

import java.util.Scanner;

public class Scenic_Cruise extends Cruise {

	double adultPrice = 43.99;
	double childrenPrice = 12.99;
	int numOfDays = 3;
	int priceForSpa = 50;
	Scanner sc = new Scanner(System.in);

	public double spa() {
		System.out.println("Do You Want to Add Spa...");
		String addSpa = sc.nextLine();
		if (addSpa.equalsIgnoreCase("Yes")) {
			return priceForSpa;
		}
		return 0;
	}

	public void cruise_Detials() {
		System.out.println("The cruise that you have selected is Scenic Cruise which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + adultPrice + " per day\r\n"
				+ "Price for kids above 5			: " + childrenPrice + " per day\r\n" + "");
		getPriceOfAdult();
		getPriceOfChildren();
		getNoOfDays();
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
