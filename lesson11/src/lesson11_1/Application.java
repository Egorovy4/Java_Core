package lesson11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		List<String> helmMaterial = new ArrayList<>();
		helmMaterial.add("Leather");
		helmMaterial.add("Alcantara");

		boolean key = true;
		List<Car> carArrays = new ArrayList<>();

		for (int a = 0; a < getRandomIntegerNumber(5, 11); a++) {
			carArrays.add(new Car(getRandomIntegerNumber(100, 701), getRandomIntegerNumber(1900, 2020),
					new Helm((double) getRandomIntegerNumber(25, 36), helmMaterial.get(getRandomIntegerNumber(0, 2))),
					new Engine(getRandomIntegerNumber(1, 9))));
		}

		while (key) {
			menu();
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println(carArrays + "\n");
				break;
			case 2:
				for (int a = 0; a < carArrays.size(); a++) {
					carArrays.set(a, new Car(0, 0, new Helm(0, null), new Engine(0)));
				}
				System.out.println(carArrays + "\n");
				break;
			case 3:
				sc.close();
				System.out.println("Good bye !");
				key = false;
				break;
			}
		}
	}

	public static int getRandomIntegerNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min > Max");
		}
		Random r = new Random();
		return r.nextInt(max - min) + min;
	}

	public static void menu() {
		System.out.println("Enter 1: To show all information about cars !");
		System.out.println("Enter 2: To refresh all information about cars !");
		System.out.println("Enter 3: To exit !");
	}
}
