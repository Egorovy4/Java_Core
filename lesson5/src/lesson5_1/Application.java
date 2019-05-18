package lesson5_1;

public class Application {
	public static void main(String[] args) {
		HourlySalaryWorker h = new HourlySalaryWorker(99, 3.00);
		FixedSalaryWorker f = new FixedSalaryWorker(350.00);
		
		h.salary();
		f.salary();
	}
}
