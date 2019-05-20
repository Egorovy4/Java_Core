package lesson6;

public class SU_27 extends Plane implements SpecialFeatures {
	int maxSpeed;
	String color;

	public SU_27(double length, double width, double weight, PlaneDriving planeDriving, int maxSpeed, String color) {
		super(length, width, weight, planeDriving);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void turboAcceleration() {
		System.out.println("Acceleration = " + ((int)(Math.random() * (maxSpeed)) + maxSpeed) + " km per hour !");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The plane is being unvisible for " + ((int)(Math.random() * 1000)) + " seconds !");
	}

	@Override
	public void nuclearStrike() {
		System.out.println("The plane dropped " + ((int)(Math.random() * 10 + 1)) + " nuclear warheads !");
	}
}
