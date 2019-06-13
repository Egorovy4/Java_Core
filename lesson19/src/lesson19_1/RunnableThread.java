package lesson19_1;

import java.util.Scanner;

public class RunnableThread implements Runnable {
	private int delay;

	public RunnableThread(int delay) {
		this.delay = delay;
	}

	@Override
	public synchronized void run() {	
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\nRunnableThread: Enter quntity of numbers !");

		int quantity = scanner.nextInt();

		System.out.print("Потік Runnable: ");

		for (int i = quantity; i > 0; i--) {
			System.out.print(Math.round(Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)) + " ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
