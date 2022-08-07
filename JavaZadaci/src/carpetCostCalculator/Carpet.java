package carpetCostCalculator;

public class Carpet {

	private double cost;

	public Carpet() {
		super();
	}

	public Carpet(double cost) {
		super();
		this.cost = cost;
		if (this.cost < 0) {
			this.cost = 0;
		}

	}

	public double getCost() {
		return cost;
	}

}
