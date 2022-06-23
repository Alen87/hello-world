package vjezba;

import javax.swing.JOptionPane;

// Napisati program da ispisuje 3 puta u 3 reda IME sa razmakom.
 
public class Zadatak17 {
public static void main(String[] args) {

	int n= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("Alen  ");
		}
		System.out.println();
	}

	
	
}
}
