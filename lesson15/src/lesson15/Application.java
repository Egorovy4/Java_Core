package lesson15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

		/* class info */
		Class<Animal> ac = Animal.class;

		System.out.println("Full name of current class: " + ac.getName());
		System.out.println("Simple name of current class: " + ac.getSimpleName());
		System.out.println("Modifier of current class: " + Modifier.toString(ac.getModifiers()));
		System.out.println("Package of current class: " + ac.getPackage());
		System.out.println("Superclass of current class: " + ac.getSuperclass());
		System.out.println("Interfaces of current class: " + Arrays.toString(ac.getInterfaces()));
		System.out.println("Constructors of current class: " + Arrays.toString(ac.getConstructors()));
		System.out.println("Fields of current class: " + Arrays.toString(ac.getDeclaredFields()));
		System.out.println("Methods of current class: " + Arrays.toString(ac.getMethods()) + "\n");

		/* setting of field */
		Constructor<Animal> constructor = ac.getConstructor(String.class, String.class, int.class);
		Animal newInstanceAnimal = constructor.newInstance("cat", "Leopold", 4);
		System.out.println("After creating of object \"newInstanceAnimal\": " + newInstanceAnimal);

		Field field = ac.getField("name");
		field.set(newInstanceAnimal, "Garfield");
		System.out.println(
				"After setting of field \"name\" of object \"newInstanceAnimal\": " + newInstanceAnimal + "\n");

		/* invoking private methods */
		Constructor<Animal> constructor2 = ac.getConstructor(String.class, String.class, int.class);
		Animal newInstanceAnimal2 = constructor2.newInstance("mouse", "Jerry", 2);

		System.out.println("Declared methods of current class: " + Arrays.toString(ac.getDeclaredMethods()));

		Method declaredMethod1 = newInstanceAnimal2.getClass().getDeclaredMethod("myMethod", String.class, int.class);
		Method declaredMethod2 = newInstanceAnimal2.getClass().getDeclaredMethod("myMethod", String.class);
		System.out.println("Private methods of current class: \n" + declaredMethod1 + "\n" + declaredMethod2);

		declaredMethod1.setAccessible(true);
		declaredMethod1.invoke(newInstanceAnimal2, "Hello ", 5);

		declaredMethod2.setAccessible(true);
		declaredMethod2.invoke(newInstanceAnimal2, "Hi ");
	}
}
