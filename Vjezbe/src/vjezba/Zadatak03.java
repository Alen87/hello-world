package vjezba;

import javax.swing.JOptionPane;

// Napisati program da provjeriti da li je upisani broj pozitivan, negativan ili nula i to ispiše

public class Zadatak03 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi a"));
		
		
		if(a>0) {
			System.out.println("Broj  je  pozitivan");
		}else if(a<0){
			System.out.println("Broj  je  negativan");
		}else {
			System.out.println("broj je  nula");
		}
		
		
		
		
		
	}

}
