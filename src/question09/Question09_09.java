package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_09 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("整数を入力してください。");
		
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		if (num % 2 == 1) {
			System.out.println(num + "は奇数です。");
		} else {
			System.out.println(num + "は偶数です。");
			
		}

	}

}
