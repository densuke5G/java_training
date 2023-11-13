package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1 を入力してください");
		String str1 = br.readLine();
		int num = Integer.parseInt(str1);

		if (num < 2 && num > 0) {
			System.out.println("1 が入力されました");
		} else {
			System.out.println("1 以外が入力されました");
		}
	}
}