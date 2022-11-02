package CellPhone;

public class CellPhone_Plans {
	int selectedModelPrice = 0;

	String selectionOfOS(String os) {
		String operatingSystem = " ";
		if (os.equals("IOS")) {
			operatingSystem = "IOS";
		}
		if (os.equals("Android")) {
			operatingSystem = "Android";
		}
		return operatingSystem;
	}

	int selectionOfProduct(String brand, String model) {
		String PhoneBrand = null;
		if (brand.equals("Samsung")) {
			PhoneBrand = "Samsung";
			if (model.equals("S22")) {
				PhoneBrand = "Samsung S22";
				selectedModelPrice = 25;
			} else if (model.equals("S22+")) {
				PhoneBrand = "Samsung S22+";
				selectedModelPrice = 35;
			} else if (model.equals("S22_ULTRA")) {
				PhoneBrand = "Samsung S22 ULTRA";
				selectedModelPrice = 55;
			} else if (model.equals("S22_FE")) {
				PhoneBrand = "Samsung S2 Fe";
				selectedModelPrice = 20;
			}
		}

		if (brand.equals("Apple")) {
			PhoneBrand = "Apple";
			if (model.equals("Iphone_14_Pro")) {
				selectedModelPrice = 40;
			} else if (model.equals("Iphone_14_Pro_Max")) {
				selectedModelPrice = 65;
			} else if (model.equals("Iphone_14_Mini")) {
				selectedModelPrice = 25;
			} else if (model.equals("Iphone_14")) {
				selectedModelPrice = 30;
			}
		}

		return selectedModelPrice;
	}

	int plans(String plansAdded) {
		String planoffers = null;
		int planPrice = 0;
		if (plansAdded.equals("Rogers")) {
			planPrice = 70;
		} else if (plansAdded.equals("Bell")) {
			planPrice = 80;
		} else if (plansAdded.equals("Telus")) {
			planPrice = 75;
		}
		return planPrice;
	}
}