package edunova;

//Za unesena 2 broja program ispisuje
		// sumu svih izmedju njih

import javax.swing.JOptionPane;

public class Zadatak21 {
public static void main(String[] args) {

	int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost a"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi vrijednost b"));
    
	int suma=0;
	
	
	for(int i=a<=b?a:b;i<=(b>a?b:a);i++) {
		suma+=i;
		
	}
	
	
	System.out.println(suma);
	
	


}
}