package Simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Scanner;

public class Simulation {

	public ArrayList<Item> loadItem() throws FileNotFoundException {
		ArrayList<Item> itemArray = new ArrayList<>();
		File file = new File("D:\\New folder\\phase-1.txt");
		Scanner readFile = new Scanner(file);
		while (readFile.hasNextLine()) {
			String[] line = readFile.nextLine().split("=");
			String name = line[0];
			int weight = Integer.parseInt(line[1]);
			itemArray.add(new Item(name, weight));
		}
		readFile.close();
		loadU1(itemArray);
		return itemArray;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> loadItemArrayU1) throws FileNotFoundException {
		ArrayList<Rocket> arrayListU1 = new ArrayList<>();
		Item item;
		R1 R1 = new R1();
		while (loadItemArrayU1.size() > 0) {
			for (int i = 0; i < loadItemArrayU1.size(); i++) {
				item = loadItemArrayU1.get(i);
				if (R1.canCarry(loadItemArrayU1.get(i))) {
					R1.carry(loadItemArrayU1.get(i));
					loadItemArrayU1.remove(i);
				}
			}
			arrayListU1.add(R1);
			break;
		}

		return arrayListU1;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> loadItemArrayU2) {
		ArrayList<Rocket> arrayListU2 = new ArrayList<Rocket>();
		Item item;
		R2 r2 = new R2();
		while (loadItemArrayU2.size() > 0) {
			for (int i = 0; i < loadItemArrayU2.size(); i++) {
				item = loadItemArrayU2.get(i);
				if (r2.canCarry(loadItemArrayU2.get(i))) {
					r2.carry(loadItemArrayU2.get(i));
					loadItemArrayU2.remove(i);
				}
			}
			arrayListU2.add(r2);
			break;
		}
		return arrayListU2;
	}

	public int runSimulation(ArrayList<Rocket> rockets) {
		ArrayList<Rocket> arrayList = new ArrayList<>();
		Rocket rocket = null;
		int numOfRockets = 0;
		for (int i = 0; i < rockets.size(); i++) {
			rocket = rockets.get(i);
			int totalBudget = 0;
			if (rocket.launch() && rocket.land()) {
				numOfRockets++;
				System.out.println("Launch Succesful.");
			} else {
				numOfRockets++;
				System.out.println("Launch Unsuccesful..");
			}

		}
		int totalBudget = numOfRockets * rocket.cost;
		return totalBudget;

	}
}
