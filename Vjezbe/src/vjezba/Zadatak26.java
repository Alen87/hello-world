package vjezba;

import javax.swing.JOptionPane;

//Izračunati proizvod prirodnih brojeva u intervalu od 1 do n koji nisu djeljivi sa 3.

public class Zadatak26 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		

		ispis(umnozak(n));
	}

	static int umnozak(int n) {
		
		int umnozak = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0) {
				umnozak = umnozak * i;
			}
		}
		return umnozak;
	}

	static void ispis(int n) {
		System.out.println("Umnozak prirodnih brojeva u intervalu od 1 do n koji nisu djeljivi sa tri iznosi  " + n);
	}

}
