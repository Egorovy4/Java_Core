package lesson4_4;

public class Application {
	public static void main(String[] args) {
		Triangle versatile = new Triangle(10, 15, 20);		// г����������� ���������
		Triangle isosceles = new Triangle(10, 15);			// г����������� ���������
		Triangle equilateral = new Triangle(10);			// г����������� ���������
		
		System.out.println(versatile);
		System.out.println(isosceles);
		System.out.println(equilateral);
	}
}
