package lesson12;

public class Human {
	private int weight;
	private int growth;

	public Human(int weight, int growth) {
		super();
		this.weight = weight;
		this.growth = growth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", growth=" + growth + "]";
	}
}
