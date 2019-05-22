package lesson8_2;

public class Methods {
	public int add(int a, int b) throws IllegalAccessException, MyException {
		tryCatch(a, b);
		return a + b;
	}

	public int substruct(int a, int b) throws IllegalAccessException, MyException {
		tryCatch(a, b);
		return a - b;
	}

	public int multiply(int a, int b) throws IllegalAccessException, MyException {
		tryCatch(a, b);
		return a * b;
	}

	public double divide(int a, int b) throws IllegalAccessException, MyException {
		tryCatch(a, b);
		return (double) a / b;
	}
	
	private void tryCatch(int a, int b) throws IllegalAccessException, MyException {
		if (a < 0 && b < 0) {
			throw new IllegalArgumentException("a < 0 && b < 0");
		}
		
		if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
			throw new ArithmeticException("(a == 0 && b != 0) || (a != 0 && b == 0)");
		}
		
		if (a == 0 && b == 0) {
			throw new IllegalAccessException("a == 0 && b == 0");
		}
		
		if (a > 0 && b > 0) {
			throw new MyException("a > 0 && b > 0");
		}
	}
}
