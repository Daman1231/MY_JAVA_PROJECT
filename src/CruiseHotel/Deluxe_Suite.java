package CruiseHotel;

public class Deluxe_Suite extends Hotel {
	String suiteName = "Delux Suite";
	int suitePrice = 180;
	int noOfChildren = 2;
	int noOfAdults = 2;

	public void deluxDetail() {
		System.out.println("The Suite you have selected is " + suiteName + " and the price for Suite is " + suitePrice
				+ " for children " + noOfChildren + " and for noOfAdults " + noOfAdults);

	}
	public int price() {
		return suitePrice;
	}

}
