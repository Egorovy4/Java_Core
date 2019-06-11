package lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	public static void serialize(File file, Serializable object) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}

	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream os = new FileInputStream(file);
		ObjectInputStream oos = new ObjectInputStream(os);
		Serializable readObject = (Serializable) oos.readObject();
		oos.close();
		os.close();
		return readObject;
	}
}
