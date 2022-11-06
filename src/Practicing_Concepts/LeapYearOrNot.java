package Practicing_Concepts;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int numOfDays = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of days in a year");
		numOfDays = sc.nextInt();
		if (!(numOfDays <= 365) && !(numOfDays > 366)) {
			System.out.println("Its a Leap Year.");
		} else if (numOfDays > 366) {
			System.out.println("Number of days are not Valid");
		} else {
			System.out.println("Its not a Leap year.");
		}

	}

}
