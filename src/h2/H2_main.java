package h2;

public class H2_main {

	public static void main(String[] args) {
		int jahr = 0;
		boolean schalt = false;

		jahr = 2025;
		schalt = false;

		if ((jahr % 4) == 0) {
			if ((jahr % 100) == 0) {
				if ((jahr % 400) == 0) {
					schalt = true;
				} else {
					schalt = false;
				}
			} else {
				schalt = true;
			}
		}
		if (schalt == true) {
			System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
		}
		if (schalt == false) {
			System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
		}

	}

}
