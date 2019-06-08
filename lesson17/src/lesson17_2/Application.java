package lesson17_2;

public class Application {
	public static void main(String[] args) {
		MyMap<Integer, String> myMap = new MyMap<>();

		myMap.addObject(1, "Hello1");
		myMap.addObject(2, "Hello2");
		myMap.addObject(3, "Hello3");
		myMap.addObject(4, "Hello4");
		myMap.addObject(5, "Hello5");

		System.out.println(myMap.getEntryMap());

		myMap.deleteUsingKey(3);

		System.out.println(myMap.getEntryMap());

		myMap.deleteUsingValue("Hello5");

		System.out.println(myMap.getEntryMap());

		myMap.showSetOfKeys();

		myMap.showListOfValues();

		myMap.showMyMap();
	}
}
