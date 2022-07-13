package edunova;

import javax.swing.JOptionPane;

//Za upisana 3 cijela broja
	// program ispisuje najveæi


public class Zadatak07 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost c"));
		
		
		
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		
		
		
		
	}

}
