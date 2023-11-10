package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_07 {

	public static void main(String[] args)throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		String str = rd.readLine();
		int bill = Integer.parseInt(str);
		
		double bills = bill *  0.7;
		
		System.out.println("3割引きで" + (int)bills + "円です");

	}

}
