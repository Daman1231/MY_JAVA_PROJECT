package Game_Practice_Testing;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	int wrongGuess = 0;
	String wrongChar = " ";
	String maskName = " ";
	String randomName = " ";

	public void File() throws FileNotFoundException {

		java.io.File file = new java.io.File("D:\\New folder\\NameList.txt");
		Scanner readFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hashMap = new HashMap<>(); // Integer is a key and String is a value in hashmap....
		int count = 0;
		while (readFile.hasNextLine()) {
			hashMap.put(count, readFile.nextLine());
			count++;
		}
		readFile.close();
		int random = (int) Math.floor(Math.random() * hashMap.size()); // here math.random is used to choose a number
																		// between the size of total strings...
		String randomName = hashMap.get(random);
		maskName = randomName.replaceAll("\\w", "_");
		guessGame(randomName);
	}

	public void isCharPresentInName(String randomName, String guess) {
		boolean isGuessCorrect = false;
		String guessLowerCase = guess.toLowerCase();
		String guessUpperCase = guess.toUpperCase();
		for (int i = 0; i < randomName.length(); i++) {
			if (randomName.charAt(i) == guessLowerCase.charAt(0) || randomName.charAt(i) == guessUpperCase.charAt(0)) {
				maskName = maskName.substring(0, i) + randomName.charAt(i) + maskName.substring(i + 1);
				isGuessCorrect = true;
			}
		}
		if (!isGuessCorrect) {
			wrongGuess++;
			wrongChar = wrongChar + " " + guess;
			System.out.println("You have guesed " + wrongGuess + " Wrong Letter" + wrongChar);

		}

		if (maskName.equalsIgnoreCase(randomName)) {
			System.out.println("Congratulation");
			System.out.println("You are Guessing " + maskName + " Correctly.");
			System.out.println("Winner Winner Chicken Dinner");
		}

	}

	public void guessGame(String randomName) {
		String guess = "";
		Scanner sc = new Scanner(System.in);
		// System.out.println(randomName);
		System.out.println("Welcome to 'Guess The Student' Game by Daman \nEnjoy Playing...");
		while (wrongGuess < 5 && !maskName.equals(randomName)) {
			System.out.println("You are Guessing " + maskName);
			System.out.println("Guess a Letter: ");
			guess = sc.nextLine();
			isCharPresentInName(randomName, guess);
			if(wrongGuess>4) {
				System.out.println("Sorry You have exceeded the number of Wrong guesses, Please Try again later....");
			}
		}
	}

}
