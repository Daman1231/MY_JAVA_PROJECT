package Game;
import java.io.*;
import java.util.*;

public class GuessingGameV1 {

	public static void main(String[] args) throws IOException {
		File myFile = new File("D:\\New folder\\NameList.txt");
		Scanner read = new Scanner(myFile);
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int counter = 0;
		while (read.hasNextLine()) {
			map.put(counter, read.nextLine());
			counter++;
		}
		read.close();
		int random = (int) Math.floor(Math.random() * (map.size()));
		String name = map.get(random);
		String maskedName = name.replaceAll("\\w", "_");
		String guess = "";
		String wrongLetters = "";
		int wrongGuesses = 0;
		do {
			System.out.println("You are Guessing " + maskedName);
			guess = sc.next();
			for (int i = 0; i < name.length(); i++) {
				String str = "" + name.charAt(i);
				if (guess.equalsIgnoreCase(str)) {
					maskedName = maskedName.substring(0, i) + str + maskedName.substring(i + 1);
				}
			}
			if (!name.contains(guess.toLowerCase()) && !(name.contains(guess.toUpperCase()))) {
				wrongLetters += guess + " ";
				wrongGuesses++;
				System.out.println("You have guessed (" + wrongGuesses + ") wrong letters: " + wrongLetters);
			}
		} while (!maskedName.equals(name) && wrongGuesses <= 4);
		if (maskedName.equals(name)) {
			System.out.println("Congratulations you won!\nYou successfully guessed " + maskedName);
		} else {
			System.out.println("Ooops !\nYou failed to guess \"" + name + "\"");
		}
	}
}