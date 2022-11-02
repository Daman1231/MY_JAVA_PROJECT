import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while (!flag) {
			System.out.println("Enter the Number of your choice: ");
			a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.println("The Number is Even " + a);
			} else {
				System.out.println("The Number is Odd " + a);
			}
		}
	}

}