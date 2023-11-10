package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_08 {

	public static void main(String[] args)throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = rd.readLine();
		String str2 = rd.readLine();
		String str3 = rd.readLine();
		int item1 = Integer.parseInt(str1);
		int item2 = Integer.parseInt(str2);
		int item3 = Integer.parseInt(str3);
		
		double sum = item1 * 0.7 + item2 * 0.7 + item3 * 0.7;
		double avarage = sum / 3;
		
		System.out.println("合計" + (int)sum + "円");
		System.out.println("平均" + (int)avarage + "円");

	}

}
