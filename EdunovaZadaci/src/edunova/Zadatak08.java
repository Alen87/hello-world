package edunova;

import javax.swing.JOptionPane;

//program unosi broj izmeðu 
// 1 i 999
// U sluèaju da je izvan tog raspona
// ispisati grešku i prekinuti program
// Program ispisuje 1. znamenku upisanog broja

// -5 greška
// 1067 greška
// 456 4
// 6 6
// 89 8

public class Zadatak08 {
public static void main(String[] args) {
	
	int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	
	
	if(broj < 1 || broj > 999) {
		System.out.println("greska");
	}else if(broj > 0  && broj < 10) {
		System.out.println(broj);
	}else if(broj >=10 && broj < 100) {
		System.out.println(broj / 10);
	}else {
		System.out.println(broj / 100);
	}
	
	
	
	
}
}
