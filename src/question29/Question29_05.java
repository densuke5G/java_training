package question29;

import java.util.HashMap;

public class Question29_05 {

	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
		
		hash.put("orange", 100);
		hash.put("grape", 200);
		hash.put("strawberry", 300);
		
		System.out.println("みかんの価格は" + hash.get("orange") + "円です");
		System.out.println("ぶどうの価格は" + hash.get("grape") + "円です");
		System.out.println("いちごの価格は" + hash.get("strawberry") + "円です");
		
		for (String str : hash.keySet()) {
			System.out.println(str + "の価格は" + hash.get(str) + "円です");
			
		}
	}

}
