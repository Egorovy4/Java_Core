package lesson9_5;

public class Application {
	public static void main(String[] args) {
		String text = "I like (programming), I like math, I like music very very very very much!";
		Application a = new Application();
		String[] resultedTextArray = a.getResultedTextArray(a.getTextArray(text));
		System.out.println("Counting with case difference...");
		System.out.println("The most popular word in sentence is \"" + a.getOftenUsedWord(resultedTextArray) + "\" !");
	}

	private String[] getTextArray(String text) {
		String[] textArray = text.split(" |, |: |- |\\(|\\)|\\\"|\\. |\\! |\\? |[.!?]$");
		return textArray;
	}

	private String[] getResultedTextArray(String[] textArray) {
		int resultedTextArraySize = 0;
		for (String temp : textArray) {
			if (temp.length() > 1) {
				resultedTextArraySize++;
			}
		}
		String[] resultedText = new String[resultedTextArraySize];
		int resultedTextIndex = 0;
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].length() > 1) {
				resultedText[resultedTextIndex] = textArray[i];
				resultedTextIndex++;
			}
		}
		return resultedText;
	}

	private String getOftenUsedWord(String[] resultedTextArray) {
		String[] wordsArray = new String[resultedTextArray.length];
		int[] quantityOfWords = new int[resultedTextArray.length];
		for (int a = 0; a < resultedTextArray.length; a++) {
			wordsArray[a] = resultedTextArray[a];
			quantityOfWords[a] = 0;
			for (int b = 0; b < resultedTextArray.length; b++) {
				if (wordsArray[a].equals(resultedTextArray[b])) {
					quantityOfWords[a]++;
				}
			}
		}
		int maxQuantityOfWords = quantityOfWords[0];
		int indexOfPopularWord = 0;
		for (int i = 1; i < quantityOfWords.length; i++) {
			if (quantityOfWords[i] > maxQuantityOfWords) {
				maxQuantityOfWords = quantityOfWords[i];
				indexOfPopularWord = i;
			}
		}
		// System.out.println("\"" + wordsArray[indexOfPopularWord] + "\", " +
		// quantityOfWords[indexOfPopularWord] + " times");
		return wordsArray[indexOfPopularWord];
	}
}
