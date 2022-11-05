package Game_Practice_Testing;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ABC {

	int wrongGuess = 0;
	String wrongChar = " ";
	String maskName = " ";
	String randomName = " ";

	public void File() throws FileNotFoundException {

		java.io.File file = new java.io.File("D:\\New folder\\NameList.txt");
		Scanner readFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hashMap = new HashMap<>();
		int count = 0;
		while (readFile.hasNextLine()) {
			hashMap.put(count, readFile.nextLine());
			count++;
		}
		readFile.close();
		int random = (int) Math.floor(Math.random() * hashMap.size());
		randomName = hashMap.get(random);
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

		}
	}

	public void guessGame(String randomName) {
		String guess = "";
// System.out.println("You are Guessing " + maskName);
		Scanner sc = new Scanner(System.in);
// guess = sc.next();
// isCharPresentInName(randomName, guess);
		System.out.println(randomName);
		while (wrongGuess < 5) {
			System.out.println("You are Guessing " + maskName);
			System.out.println("You have guesed " + wrongGuess + " Wrong Letter" + wrongChar);
			System.out.println("Guess a Letter: ");
			guess = sc.nextLine();
			isCharPresentInName(randomName, guess);

		}
	}

}