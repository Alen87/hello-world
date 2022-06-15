package vjezba;

import javax.swing.JOptionPane;

public class Zadatak04 {
	public static void main(String[] args) {
	
		//  Učitati dva broja. Ako je jedan veći od nule ispisati "barem jedan veci" inače ispisati sumu oba broja.
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		int sum;
		
		if(a<0 || b<0) {
			System.out.println("Barem  jedan  veci");
		}else {
			sum=a +b;
			System.out.println(sum);
		}
		
		
		
		
		
		
		
	}

}
