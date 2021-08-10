package concepts;

public class Multithreading {

	public static void main(String[] args) {

//		for(int i=0;i<10;i++) {
//			ThredingDemo1 td = new ThredingDemo1();
//			td.start();
//		}
		
		for(int i=0;i<3;i++) {
			Thread thread = new Thread(new ThredingDemo2());
			thread.start();
		}
	}

}

// 1. Extending Thread class
class ThredingDemo1 extends Thread {

	@Override
	public void run() {
		// Displaying the thread that is running
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
}

// 1. Implementing Runnable interface
class ThredingDemo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		for(int i=0;i<10;i++) {
			System.out.println("i " + i);
		}
		// Displaying the thread that is running
	}
}