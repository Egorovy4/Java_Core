package lesson2;

public class Application {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 10);
		Circle c = new Circle(10);
		
		System.out.println("Площа прямокутника = " + r1.area() + "\nПериметр прямокутника = " + r1.perimeter());
		System.out.println("\nПлоща прямокутника = " + r2.area() + "\nПериметр прямокутника = " + r2.perimeter());
		System.out.println("\nПлоща круга = " + c.circleArea() + "\nДовжина кола = " + c.circleLength());
	}
}

class Rectangle {
	private double length;
	private double width;
	
	Rectangle() {
		length = 10;
		width = 10;
	}
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter () {
		return (this.length + this.width) * 2;
	}
}

class Circle {
	private double radius;
	private double diameter;
	
	Circle() {}
	
	Circle(double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	public double circleArea() {
		return Math.PI * Math.pow(this.diameter / 2, 2);
	}
	
	public double circleLength() {
		return 2 * Math.PI * this.radius;
	}
}