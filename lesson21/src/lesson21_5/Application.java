package lesson21_5;

public class Application {
	public static void main(String[] args) {
		
		Frog frog = new Frog();
		Amphibia amphibia = (Amphibia)frog;
		
		amphibia.toDoSomething.toDo("Eating");
		amphibia.toDoSomething.toDo("Sleeping");
		amphibia.toDoSomething.toDo("Swimming");
		amphibia.toDoSomething.toDo("Walking");
		
		System.out.println();
		
		frog.toDoSomething.toDo("Eating");
		frog.toDoSomething.toDo("Sleeping");
		frog.toDoSomething.toDo("Swimming");
		frog.toDoSomething.toDo("Walking");
	}
}
