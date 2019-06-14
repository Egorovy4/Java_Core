package lesson21_5;

public class Amphibia {
	ToDoSomething toDoSomething = whatToDo -> System.out.println(whatToDo);
}

interface ToDoSomething{
	void toDo(String whatToDo);
}