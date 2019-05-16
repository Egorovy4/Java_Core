package lesson4_2;

public class Application {
	public static void main(String[] args) {
		String ansver = (int)(Math.random() * 10) % 2 == 0 ? "Eagle" : "Rescue";
		System.out.println(ansver);
	}
}
