package vjezba;
import java.util.Arrays;

public class Zadatak29 {
	public static void main(String[] args) {
		String ime1 = "Alen", ime2 = "Daria";

		String zbrojImena = ime1 + ime2;

		int[] niz = new int[zbrojImena.length()];

		int count = 0;

		for (int i = 0; i < zbrojImena.length(); i++) {
			count = 0;
			for (int j = 0; j < zbrojImena.length(); j++) {
				if (zbrojImena.toLowerCase().charAt(i) == zbrojImena.toLowerCase().charAt(j)) {
					count++;
				}
			}
			niz[i] = count;
		}

		System.out.println(Arrays.toString(niz));

		// sad imam niz koji je dugaèak imeConcat.length(). i želim ga na dva
		// dijela prepolovit, tj na Martu i Manuela

		int[] niz1 = new int[ime1.length()];
		int[] niz2 = new int[ime2.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < ime1.length()) {
				niz1[i] = niz[i];
			} else if (i >= ime1.length()) {
				niz2[i - ime1.length()] = niz[i];
			}
		}

		System.out.println();
		System.out.print("Niz prvog imena: " + Arrays.toString(niz1));
		System.out.println();
		System.out.print("Niz drugog imena: " + Arrays.toString(niz2));

	}
	}


