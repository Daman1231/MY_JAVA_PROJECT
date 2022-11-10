package CruiseHotel;

import java.util.Scanner;

public class Mystery_Cruise extends Cruise {
	String cruiseName = "Mystery Cruise";
	double adultPrice = 45.99;
	double childrenPrice = 12.99;
	int numOfDays = 2;
	int casinoFee = 20;

	

	Scanner sc = new Scanner(System.in);
	public double casino() {
		System.out.println("Do You Want to Add Casino...");
		String casinoInput = sc.nextLine();
		if(casinoInput.equalsIgnoreCase("Yes")) {
			return casinoFee;
		}
		return 0;
				
	}

	public void cruise_Detials() {

		System.out.println("The cruise that you have selected is " + cruiseName + " which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + adultPrice + " per day\r\n"
				+ "Price for kids above 5			: " + childrenPrice + " per day\r\n" + "");
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
