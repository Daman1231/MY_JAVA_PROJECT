package Programs;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Friends Name List...");

		String names[] = new String[5];
		for (int i = 0; i <= 4; i++) {
			System.out.println("Enter Names Here: " + i);
			String name = sc.next();
			names[i] = name;
		}
		System.out.println("The Name List is as follows: " + Arrays.toString(names));

		int index = 0;
		for (int j = 0; j <= names.length; j++) {
			if (names[j] == names[j]) {
				index = j;
				System.out.println("Daman is present in an array at Index " + index);
				break;
			}
		}
	}

}