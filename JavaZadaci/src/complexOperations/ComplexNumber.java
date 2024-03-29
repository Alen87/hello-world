package complexOperations;

public class ComplexNumber {

	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(double real, double imaginary) {

		this.real += real;
		this.imaginary += imaginary;

	}
	
	public void add(ComplexNumber complexNumber1) {
		this.real += complexNumber1.real;
		this.imaginary += complexNumber1.imaginary;
		
	}
	
	public void subtract(double real,double imaginary) {
		this.real -= real;
		this.imaginary -=imaginary;
		
		
	}
	
	public void subtract(ComplexNumber complexNumber2) {
		this.real -= complexNumber2.real;
		this.imaginary -= complexNumber2.imaginary;
		
	}
	
	

}
