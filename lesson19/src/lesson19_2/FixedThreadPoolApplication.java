package lesson19_2;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolApplication {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Future<?> submit = executorService.submit(new Runnable() {
			@Override
			public void run() {
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
		});

		submit.get();

		Future<?> submit2 = executorService.submit(new Runnable() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);

				System.out.println("\n\nRunnableThread: Enter quntity of numbers !");

				int quantity = scanner.nextInt();

				System.out.print("Потік Runnable: ");

				for (int i = quantity; i > 0; i--) {
					System.out.print(Math.round(Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)) + " ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		submit2.get();
		executorService.shutdown();
	}
}
