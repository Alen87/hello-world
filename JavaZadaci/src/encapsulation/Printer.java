package encapsulation;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		super();
		if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}

		this.duplex = duplex;
		this.pagesPrinted = 0;
	}

	
	
	public int addToner(int tonerAmount) {
		if(tonerAmount > 0 && tonerAmount<=100) {
			if(this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
		   return this.tonerLevel+=tonerAmount;
		}else {
			return -1;
		}
			
		
		
		
		
	}
	
	
	
	
	
	
	
}
