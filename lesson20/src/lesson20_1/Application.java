package lesson20_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class Application {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		writeFields(file, Person.class);
	}

	public static void writeFields(File file, Class<?> customClass) throws IOException {
		OutputStream os = new FileOutputStream(file);

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				os.write((field.getName() + ": " + field.getAnnotation(MyAnnotation.class).myParameter() + "\n")
						.getBytes());
			}
		}

		os.close();
		System.out.println("Successful Writing !");
	}
}
