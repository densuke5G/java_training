package question30;

public class Chef extends Worker {

	public Chef(String name, int age) {
		super(Constant.CHEF, name, age);
	}

	public void doWork() {
		System.out.println("食事を作ります。");
	}
}