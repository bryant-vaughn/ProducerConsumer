import java.util.concurrent.Semaphore;

public class PC {
	// main program driver
	public static void main(String[] args) {

		// creating buffer queue
		Q q = new Q();

		// starting consumer thread
		new Consumer(q);

		// starting producer thread
		new Producer(q);
	}
}