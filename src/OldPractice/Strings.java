package OldPractice;

public class Strings {

	public static void main(String[] args) {
		// Comparing Strings...
		String name = "Daman";
		String lastName = "Singh";
		if (name.equalsIgnoreCase(lastName)) {
			System.out.println("Name is Valid");
		} else {
			System.out.println("Invalid");
		}

		// Contains Methods...

		String email = "Daman@gmail.com";
		if (email.contains("@")) {
			System.out.println("Valid Email");
		} else {
			System.out.println();
		}

		// Replace Methods

		String myName = "DamanPreet Singh";
		String result = myName.replace("Preet", "Jeet");
		System.out.println(result);

		// Arrays of String...Find Number of Preet in Arrays of String...
		String names[] = { "DamanPreet", "Sahib", "JashanPreet", "Amanpreet", "ArshPreet" };
		int count = 1;
		for (int i = 0; i < name.length(); i++) {
			if (names[i].contains("Preet")) {
				count++;
			}
		}
		System.out.println("The Name Preet is present " + count + " times in an array");

		// Count how many preet are in array..... and the replace to jeet
		String names1[] = { "DamanPreet", "Sahib", "JashanPreet", "Amanpreet", "ArshPreet" };
		for (int i = 0; i < names1.length; i++) {
			if (names1[i].contains("Preet")) {
				names1[i] = names1[i].replace("Preet", "Jeet");
				
			}
			System.out.println(names1[i]);
		}
		

	}

}
