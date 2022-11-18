package OldPractice;

import java.lang.reflect.Array;

public class NameMain {

	public static void main(String[] args) {
		NamesConstructor constructor = new NamesConstructor("daman@gmail.com", "Daman1231", "Daman Preet Singh",
				"6474020546");
		NamesConstructor constructor1 = new NamesConstructor("aman@gmail.com", "Aman1231", "Aman Preet Singh",
				"6474354131");
		NamesConstructor constructor2 = new NamesConstructor("Gagan@gmail.com", "Gagan1231", "Gagan Preet Singh",
				"6376413446");
		NamesConstructor constructor3 = new NamesConstructor("Param@gmail.com", "param1231", "param Preet Singh",
				"6474999996");
		NamesConstructor constructor4 = new NamesConstructor("Mani@gmail.com", "Mani", "Mani Shoor", "6375594636");

		NamesConstructor[] names = { constructor, constructor1, constructor2, constructor3, constructor4 };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(constructor2)) {
				System.out.println(names[i].Password);
			}
		}

	}

}
