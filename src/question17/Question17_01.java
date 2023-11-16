package question17;

public class Question17_01 {
	int age;
	double floating;
	
	Question17_01() {
		System.out.println("コンストラクタです");
	}
	
	Question17_01(int age) {
		this();
		this.age = age;
	}
	
	Question17_01 (double floating) {
		this();
		this.floating = floating;
	}
}