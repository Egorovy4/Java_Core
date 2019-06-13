package lesson19_1;

import java.util.Scanner;

public class MyThread extends Thread {
	@Override
	public synchronized void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("MyThread: Enter quntity of numbers !");

		int quantity = scanner.nextInt();

		System.out.print("Потік Thread: ");

		for (int i = 1; i < quantity + 1; i++) {
			System.out.print(Math.round(Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)) + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
