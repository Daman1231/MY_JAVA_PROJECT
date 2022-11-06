//Check a number is divisible by 3 and 5 both or not
package Practicing_Concepts;

import java.util.Scanner;

public class Number_Divisible {

	public static void main(String[] args) {
		int num = 0; // the program will run until it meets both condition diviible by 3 and 5...
		while ((!(num % 3 == 0) || (num % 5 == 0))) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number Divible by 3 and 5...");
			num = sc.nextInt();
			if ((num % 3 == 0) || (num % 5 == 0)) {
				System.out.println(num + " is Divisble by 3 and 5");
			} else {
				System.out.println(num + " is not divisle by 3 and 5");
			}
		}
	}

}
