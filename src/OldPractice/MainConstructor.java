package OldPractice;

import java.util.Scanner;

public class MainConstructor {

	public static void main(String[] args) {
		//SignUpConstructor constructor = new SignUpConstructor("daman.singh00786@gmail.com", "1234", "Daman", "6474020546");
//		System.out.println(constructor.password);
		SignUpConstructor constructor = new SignUpConstructor("daman","da","damanP");
		System.out.println(constructor.email);
		constructor.registr();
		constructor.login();

	}

}
