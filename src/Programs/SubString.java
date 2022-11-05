package Programs;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Daman";
		String result = name.substring(1,4);
		System.out.println(result);
		char result2 = name.charAt(2);
		System.out.println(result2);
		result = name.substring(0, 2) + name.substring(2, 5);
		System.out.println(result);
		
	}

}
