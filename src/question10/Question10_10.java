package question10;

public class Question10_10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int k = 0; k < 8; k++) {
				if (k == 8 - i) {
					break;
				}
				System.out.print("  ");
			}
			for (int j = 1; j <= 15; j++) {
				if (i % 2 == 0) {
					System.out.print("□");

				} else {
					System.out.print("■");

				}
				if (j == 2 * i - 1) {
					break;
				}
			}
			System.out.println("");
		}

	}

}
