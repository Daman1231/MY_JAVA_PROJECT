package CellPhone;

import java.util.Scanner;

public class CellPhonePlan_Main {

	public static void main(String[] args) {

		String selectBrand;
		String selectBrandAndroid;
		// String phonePlans;
		String model;
		String modelAndroid;
		int totalPrice = 0;
		int totalPriceAndroid = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select the OS you want?");
		String selectOs = sc.next();

		CellPhone_Plans cpp = new CellPhone_Plans();
		String selection = cpp.selectionOfOS(selectOs);
		switch (selection) {
		case "IOS":
			System.out.println("You Have Selected IOS OS");

			break;
		case "samsung":
			System.out.println("You Have Selected Samsung");
			break;
		case "Iphone":
			System.out.println("You Have Selected Iphone");
			break;
		default:
			System.out.println("Select Preferred Brand Between Samsung and Iphone");

		}

		if (selectOs.equals("IOS")) {
			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");

			selectBrand = sc.next();
			if (selectBrand.equals("Apple")) {
				System.out.println("You Have Selected Apple");

				System.out
						.println("Please Enter Model \nIPhone_14 \nIphone_14_PRO \nIphone_14_Pro_MAx \nIphone_14_Mini");

				model = sc.next();

				int priceForSelectedModel = cpp.selectionOfProduct(selectBrand, model);
				System.out.println("You Have Selected " + model);
				System.out.println("Price for selected model $" + priceForSelectedModel);

				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String selectedPlan = sc.next();
				int priceForSelectedPlan = cpp.plans(selectedPlan);

				System.out.println("Price for selected plan " + priceForSelectedPlan);

				totalPrice = priceForSelectedModel + priceForSelectedPlan;
				System.out.println("Total Price $" + totalPrice);
			}
		}
		if (selectOs.equals("Android")) {
			System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");

			selectBrandAndroid = sc.next();
			if (selectBrandAndroid.equals("Samsung")) {
				System.out.println("You Have Selected Samsung");

				System.out.println("Please Enter Model \nS22 \nS22+ \nS22_ULTRA \nS22 Fe");

				modelAndroid = sc.next();
				int priceForSelectedAndroidModel = cpp.selectionOfProduct(selectBrandAndroid, modelAndroid);
				System.out.println("You have selected " + modelAndroid);
				System.out.println("Price for Selected model $" + priceForSelectedAndroidModel);

				System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
				String selectedPlanForAndroid = sc.next();
				int priceForSelectedPlanAndroid = cpp.plans(selectedPlanForAndroid);

				System.out.println("Price for Selected Plan $" + priceForSelectedAndroidModel);
				totalPriceAndroid = priceForSelectedAndroidModel + priceForSelectedPlanAndroid;
				System.out.println("Total Price $" + totalPriceAndroid);

			}
		}

	}
}