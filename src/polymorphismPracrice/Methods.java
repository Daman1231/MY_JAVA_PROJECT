package polymorphismPracrice;
/*
 * Must have same method name but different arguments.
 * Must have same methods name and same datatype but different arguments.
 * Must have same methods name and same datatype but different arguments orders.
 * When not a polymorphism , when different return type with same method name and different args.
 */
public class Methods {

	public String addNumber(int a, String b) {
		String num = a + b;
		System.out.println(num);
		return num;
	}

	public String addNumber(String b, int a) {
		String num = a + b;
		System.out.println(num);
		return num; 
	}
	
	public void subNum(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
	public void subNum(int a, int b, int c) {
		int c1 = a - b - c;
		System.out.println(c1);
	}
}
