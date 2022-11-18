package CruiseHotel;

public class Deluxe_Suite extends Hotel {

	int suitePrice = 180;

	public void deluxDetail() {
		System.out.println("The Suite you have selected is Delux Suite and the price for Suite is " + suitePrice
				+ " for children 4 and for noOfAdults 4");
	}

	public int price() {
		return suitePrice;
	}

}
