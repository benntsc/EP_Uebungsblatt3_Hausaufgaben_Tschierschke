package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = 0;
		double monEingang = 0;

		int rating = 0;

		boolean warnhinweis = false;
		boolean negativ = true;

		guthaben = -100;
		monEingang = 200;
		rating = -2;

		warnhinweis = false;
		if (guthaben < 0) {
			if (Math.abs(monEingang) >= Math.abs(guthaben)) {
				rating = rating + 1;
			}
			if (Math.abs(monEingang) < Math.abs(guthaben)) {
				rating = rating - 1;
				if (rating < 0) {
					warnhinweis = true;
				} else {
					warnhinweis = false;
				}
			}
			negativ = true;
		} else {
			negativ = false;
			if (guthaben == 0) {
				rating = rating + 2;
			} else {
				rating = rating + 3;
			}
		}
		System.out.println(negativ + "  " + rating + " " + warnhinweis + " ");

	}

}
