package question19;

public class Question19_03 {

	public static void main(String[] args) {
		String str = "カエルがゲコゲコとゲコ池で鳴いている。";
		
		int num = str.indexOf("ゲコ") + 1;
		
		System.out.println(str);
		System.out.println("ゲコという文字は先頭から" + num + "番目です");
	}

}
