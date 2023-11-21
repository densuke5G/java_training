package question30;

public class Display {

	public static void displayWorkers(Worker[] workers) {
		for (int i = 0; i < workers.length; i++) {

			workers[i].showIntroduction();
			workers[i].doWork();
		}
	}
}