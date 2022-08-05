package sumCalculator;

public class Start {
	
	public Start() {
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
		
		calculator.setFirstNumber(-1.25);
        calculator.setSecondNumber(-1.25);
        System.out.println(calculator.getDivisionResult());
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Start();
		
		
	}
	
	

}
