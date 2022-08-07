package carpetCostCalculator;

public class Floor {

	private double width;
	private double length;

	public Floor() {
		super();
	}

	public Floor(double width, double length) {
		super();
		this.width = width;
		if (this.width < 0) {
			this.width = 0;
		}

		this.length = length;
		if (this.length < 0) {
			this.length = 0;
		}

	}

	public double getArea() {

		return this.width * this.length;
	}

}
