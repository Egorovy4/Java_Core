package lesson22_2;

import java.util.HashSet;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Set<Person> setOfPerson = new HashSet<>();

		setOfPerson.add(new Person("Igor", 22));
		setOfPerson.add(new Person("Kristina", 18));
		setOfPerson.add(new Person("Nadia", 40));
		setOfPerson.add(new Person("Igor", 46));

		System.out.println("Before sorting: ");
		for (Person person : setOfPerson) {
			System.out.println(person);
		}

		System.out.println("\nAfter sorting by name using Comparable: ");
		setOfPerson.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(x -> System.out.println(x));

		System.out.println("\nAfter sorting by all fields using Comparator: ");
		setOfPerson.stream().sorted((a, b) -> !a.getName().equals(b.getName()) ? a.getName().compareTo(b.getName())
				: a.getAge() - b.getAge()).forEach(x -> System.out.println(x));
	}
}
