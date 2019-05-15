package lesson3_2;

public class Helm {
	private double helmDiameter;
	private String type;

	Helm(double helmDiameter, String type) {
		this.helmDiameter = helmDiameter;
		this.type = type;
	}

	public double getHelmDiameter() {
		return helmDiameter;
	}

	public void setHelmDiameter(float helmDiameter) {
		this.helmDiameter = helmDiameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Helm [helmDiameter=" + helmDiameter + ", type=" + type + "]";
	}
	
	public void changeHelmDiameter (float value) {
		this.helmDiameter += value;
		System.out.println("Refreshed data: NEW HELM DIAMETER = " + this.helmDiameter);
	}
}
