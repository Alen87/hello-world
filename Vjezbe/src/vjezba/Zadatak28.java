package vjezba;

import javax.swing.JOptionPane;

// Izračunati umnozak parnih prirodnih brojeva u intervalu od k do n.

public class Zadatak28 {
	public static void main(String[] args) {

		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost k"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost n"));
		
		ispis(umnozak(k,n));
		
	}

	static int umnozak(int k, int n) {
		int umnozak = 1;

		for (int i = k; i <= n; i++) {
			if (i % 2 == 0) {
				umnozak *= i;
			}
		}

		return umnozak;
	}
	
	
	
	static void ispis(int umnozak) {
		System.out.println("umnozak parnih prirodnih brojeva u intervalu od k do n iznosi   "   + umnozak);
	}

}
