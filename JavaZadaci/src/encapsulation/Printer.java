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
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			return this.tonerLevel += tonerAmount;
		} else {
			return -1;
		}

	}

	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (duplex) {
			if ((pages % 2) == 0) {
				pagesToPrint /= 2;
			} else {
				pagesToPrint = (pagesToPrint / 2) + 1;
			}
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
