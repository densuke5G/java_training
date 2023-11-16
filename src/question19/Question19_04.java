package question19;

public class Question19_04 {

	public static void main(String[] args) {
		String str = "ありがとう";
		String stri = "ございました";
		
		System.out.println(str);
		
		System.out.println("文字列の追加を行います");
		
		StringBuilder strin = new StringBuilder(str);
		strin.append(stri);
		
		System.out.println(strin);
	}

}
