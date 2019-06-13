package lesson19_1;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();

		RunnableThread runnableThread = new RunnableThread(1000);
		Thread t = new Thread(runnableThread);
		t.run();
		t.join();
	}
}
