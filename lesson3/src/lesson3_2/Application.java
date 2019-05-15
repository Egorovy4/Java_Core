package lesson3_2;

public class Application {
	public static void main(String[] args) {
		Car c = new Car("BMW", 10, 280.00, 590_000.00, false, new Helm(30.5, "Circle"), new Wheel(35, "Summer"), new Body("SUV", "Black"));
		System.out.println(c);
		
		c.changeBodyType("Sedan");
		System.out.println(c);
		
		c.changePrice(520_000.00);
		System.out.println(c);
		
		c.solding();
		System.out.println(c);
	}
}
