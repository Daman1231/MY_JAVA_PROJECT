public class CalculatorWSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator = '/';
		int num1 = 10;
		int num2 = 2;

		switch (operator) {
		case '+':
			System.out.println("Addition Result: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction Result: " + (num1 - num2));
			break;
		case '/':
			System.out.println("Addition Result: " + (num1 / num2));
			break;
		case '*':
			System.out.println("Addition Result: " + (num1 * num2));
			break;
		default:
			System.out.println("Invalid Input");
			break;

		}

	}

}