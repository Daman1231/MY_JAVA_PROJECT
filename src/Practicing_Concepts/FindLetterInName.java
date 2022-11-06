//Print how many 'a' letter are present in your name.
package Practicing_Concepts;

public class FindLetterInName {

	public static void main(String[] args) {
		String name = "Daman";
		int count = 0;
		char[] nameToChar = name.toCharArray();
		for(int i = 0; i < nameToChar.length; i++) {
			if((nameToChar[i] == 'a') || (nameToChar[i] == 'A')) {
				count++;
			}
		}
		System.out.println("A is Present " + count + " times");
	}

}
