
/*
 * 8.	Write a program that will keep adding 5 chocolates to a box which already has 27 chocolates and
 *  add a mechanism that number of chocolates should never go above 63
 * 
 */
public class ChocolateProblemWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxChocoCapacity = 63;
		int count = 0;
		for (int noOfChocolates = 27; noOfChocolates <= maxChocoCapacity; noOfChocolates += 5) {
			System.out.println("Number of Cholocates added to box " + noOfChocolates);
		}
		if (count > maxChocoCapacity) {
			System.out.println("Number of Chocolates increased");
		}
	}
}