package lesson6;

public class Main {
	public static void main(String[] args) {
		SU_27 su27 = new SU_27(22.67, 5.92, 21200, new PlaneDriving(), 2500, "Grey");
		
		su27.engineStart();
		su27.takingOff();
		su27.getPlaneDriving().moveUp(100);
		su27.getPlaneDriving().moveLeft(100);
		su27.getPlaneDriving().moveDown(100);
		su27.getPlaneDriving().moveRight(200);
		su27.stealthTechnology();
		su27.nuclearStrike();
		su27.turboAcceleration();
		su27.boarding();
	}
}
