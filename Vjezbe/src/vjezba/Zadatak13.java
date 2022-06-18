package vjezba;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JOptionPane;

//Učitati članove i naći najmanji član niza.

public class Zadatak13 {
public static void main(String[] args) {
	
	int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj clanova niza"));
	
	int[]niz=new int[n];
	
	for(int i=0;i<niz.length;i++) {
		niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
	}
	int min=niz[0];
	for(int i=0;i<niz.length;i++) {
		System.out.println(niz[i]);
	}
	
	for(int i=1;i<niz.length;i++) {
		if(min>niz[i]) {
			min=niz[i];
		}
	}
	System.out.println("najmanji  clan  niza je  " + min);
}
}
