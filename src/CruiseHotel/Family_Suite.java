package CruiseHotel;

public class Family_Suite extends Hotel {
	String suiteName = "Family Suite";
	int suitePrice = 230;
	int noOfChildren = 4;
	int noOfAdults = 4;

	public void familyDetail() {
		System.out.println("The Suite you have selected is " + suiteName + " and the price for Suite is " + suitePrice
				+ " for children " + noOfChildren + " and for noOfAdults " + noOfAdults);

	}

	public int price() {
		return suitePrice;
	}
}
