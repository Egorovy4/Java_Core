package lesson10_2;

public class Helm {
	private double diameterOfWheel;
	private String helmMaterial;
	
	public Helm(double diameterOfWheel, String helmMaterial) {
		super();
		this.diameterOfWheel = diameterOfWheel;
		this.helmMaterial = helmMaterial;
	}

	public double getDiameterOfWheel() {
		return diameterOfWheel;
	}

	public void setDiameterOfWheel(double diameterOfWheel) {
		this.diameterOfWheel = diameterOfWheel;
	}

	public String getHelmMaterial() {
		return helmMaterial;
	}

	public void setHelmMaterial(String helmMaterial) {
		this.helmMaterial = helmMaterial;
	}

	@Override
	public String toString() {
		return "Helm [diameterOfWheel=" + diameterOfWheel + ", helmMaterial=" + helmMaterial + "]";
	}
}
