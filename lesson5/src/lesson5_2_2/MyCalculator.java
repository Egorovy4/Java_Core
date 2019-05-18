package lesson5_2_2;

import lesson5_2_1.Numerable;

public class MyCalculator implements Numerable {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		return (double)a / b;
	}
}
