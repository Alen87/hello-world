package vjezba;

//Napiši koristeći break, naredbu koja ce ispisati sve moguce kombinacije
// brojeva 1,2 i 3  uz uvjet da se kombinacija 2-1,2-2,2-3 ne ispišu

public class Zadatak24 {
	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 2 && j == 1) {
					break;
				}
				System.out.println(i + " " + j);
			}

		}

	}
}
