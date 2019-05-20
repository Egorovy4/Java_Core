package lesson6;

import java.text.DecimalFormat;

public abstract class Plane {
	
	private double length;
	private double width;
	private double weight;
	private PlaneDriving planeDriving;
	
	public Plane(double length, double width, double weight, PlaneDriving planeDriving) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.planeDriving = planeDriving;
	}

	public PlaneDriving getPlaneDriving() {
		return planeDriving;
	}

	public void setPlaneDriving(PlaneDriving planeDriving) {
		this.planeDriving = planeDriving;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void engineStart() {
		int min = 20;
		int max = 88;
		max -= min;
		System.out.println((int)(Math.random() * ++max) + min + " seconds to taking off !");
	}
	
	void takingOff() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(Math.random() * 1000) + " km - distance that plane could fly with full tank !");
	}
	
	void boarding() {
		System.out.println("The plane makes the boarding !");
	}
}
