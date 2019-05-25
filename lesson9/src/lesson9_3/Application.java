package lesson9_3;

public class Application {
	public static void main(String[] args) {
		String text = "My name is Igor Iwanyshyn and I like programming !";

		String[] array = text.split(" |, |: |- |\\(|\\)|\\\"|[.!?]$");

		int wordCounter = 0;

		for (String temp : array) {
			if (temp.length() > 1) {
				wordCounter++;
				System.out.println(wordCounter + ": " + temp);
			}
		}

		System.out.println("\nWe have " + wordCounter + " words in this sentence !");
	}
}