package question12;

public class Question12_02 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.height = 52.3;
		cat.weight = 4.8;
		cat.food = "ささみ";
		
		System.out.println("身長は" + cat.height + "です");
		System.out.println("体重は" + cat.weight + "です");
		System.out.println("好きな食べ物は" + cat.food + "です");
	}

}
