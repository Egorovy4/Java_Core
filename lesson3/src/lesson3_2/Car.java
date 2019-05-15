package lesson3_2;

public class Car {
	String model;
	int age;
	double speed;
	double price;
	boolean isSold;
	
	Helm helm;
	Wheel wheel;
	Body body;
	
	public Car(String model, int age, double speed, double price, boolean isSold, Helm helm, Wheel wheel, Body body) {
		super();
		this.model = model;
		this.age = age;
		this.speed = speed;
		this.price = price;
		this.isSold = isSold;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", age=" + age + ", speed=" + speed + ", price=" + price + ", isSold=" + isSold
				+ ", helm=" + helm + ", wheel=" + wheel + ", body=" + body + "]";
	}
	
	public void changePrice(double newPrice) {
		this.price = newPrice;
	}
	
	public void solding() {
		this.isSold = true;
	}
	
	public void changeBodyType(String newType) {
		this.body.setType(newType);
	}
}
