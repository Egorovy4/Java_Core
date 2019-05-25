package lesson9_1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws DifferentSizeOfWord {
		System.out.println("Enter tour word !");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		StringBuilder sb = new StringBuilder(word);

		if (word.length() == 5) {
			if (word.toLowerCase().equals(sb.reverse().toString().toLowerCase())) {
				System.out.println("The word " + word + " is a palindrome !");
			} else {
				System.out.println("The word " + word + " is not a palindrome !");
			}
		} else {
			throw new DifferentSizeOfWord("Your word have more or less than 5 letters !");
		}
	}
}
