package vjezba;

import javax.swing.JOptionPane;

//Napisati program za ispis dvocifrenih brojeva kao na slici sa dvije petlje (za svaki rezultat odvojena petlja):



public class Zadatak18 {
public static void main(String[] args) {
	
int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));


for(int i=1;i<=n;i++) {
	for(int j=0;j<=n;j++) {
		System.out.print(i+ "" +j + "  ");
	}
	System.out.println();
}
	
	
	
	
	
}
}
