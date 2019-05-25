package lesson9_1;

public class DifferentSizeOfWord extends Exception {
	private String message;

	public DifferentSizeOfWord(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
