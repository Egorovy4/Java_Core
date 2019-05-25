package lesson9_4;

public class Application {
	public static void main(String[] args) {
		String text = "My name is Igor Iwanyshyn! I am twenty two years old. I like programming. Also I like to watch films.";

		String[] array = text.split("[.!?] |[.!?]$");

		int sentenceCounter = 0;

		for (String temp : array) {
			if (temp.length() > 1) {
				sentenceCounter++;
				System.out.println(sentenceCounter + ": " + temp);
			}
		}

		System.out.println("\nWe have " + sentenceCounter + " sentences in this text !");
	}
}
