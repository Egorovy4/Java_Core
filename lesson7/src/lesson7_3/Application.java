package lesson7_3;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x !");
		double x = scanner.nextDouble();
		System.out.println("Enter y !");
		double y = scanner.nextDouble();
		scanner.close();
		
		if(x % 1 != 0 || y % 1 != 0) {
			System.out.println("Entering failed !");
		} else {
			System.out.println("X + Y = " + (int)(x + y));
		}
	}
}
