package CruiseHotel;

public class Family_Suite extends Hotel {
	int suitePrice = 230;

	public void familyDetail() {
		System.out.println("The Suite you have selected is Family Suite and the price for Suite is " + suitePrice
				+ " for children 4 and for noOfAdults 4");
	}

	public int price() {
		return suitePrice;
	}
}
