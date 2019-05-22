package lesson8_2;

public class Application {
	public static void main(String[] args) throws IllegalAccessException, MyException {
		Methods m = new Methods();
		
		System.out.println("A + B = " + m.add(-1, -3));
		System.out.println("A - B = " + m.substruct(0, -9));
		System.out.println("A * B = " + m.multiply(0, 0));
		System.out.println("A / B = " + m.divide(10, 15));
	}
}
