package lesson7_2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		runScanner();
	}

	private static void runScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number !");
		double enteredNumber = scanner.nextDouble();
		
		if(enteredNumber % 1 != 0) {
			System.out.println("Entering failed !");
		} else {
			if(enteredNumber % 2 == 0) {
				System.out.println("Your number is pair !");
			} else if(enteredNumber % 2 > 0) {
				System.out.println("Your number is odd !");
			}
		}
	}
}
