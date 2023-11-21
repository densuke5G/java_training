package question28;

public class Question28_04 {
	public static void main(String[] args) throws TestException {
		try {
			int[] numArray = new int[5];

			numArray[10] = 3;

		} catch (Exception e) {
			throw new TestException("独自例外です");
		}
	}
}