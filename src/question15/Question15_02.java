package question15;

public class Question15_02 {

	public static void main(String[] args) {
		Profile pro = new Profile();
		
		pro.setAge(20);
		pro.setName("マイケル");
		
		System.out.println("私の名前は" + pro.getName());
		System.out.println("年齢は" + pro.getAge());
	}

}
