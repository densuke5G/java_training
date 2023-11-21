package question28;

public class Question28_03 {
	public static void main(String[] args) {
		try {
			throwExp();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("終了");
		}
	}
	
	public static void throwExp()throws TestException {
		throw new TestException("独自例外が発生しました");
		
	}
}
