package question29;

import java.util.ArrayList;
import java.util.List;

public class Question29_03 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();

		fruits.add("orange");
		fruits.add("grape");
		fruits.add("strawberry");
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}