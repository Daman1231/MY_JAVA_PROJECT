// Write a code to check if a person is eligible to cast vote or not.
//Print suitable messages also.
package Practicing_Concepts;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		while (age < 18) {
			System.out.println("Enter your age: ");
			age = sc.nextInt();
			if (age < 18) {
				System.out.println("You are not eligible for vote.");
			} else {
				System.out.println("Congrats you turned " + age + " and eligible for vote.");
			}

		}
	}

}
