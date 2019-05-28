package lesson10_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
	public static void main(String[] args) {
		Integer[] myArray = new Integer[10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = getRandomIntegerNumber(0, 100);
		}
		System.out.println("Before sorting: " + Arrays.toString(myArray));
		
		Arrays.sort(myArray);
		System.out.println("After ASC sorting: " + Arrays.toString(myArray));
		
		Arrays.sort(myArray, Collections.reverseOrder());
		System.out.println("After DESC sorting: " + Arrays.toString(myArray));
	}

	public static int getRandomIntegerNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min > Max");
		}

		Random r = new Random();
		return r.nextInt(max - min) + min;
	}
}
