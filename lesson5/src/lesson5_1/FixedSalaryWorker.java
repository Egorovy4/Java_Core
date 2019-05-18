package lesson5_1;

public class FixedSalaryWorker implements Salary {
	private double monthSalary;
	
	public FixedSalaryWorker(double monthSalary) {
		super();
		this.monthSalary = monthSalary;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public void salary() {
		System.out.println("Worker with fixed salary has " + this.monthSalary + "$ per month"); 
	}
}
