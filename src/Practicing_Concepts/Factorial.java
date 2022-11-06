// factorial of a number....
package Practicing_Concepts;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int factNum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		for (int i = num; i > 1; i--) {
			factNum = factNum * i;
		}
		System.out.println("The Factorial of " + num + " is " + factNum);
	}

}

