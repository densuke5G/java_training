package question07;

public class Question07_02 {

	public static void main(String[] args) {
		int sum = 10;
		
		int ans1 = sum++;
		int ans2 = sum--;
		
		System.out.println("sumに1を足すと" + ans1 + "です");
		System.out.println("sumから1を引くと" + ans2 + "です");

	}

}
