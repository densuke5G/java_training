package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_03 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		double dnum = Double.parseDouble(str);
		
		System.out.println("サイズが" + dnum + "の靴を購入します");

	}

}
