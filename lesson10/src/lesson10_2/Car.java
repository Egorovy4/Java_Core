package lesson10_2;

public class Car {
	private int quantityOfHorsepower;
	private int creationYear;
	private Helm helm;
	private Engine engine;
	
	public Car(int quantityOfHorsepower, int creationYear, Helm helm, Engine engine) {
		super();
		this.quantityOfHorsepower = quantityOfHorsepower;
		this.creationYear = creationYear;
		this.helm = helm;
		this.engine = engine;
	}

	public int getQuantityOfHorsepower() {
		return quantityOfHorsepower;
	}

	public void setQuantityOfHorsepower(int quantityOfHorsepower) {
		this.quantityOfHorsepower = quantityOfHorsepower;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [quantityOfHorsepower=" + quantityOfHorsepower + ", creationYear=" + creationYear + ", helm=" + helm
				+ ", engine=" + engine + "]";
	}
}
