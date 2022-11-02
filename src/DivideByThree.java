
/*
 * 5.	Write a Java Program to check if 2 numbers are divisible by 3. 
a.	The output if both numbers are divisible will be: “Both the numbers are divisible by 3”
b.	The output if one number is divisible will be: “<Number> is divisible by 3 but <Number>
 is not divisible by 3”.
c.	The output if both numbers are not divisible will be: “Both the numbers are no
t divisible by 3”
 * 
 */
public class DivideByThree {

	public static void main(String[] args) {
		int a = 90;
		int b = 60;
		
		if(a % 3 == 0 && b % 3 == 0) { 
			System.out.println(" Both the numbers " + a + " and "+ b+ " are divisible by 3");
		}
		else if(a % 3 == 0 && !(b % 3 == 0)) {
			System.out.println(a + " is divisble by 3 but " + b +" is not divisble by 3");
		}
		else if(!(a % 3 == 0) && b % 3 == 0) {
			System.out.println(b + " is divisble by 3 but " + a +" is not divisble by 3");
		}
		else if(!(a % 3 == 0) && !(b % 3 == 0)) {
			System.out.println("Both the numbers " + a +" and "+ b + " are not divisible by 3");
		}
	}

}