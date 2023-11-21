package question29;

import java.util.ArrayList;
import java.util.List;

public class Question29_04 {

	public static void main(String[] args) {
		User taro = new User();
		taro.setAge(23);
		taro.setName("鈴木太郎");
		User hanako = new User();
		hanako.setAge(25);
		hanako.setName("渡辺花子");
		User jirou = new User();
		jirou.setAge(27);
		jirou.setName("田中太郎");
		
		List<User> list = new ArrayList<>();
		
		list.add(taro);
		list.add(hanako);
		list.add(jirou);
		
		for (User u :list) {
			System.out.println("氏名は" + u.getName() + "年齢は" + u.getAge());
			
		}
	}

}
