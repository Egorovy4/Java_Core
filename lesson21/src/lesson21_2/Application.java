package lesson21_2;

public class Application {
	public static void main(String[] args) {
		CoineResult coineResult = () -> {
			String s = (int)(Math.random() * 10) % 2 == 0 ? "Eagle" : "Rescue";
			System.out.println(s);
		};
		
		
		coineResult.getRandomValue();
	}
}

interface CoineResult {
	void getRandomValue();
}