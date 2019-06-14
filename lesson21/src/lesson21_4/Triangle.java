package lesson21_4;

public class Triangle {
	private int a;
	private int b;
	private int c;
	
	Triangle() {}
	
	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Triangle(int a, int b) {
		this(a, a, b);
	}
	
	Triangle(int a) {
		this(a, a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
