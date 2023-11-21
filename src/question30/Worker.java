package question30;

public abstract class Worker {

	protected String job;
	protected String name;
	protected int age;

	protected Worker(String job, String name, int age) {
		this.job = job;
		this.name = name;
		this.age = age;
	}

	public void showIntroduction() { 
        System.out.println("名前は" + name + "、年齢は" + age + "歳、職業は" + job + "です。"); 
    }

	public abstract void doWork();
}
