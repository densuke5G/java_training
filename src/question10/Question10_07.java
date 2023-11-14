package question10;

import java.util.Arrays;

public class Question10_07 {
	public static void main(String[] args) {
		int[] nums = { 30, 53, 21, 70, 60 };

		Arrays.sort(nums);
		
		System.out.println("ソートが完了しました");

		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}