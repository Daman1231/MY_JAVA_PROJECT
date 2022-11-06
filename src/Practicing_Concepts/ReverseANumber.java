//Print reverse of the number.
package Practicing_Concepts;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}
	}

}
