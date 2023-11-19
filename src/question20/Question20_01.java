package question20;

public class Question20_01 {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();

		test1.setStr("test1");
		test2.setStr("test2");
//		test2 = test1;

		System.out.println("1つ目は" + test1.getStr() + "です");
		System.out.println("2つ目は" + test2.getStr() + "です");
	}
}