package Simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation1 {

	public ArrayList<Item> loadItem() throws FileNotFoundException {
		ArrayList<Item> itemArray = new ArrayList<>();
		File file = new File("D:\\New folder\\phase-1.txt");
		Scanner readFile = new Scanner(file);
		while (readFile.hasNextLine()) {
			String[] line = readFile.nextLine().split("=");
			Item item = new Item();
			item.name = line[0];
			item.weight = Integer.parseInt(line[1]);
			itemArray.add(item);
		}
		readFile.close();
		return itemArray;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> arrayListU1) {
		ArrayList<Rocket> arrayListR1 = new ArrayList<>();
		R1 r1 = new R1();
		for (int i = 0; i < arrayListU1.size(); i++) {
			while (r1.canCarry(arrayListU1.get(i))) {
				r1.carry(arrayListU1.get(i));
			}
		}
		arrayListR1.add(r1);
		return arrayListR1;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> arrayListU2) {
		R1 r1 = new R1();
		for (int i = 0; i < arrayListU2.size(); i++) {
			while (r1.canCarry(arrayListU2.get(i))) {
				r1.carry(arrayListU2.get(i));
				break;
			}
		}
		return null;
	}
}
