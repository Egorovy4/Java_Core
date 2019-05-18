package lesson5_1;

public class HourlySalaryWorker implements Salary {
	private int quantityHours;
	private double hourSalary;

	public HourlySalaryWorker(int quantityHours, double hourSalary) {
		super();
		this.quantityHours = quantityHours;
		this.hourSalary = hourSalary;
	}
	
	public double getQuantityHours() {
		return quantityHours;
	}
	
	public void setQuantityHours(int quantityHours) {
		this.quantityHours = quantityHours;
	}
	
	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	@Override
	public void salary() {
		System.out.println("Worker with hourly salary has " + this.quantityHours * this.hourSalary + "$ per month (" + this.quantityHours + " hours)");
	}
}
