package lesson11_1;

public class Engine {
	private int quantityOfCylinders;

	public Engine(int quantityOfCylinders) {
		super();
		this.quantityOfCylinders = quantityOfCylinders;
	}

	public int getQuantityOfCylinders() {
		return quantityOfCylinders;
	}

	public void setQuantityOfCylinders(int quantityOfCylinders) {
		this.quantityOfCylinders = quantityOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [quantityOfCylinders=" + quantityOfCylinders + "]";
	}
}
