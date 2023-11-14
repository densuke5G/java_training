package question10;

public class Question10_09 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				System.out.print(" ");
				if (i == j) {
					break;
				}
			}
			System.out.println("");
		}

	}

}
