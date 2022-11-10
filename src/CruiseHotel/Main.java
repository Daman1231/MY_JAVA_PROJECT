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
		do {
			do {
				System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
				selectChoice = sc.nextLine();
				if (selectChoice.equalsIgnoreCase("Cruise")) {
					cruise.cruiseSelection();
					cruise.noOfPeople();
					cruise.addBuffet();
					cruise.output();
				} else if (selectChoice.equalsIgnoreCase("Hotel")) {
					hotel.hotelSelection();
					hotel.noOfPeople();
					hotel.addBuffet();
					hotel.output();
				} else {
					System.out.println("InValid Selection");
				}
			} while (!(selectChoice.equalsIgnoreCase("Cruise") || selectChoice.equalsIgnoreCase("Hotel")));

			System.out.println("Do you want to book another Hotel or Cruise Yes or No");
			anotherSelectChoice = sc.nextLine();
		} while (anotherSelectChoice.equalsIgnoreCase("Y"));
		System.out.println("Thanks for Choosing our Service....");
		
	}

}
