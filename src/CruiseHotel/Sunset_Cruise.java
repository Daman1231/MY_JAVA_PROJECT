package CruiseHotel;

import java.util.Scanner;

public class Sunset_Cruise extends Cruise {
	int candleLightDinner;
	String cruiseName = "Sunset Cruise";
	double adultPrice = 52.99;
	double childrenPrice = 15.99;
	int numOfDays = 1;
	int candleLight = 45;
	Scanner sc = new Scanner(System.in);

	public void cruise_Detials() {

		System.out.println("The cruise that you have selected is " + cruiseName + " which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + adultPrice + " per day\r\n"
				+ "Price for kids above 5			: " + childrenPrice + " per day\r\n" + "");
	}

	public double candleLight() {
		System.out.println("Do You Want to Add Candle Light Dinner...");
		String candleLightDinner = sc.nextLine();
		if (candleLightDinner.equalsIgnoreCase("Yes")) {
			return candleLight;
		}
		return 0;

	}

	double getPriceOfAdult() {
		return adultPrice;
	}

	double getPriceOfChildren() {
		return childrenPrice;
	}

	int getNoOfDays() {
		return numOfDays;
	}
}
