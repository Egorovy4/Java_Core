package lesson10_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int xSize = getRandomIntegerNumber(1, 11);
		int ySize = getRandomIntegerNumber(1, 11);
		String[] helmMaterial = { "Leather", "Alcantara" };
		boolean key = true;

		Car[][] carArrays = new Car[xSize][ySize];

		for (int a = 0; a < xSize; a++) {
			for (int b = 0; b < ySize; b++) {
				carArrays[a][b] = new Car(getRandomIntegerNumber(100, 701), getRandomIntegerNumber(1900, 2020),
						new Helm((double) getRandomIntegerNumber(25, 36), helmMaterial[getRandomIntegerNumber(0, 2)]),
						new Engine(getRandomIntegerNumber(1, 9)));
				// System.out.println(carArrays[a][b]);
			}
		}

		while (key) {
			menu();
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println(Arrays.deepToString(carArrays) + "\n");
				break;
			case 2:
				Car temp = new Car(0, 0, new Helm(0, null), new Engine(0));
				for (int a = 0; a < xSize; a++) {
					Arrays.fill(carArrays[a], temp);
				}
				System.out.println(Arrays.deepToString(carArrays) + "\n");
				break;
			case 3:
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
