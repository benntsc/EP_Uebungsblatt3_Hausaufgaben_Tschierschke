package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 0;
		int fix = 0;
		int wartend = 0;
		boolean istVoll = false;

		max = 5;
		fix = 2;
		wartend = 2;
		if (fix == max) {
			istVoll = true;
		} else {
			istVoll = false;
		}

		System.out.println("Maximale Anzahl: " + max);
		System.out.println("Vorher vergebene Fixplätze: " + fix);
		System.out.println("Warteliste: " + wartend);
		if (istVoll == true) {
			System.out.println("Der Saal ist vorher schon voll.");
		} else {
			System.out.println("Der Saal ist noch nicht voll.");
		}

		if ((max - fix) > wartend) {
			fix = fix + wartend;
			wartend = 0;
			istVoll = false;
		}
		if ((max - fix) == wartend) {
			fix = max;
			wartend = 0;
			istVoll = true;
		}
		if ((max - fix) < wartend) {
			wartend = wartend - (max - fix);
			fix = max;
			istVoll = true;
		}
		System.out.println("Nachher vergebene Fixplätze: " + fix);
		System.out.println("Warteliste: " + wartend);
		if (istVoll == true) {
			System.out.println("Der Saal ist nun voll.");
		} else {
			System.out.println("Der Saal ist immer noch nicht voll.");
		}
	}

}
