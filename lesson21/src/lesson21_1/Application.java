package lesson21_1;

public class Application {
	public static void main(String[] args) {
		ToSound toSound = s -> System.out.println(s);
		
		new Cat().voice("I'm cat - Miaoo-Miaoo", toSound);
		new Dog().voice("I'm dog - Woof-Woof", toSound);
		new Cow().voice("I'm cow - Muuu-Muuu", toSound);
	}
}
