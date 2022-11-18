package Simulation;

public class Rocket implements SpaceShip {

	// rocketWeight+ add item;
	int rocketWeight;
	int maximumWeight;
	int capacity;
	int cost;

	public Rocket(int rocketWeigh, int maxWeigh, int cost) {

		this.rocketWeight = rocketWeigh;
		this.maximumWeight = maxWeigh;
		this.cost = cost;
	}

	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if (item.getWeight() <= ((maximumWeight - rocketWeight)-capacity)) {
			return true;
		}
		return false;
	}

	public boolean carry(Item item) {

		if (canCarry(item)) {
			capacity += item.getWeight();
			return true;
		} else {
			return false;
		}

	}

	public int getCost() {
		return cost;
	}
}
