package Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheStudent {

	public void readLine(File f) throws IOException {
		System.out.println("WELCOME TO GUESS THE STUDENT GAME BY DAMAN...");
		String line;
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);

		}
		fileReader.close();
		bufferedReader.close();
		System.out.println("Random Name below...");

		String names[] = { "Amanpreet", "Daman", "Harinder", "Jasmeet", "Jattan", "Kuldeep", "Lekshmi", "Navjot",
				"Neethu", "Parul", "Rajbir", "Sahib", "Sanil", "Shanthi" };
		for (int i = 0; i < names.length; i++) {
			names[i].equals(bufferedReader);
		}

		Random random = new Random();
		int randomNum = random.nextInt(14);
		String word = (names[randomNum]);
		String word1 = word.toUpperCase();

		word1 = word.replaceAll("[a-zA-Z]", "_");
		
		System.out.println("The word has " + word1.length() + " Letters");

		boolean isGuessCorrect = false;
		System.out.println("You are Guessing: " + word1);
		int noOfGuess = 0;
		System.out.println("You have Guesses " + noOfGuess + " Wrong Letters");
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a Letter: ");
		char guessName = sc.next().charAt(0);

		char[] randomWord = names[random.nextInt(names.length)].toCharArray();
		int amountOfGuesses = randomWord.length;
//		while(noOfGuess <= 5 && noOfGuess > 0) {
//			System.out.println("You have guessed " + noOfGuess + " Letters");
//			noOfGuess++;
//		}
		for (int i = 0; i < names.length; i++) {
			char l = word1.charAt(i);
			if (l == guessName) {
				randomWord[i] = l;
				isGuessCorrect = true;
			}

		}
		if(!isGuessCorrect) {
			noOfGuess--;
		}
//			if (word1.charAt(i) == guessName.charAt(0)) {
//				isGuessed = true;
//			}
//		}
//		if (isGuessed = true) {
//			word1 = guessName;
//		} else {
//			System.out.println("You Have Guesses a Wrong Letter.");
//		}
	}

}
