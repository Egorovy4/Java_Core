package lesson11_3;

public class MyArrayList {
	private static Object[] object;

	public MyArrayList() {
		super();
		object = new Object[10];
	}

	public static Object[] getObject() {
		return object;
	}

	public static void setObject(Object[] o) {
		object = o;
	}

	@Override
	public String toString() {
		String temp = "[";
		for(int i = 0; i < object.length; i++) {
			if(i == object.length - 1) {
				temp += object[i] + "]";
			} else {
				temp += object[i];
				if(object[i + 1] == null) {
					temp += "]";
					break;
				}
				temp += ", ";
			}
		}
		return temp;
	}

	public static void add(Object o) {
		if(object[object.length - 1] != null) {
			Object[] temp = new Object[object.length + 1];
			for (int i = 0; i < temp.length; i++) {
				if(i != temp.length - 1) {
					temp[i] = object[i];
				} else {
					temp[i] = o;
				}
			}
			setObject(temp);
		} else {
			for (int i = 0; i < object.length; i++) {
				if(object[i] == null) {
					object[i] = o;
					break;
				}
			}
		}
	}
	
	public static void remove(int index) {
		Object[] temp = new Object[object.length - 1];
		for (int i = 0; i < temp.length; i++) {
			if(i < index) {
				temp[i] = object[i];
			} else {
				temp[i] = object[i + 1];
			}
		}
		setObject(temp);
	}
}
