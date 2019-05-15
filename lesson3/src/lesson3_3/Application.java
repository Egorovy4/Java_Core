package lesson3_3;

public class Application {
	public static void main(String[] args) {
		Animal a = new Animal("Bird", 120.00, 7);
		
		System.out.println("Animal name = " + a.getName() + ", Animal speed = " + a.getSpeed() + " km/h, Animal age = " + a.getAge() + " years");
		
		a.setName("Cat");
		a.setSpeed(80.00);
		a.setAge(6);
		
		System.out.println("Animal name = " + a.getName() + ", Animal speed = " + a.getSpeed() + " km/h, Animal age = " + a.getAge() + " years");
	}
}
