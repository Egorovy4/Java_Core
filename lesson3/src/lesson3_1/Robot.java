package lesson3_1;

public class Robot {
	private String whatToDo;
	
	Robot() {
		this.setWhatToDo("I'm Robot - i'm just working");
	}

	public String getWhatToDo() {
		return whatToDo;
	}

	public void setWhatToDo(String whatToDo) {
		this.whatToDo = whatToDo;
	}
	
	public void work() {
		System.out.println(whatToDo);
	}
}
