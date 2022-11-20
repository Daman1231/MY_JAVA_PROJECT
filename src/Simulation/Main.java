package Simulation;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Simulation simulation = new Simulation();
		simulation.loadItem();
		ArrayList<Item> arrayListR1 = simulation.loadItem();
		simulation.loadU1(arrayListR1);
		ArrayList<Item> arrayListR2 = simulation.loadItem();
		simulation.loadU2(arrayListR2);
		ArrayList<Rocket> rocketR1 = simulation.loadU1(arrayListR1);
		ArrayList<Rocket> rocketR2 = simulation.loadU2(arrayListR2);
		int r1Cost = simulation.runSimulation(rocketR1);
		int r2Cost = simulation.runSimulation(rocketR2);
		System.out.println("Cost of R1  $" + r1Cost + " Million");
		System.out.println("Cost of R2  $" + r2Cost + " Million");

//		Simulation1 simulation1 = new Simulation1();
//		simulation1.loadItem();
//		ArrayList<Item> loadU1 = new ArrayList<>();
//		simulation1.loadU1(loadU1);
				
	
	}

}
