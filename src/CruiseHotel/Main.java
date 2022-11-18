package CruiseHotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String selectChoice = "";
		String anotherSelectChoice = "";
		Scanner sc = new Scanner(System.in);
		UserDetail userDetail = new UserDetail();
		userDetail.signUp();
		userDetail.login();
		Cruise cruise = new Cruise();
		Hotel hotel = new Hotel();

		Cruise cruise2 = new Cruise();

		do {
			do {
				System.out.println("Please enter the service you want to book Hotel / Cruise");
				selectChoice = sc.nextLine();
				if (selectChoice.equalsIgnoreCase("Cruise")) {
					cruise.output();
				} else if (selectChoice.equalsIgnoreCase("Hotel")) {
					hotel.output();
				} else {
					System.out.println("InValid Selection");
				}
			} while (!(selectChoice.equalsIgnoreCase("Cruise") || selectChoice.equalsIgnoreCase("Hotel")));

			System.out.println("Do you want to book another Hotel or Cruise Yes or No");
			anotherSelectChoice = sc.nextLine();
		} while (!anotherSelectChoice.equalsIgnoreCase("Y"));
		
//		System.out.println(
//				"Please Choose any of the cruise...Scenic Cruise, Sunset Cruise, Mystery Cruise and Discovery Cruise...");
//		String selection = sc.next();
//		switch (selection) {
//		case "Scenic Cruise":
//			cruise2 = new Scenic_Cruise();
//			break;
//		case "Sunset Cruise":
//			cruise2 = new Sunset_Cruise();
//			break;
//		case "Mystery Cruise":
//			cruise2 = new Mystery_Cruise();
//			break;
//		case "Discovery Cruise":
//			cruise2 = new Discovery_Cruise();
//			break;
//
//		default:
//			break;
//		}
		//cruise2.output();

		System.out.println("Thanks for Choosing our Service....");
	}
}
