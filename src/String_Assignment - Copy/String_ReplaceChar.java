package String_Assignment;

public class String_ReplaceChar {

	public static void main(String[] args) {
	
		//Replace every char with *...
		String name = "Daman Preet Singh";
		String replace = name.replaceAll("\\w", "*");
		System.out.println("The given character replace with * is: " + replace);

		// Replace last name with *...
		String lastnameReplace = name.replace("Singh", "*");
		System.out.println("Replace last name with *: " + lastnameReplace);
		
		// Print First Name...
		String firstName = name.replace(" Preet Singh", " ");
		System.out.println("The First Name is: " + firstName);
		
		//Find Length of name...
		int length = name.length();
		System.out.println("The Length of name is: " + length);
		
		//Replace all e with another character in name...
		String replace_e = name.replace("e", "i");
		System.out.println("The name with repalcement of e with i is: " + replace_e);
		
		
		
		//list of preet to jeet...
		
		String names[] = {"DamanPreet","AmanPreet","ArshPreet", "GurPreet"};
		for(int i = 0; i < names.length;i++) {
			if(names[i].contains("Preet")) {
				String namelist = names[i].replace("Preet", "Jeet");
				System.out.println(namelist);
			}
			
		}
	}

}
