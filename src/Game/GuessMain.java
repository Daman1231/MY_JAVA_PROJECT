package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class GuessMain {

	public static void main(String[] args) throws FileNotFoundException {
		GuessTheStudent student = new GuessTheStudent();

		File f = new File("D:\\New folder/NameList.txt");

		try {
			student.readLine(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
