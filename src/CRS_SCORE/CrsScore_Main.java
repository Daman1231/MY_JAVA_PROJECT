package CRS_SCORE;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class CrsScore_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String CurrentEducation = null;
		int currentExperience;
		String reading;
		String writing;
		String speaking;
		String listening;
		boolean study;
		boolean nocStudy;
		int totalScore;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Education Level");
		CurrentEducation = sc.next();

		CRS_SCORE crs = new CRS_SCORE();
		int educationScore = crs.degree(CurrentEducation);
		System.out.println("education score = " + educationScore);

		System.out.println("Enter Your Experience in Years");
		currentExperience = sc.nextInt();
		int yearScore = crs.experience(currentExperience);
		System.out.println("Experience Score = " + yearScore);

		System.out.println("Enter Your Ielts Score for Reading");
		reading = sc.next();
		int reading1 = crs.ielts(reading);
		System.out.println("Reading = " + reading);

		System.out.println("Enter Your Ielts Score for Writing");
		writing = sc.next();
		int writing1 = crs.ielts(writing);
		System.out.println("Reading = " + writing);

		System.out.println("Enter Your Ielts Score for Speaking");
		speaking = sc.next();
		int Speaking1 = crs.ielts(speaking);
		System.out.println("Reading = " + speaking);

		System.out.println("Enter Your Ielts Score for Listening");
		listening = sc.next();
		int listening1 = crs.ielts(listening);
		System.out.println("Reading = " + listening);

		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		study = sc.nextBoolean();
		boolean abroadstudy = crs.study(false);
		System.out.println("Y/N: " + abroadstudy);

		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		nocStudy = sc.hasNext();
		boolean nocCategory = crs.inNOCCategory(false);
		System.out.println("Y/N: " + nocCategory);

		totalScore = (int) (educationScore + yearScore + reading1 + writing1 + listening1 + Speaking1);
		System.out.println("Total Points you have scored " + totalScore);
		if (true) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}

}