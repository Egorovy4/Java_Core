package lesson8_2;

public class MyException extends Throwable {
	private String massage;

	public MyException(String massage) {
		super(massage);
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}
}
