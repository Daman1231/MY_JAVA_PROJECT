package Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.Line;

public class GuessTheStudent {

	public void readLine(File f) throws IOException {
		String line;

		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);

		}
		fileReader.close();
		bufferedReader.close();

	}
	Random random = new Random();
	String randomName = random.toString();
	String name = randomName.valueOf(randomName);

}
