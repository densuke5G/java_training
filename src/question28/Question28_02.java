package question28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question28_02  {
	public static void main(String[] args) {
		
		try {
			io();
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		} catch (IOException e) {
			System.out.println("例外が発生しました");
			
		} finally {
			System.out.println("システムを終了します");
			
		}
	}
	
	public static void io()throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数値を入力してください");
		String str = br.readLine();
		Integer.parseInt(str);
	}
}
