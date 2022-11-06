//Store marks of 10 students in array and find the maximum marks out of those.
package Practicing_Concepts;

public class Array_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Students Marks are as follow: ");
		int marks[] = {56, 98, 75, 68, 93, 77, 63, 60, 77, 89};
		int max = marks[0];
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			if(marks[i] > max) {
				max = marks[i];
			}
		}
		System.out.println("The Maximum Number is: " + max);
	}

}
