package OldPractice;

public class StringMethods {

	public static void main(String[] args) {
		// LowerCase and LowerCase
		String name = "Daman";
		String result = name.toLowerCase();
		System.out.println(result);
		String result1 = name.toUpperCase();
		System.out.println(result1);

		// Length of String...
		int length = name.length();
		System.out.println(length);

		// Calculate characters in name without space...

		String myName = "Daman Preet Singh Bagria";
		String character = myName.replace(" ", "");
		int numberOfChar = character.length();
		System.out.println(numberOfChar);
		// or
		int numberOfChar1 = myName.replace(" ", "").length();
		System.out.println(numberOfChar1);
		// UpperCase or LowerCase
		String numberOfChar2 = myName.replace(" ", "").toLowerCase();
		System.out.println(numberOfChar2);

		// Replace everything with *
		String myName1 = "Daman Preet Singh Bagria";
		String replace = myName1.replaceAll("\\w", "*");
		System.out.println(replace);

		// Substring methods..

		String age = "My age is 29 Years old";
		String hideAge = age.substring(10);
		System.out.println(hideAge);

		// index MEthod
		String myAge = "My age is 29 Years old";
		int reslt = myAge.indexOf("29");
		System.out.println(reslt);

		String indx = myAge.substring(myAge.indexOf("is"));
		System.out.println(indx);

		// Substring with space..
		String myAge1 = "My age is 29 Years old";
		String sub = myAge1.substring(myAge1.indexOf(" ") + 1);
		System.out.println(sub);

	}

}
