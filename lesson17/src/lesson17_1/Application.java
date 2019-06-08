package lesson17_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
	static List<Integer> myList = new ArrayList<>();

	public static void main(String[] args) {
		addToList(myList);
		System.out.println(myList);
	}

	public static <T> void addToList(List<T> list) {
		list.add((T) (Integer) 1);
		list.add((T) "Iwanyshyn");
	}  
}