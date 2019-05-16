package lessosn4_5;

public class Application {
	public static void main(String[] args) {
		
		Frog f = new Frog();
		Amphibia a = (Amphibia)f;
		
		// Amphibia a = new Frog();			- shorter way !
		
		a.toEat();
		a.toSleep();
		a.toSwim();
		a.toWalk();
		
		System.out.println();
		
		f.toEat();
		f.toSleep();
		f.toSwim();
		f.toWalk();
	}
}
