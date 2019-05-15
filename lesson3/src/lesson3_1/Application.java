package lesson3_1;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot();
		CoffeRobot cr = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCoocker rc = new RobotCoocker();
		
		r.work();
		cr.work();
		rd.work();
		rc.work();
		
		Robot[] array = {r, cr, rd, rc};
		
		for(int i = 0; i < array.length; i++) {
			array[i].work();
		}
	}
}
