package lesson9_2;

public class Application {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ћен≥ тринадц€тий минало. я пас €гн€та за селом.");
		String vowelLetters = "јќ”»≈≤аоуие≥";

		for (int a = 0; a < sb.length(); a++) {
			for (int b = 0; b < vowelLetters.length(); b++) {
				if (sb.charAt(a) == vowelLetters.charAt(b)) {
					sb.replace(a, a + 1, "-");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
