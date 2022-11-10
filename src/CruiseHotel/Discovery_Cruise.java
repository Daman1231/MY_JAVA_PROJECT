package CruiseHotel;

import java.util.Scanner;

public class Discovery_Cruise extends Cruise {
	String cruiseName = "Discovery Cruise";
	double adultPrice = 39.99;
	double childrenPrice = 9.99;
	int numOfDays = 4;
	int adventureGame = 50;

	Scanner sc = new Scanner(System.in);
	public double adventureGame() {
		System.out.println("Do You Want to Add Adventure Game...");
		String adventureGameinput = sc.nextLine();
		if(adventureGameinput.equalsIgnoreCase("Yes")) {
			return adventureGame;
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
