package lesson18;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("OneObjectSerialize.txt");

		Employee e1 = new Employee(1, "Igor", 400.00);

		Methods.serialize(file, (Serializable) e1);
		System.out.println(Methods.deserealize(file));

		Collection<Employee> myCollection = new ArrayList<>();
		myCollection.add(e1);
		myCollection.add(new Employee(2, "Ivan", 450.00));
		myCollection.add(new Employee(3, "Max", 500.00));

		System.out.println("Before serialization: " + myCollection);

		File file2 = new File("CollectionSerialize.txt");
		Methods.serialize(file2, (Serializable) myCollection);
		System.out.println("After serialization: " + Methods.deserealize(file2));
	}
}
