package question30;

public class Police extends Worker {

	public Police(String name, int age) {
		super(Constant.TEACHER, name, age);
	}

	public void doWork() {
		System.out.println("地域や人々の安全を守ります。");
	}
}