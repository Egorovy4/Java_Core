package lesson8_1;

public class WrongInputConsoleParametersException extends Throwable {
	private String massage;

	public WrongInputConsoleParametersException(String massage) {
		super(massage);
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}
}
