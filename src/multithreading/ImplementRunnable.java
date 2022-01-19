package multithreading;

public class ImplementRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new Loader());
		t.start();
	}

}

class RunnableLoader implements Runnable {
	public void run() {
		System.out.println("Hello");
	}
}
