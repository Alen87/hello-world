package vjezba.zadatak01;

//Kreirati dvije klase Bike i Splender. Splender klasa nasljeđuje Bike klasu i preklapa njenu run() metodu. Metodu run pozivamo pomoću referentne varijable roditeljske klase.
//
//
//Opis programa: Kreirane su dvije klase Bike i Splender. Splender klasa nasljeđuje Bike klasu i preklapa njenu run() metodu. 
//Metodu run pozivamo pomoću referentne varijable roditeljske klase. Pošto ona upućuje na objekt podklase,
//a metoda podklase preklapa metodu roditeljske klase, metoda podklase se poziva u vremenu izvršavanja. (Vidi Polimorfizam /POLYMORPHISM/ - Java runtime polimorfizma /UPCASTING/)

public class Bike {
 
	void run() {
		System.out.println("vozi");
	}
	
	
}



