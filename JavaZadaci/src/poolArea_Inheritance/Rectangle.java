package poolArea_Inheritance;

public class Rectangle {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
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

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getArea() {
		return (this.width * this.length);
	}

}
