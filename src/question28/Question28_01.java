package question28;

public class Question28_01 {
	public static void main(String[] args) {
		String str = "こんにちは";
		
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}
//		System.out.println("変換したら" + num + "になりました");
	}
}