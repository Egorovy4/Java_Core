package lesson21_3;

public class Application {
	public static void main(String[] args) {
		Showable showMinValue = (Number n) -> System.out
				.println(n.getClass().getTypeName() + " MIN VALUE = " + "\"" + n + "\"");
		Showable showMaxValue = (Number n) -> System.out
				.println(n.getClass().getTypeName() + " MAX VALUE = " + "\"" + n + "\"");

		showMinValue.toShow(Float.MIN_VALUE);
		showMaxValue.toShow(Float.MAX_VALUE);
		showMinValue.toShow(Double.MIN_VALUE);
		showMaxValue.toShow(Double.MAX_VALUE);
	}
}

interface Showable {
	void toShow(Number n);
}