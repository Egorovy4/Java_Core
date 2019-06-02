package lesson13_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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

		List<Person> listOfPerson = new ArrayList<>(setOfPerson);

		Collections.sort(listOfPerson);

		System.out.println("\nAfter sorting by name using Comparable: ");

		for (Person person : listOfPerson) {
			System.out.println(person);
		}

		Collections.sort(listOfPerson, new PersonAllFieldComparator());

		System.out.println("\nAfter sorting by all fields using Comparator: ");

		for (Person person : listOfPerson) {
			System.out.println(person);
		}
	}
}
