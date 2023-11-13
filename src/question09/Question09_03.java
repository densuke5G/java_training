package question09;

public class Question09_03 {

	public static void main(String[] args) {
		int number = 20;
		
		if (number >= 80) {
			System.out.println("テストの点数は優秀です");
		} else if (number >= 50) {
			System.out.println("テストの点数は平均です");
			
		} else if (number >= 30) {
			System.out.println("テストの点数は及第です");
			
		} else {
			System.out.println("赤点のため追試が必要です");
			
		}
		System.out.println("お疲れ様でした");


	}

}
