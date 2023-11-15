package question13;

public class Dog {
	String name;
	int age;
	String food;
	
	public void showName(String name) {
		System.out.println("名前は" + name + "です");
	}
	
	public void showAge(int age) {
		System.out.println("年齢は" + age + "歳です");

	}
	public void showProfile(int age, String food) {
		System.out.println("年齢は" + age + "歳、好きな食べ物は" + food +"です");
		
	}
}
