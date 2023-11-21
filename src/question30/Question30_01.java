package question30;

public class Question30_01 {
	public static void main(String[] args) {

		Worker[] workers = new Worker[2];

		workers[0] = new Chef("鈴木", 31);
		workers[1] = new Police("田中", 28);

		Display.displayWorkers(workers);
	}
}