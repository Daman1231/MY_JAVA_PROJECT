package Simulation;

public class R1 extends Rocket {
	public R1() {
		// Rocket Weight and max Weight
		super(10000, 18000, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1;
		// if random is greater than given value then it will land otherwise will
		// explode.
		if (random > 1 * (maximumWeight / rocketWeight)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1; // if random is greater than given value then it will launch
														// otherwise will explode.
		if (random > 5 * (maximumWeight / rocketWeight)) {
			return true;
		} else {
			return false;
		}
	}
}
