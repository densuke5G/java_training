package question08;

public class Question08_04 {

	public static void main(String[] args) {
		int[][] num1 = new int[2][3]; 
		 
		num1[0][0] = 10; 
		num1[0][1] = 20; 
		num1[0][2] = 30; 
		num1[1][0] = 40; 
		num1[1][1] = 50; 
		num1[1][2] = 60; 
		 
		System.out.println("1 段目の1つ目の値は" + num1[0][0]); 
		System.out.println("1 段目の2つ目の値は" + num1[0][1]); 
		System.out.println("1 段目の3つ目の値は" + num1[0][2]); 
		System.out.println("2 段目の1つ目の値は" + num1[1][0]); 
		System.out.println("2 段目の2つ目の値は" + num1[1][1]); 
		System.out.println("2 段目の3つ目の値は" + num1[1][2]); 
	}
	
}
