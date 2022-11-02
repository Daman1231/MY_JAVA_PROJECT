package CRS_SCORE;

public class CRS_SCORE {

	int scores;

	int age(int userAge) {
		int agepoints = 0;

		if (userAge >= 18 && userAge <= 35) {
			agepoints = 12;

		} else if (userAge >= 36 && userAge <= 47) {
			switch (userAge) {
			case 36:
				agepoints = 11;
				break;

			case 37:
				agepoints = 10;
				break;
			case 38:
				agepoints = 9;
				break;
			case 39:
				agepoints = 8;
				break;
			case 40:
				agepoints = 7;
				break;
			case 41:
				agepoints = 6;
				break;
			case 42:
				agepoints = 5;
				break;
			case 43:
				agepoints = 4;
				break;
			case 44:
				agepoints = 3;
				break;
			case 45:
				agepoints = 2;
				break;
			case 46:
				agepoints = 1;
				break;

			default:
				break;
			}

		} else {
			System.out.println("Enter Valid age");
		}
		return agepoints;

	}

	int degree(String education) {
		int educationscore = 0;
		if (education.equals("Phd")) {
			educationscore = 25;
		} else if (education.equals("Masters_Degree")) {
			educationscore = 23;
		} else if (education.equals("twoormoredegree")) {
			educationscore = 22;
		} else if (education.equals("12_+degree")) {
			educationscore = 21;
		}

		return educationscore;
	}

	int experience(int years) {
		int points = 0;
		if (years <= 5) {
			points = 13;
		} else if (years >= 6) {
			points = 15;
		}
		return points;
	}

	int ielts(String modules) {
		int ieltspoints = 0;
		if (modules.equals("listening")) {
			ieltspoints = 8;
		} else if (modules.equals("Speaking")) {
			ieltspoints = 7;
		} else if (modules.equals("Reading")) {
			ieltspoints = 7;
		} else if (modules.equals("Writing")) {
			ieltspoints = 7;
		}

		return ieltspoints;
	}

	boolean study(boolean canadaStudy) {
		boolean abroadStudy = true;
		if (canadaStudy = abroadStudy) {
			abroadStudy = true;
		} else if (canadaStudy != abroadStudy) {
			abroadStudy = false;
		}
		return abroadStudy;
	}

	boolean inNOCCategory(boolean inNoc) {
		boolean nocStudy = false;
		if (inNoc = nocStudy) {
			nocStudy = true;
		} else if (inNoc != nocStudy) {
			nocStudy = false;
		}
		return nocStudy;
	}

}