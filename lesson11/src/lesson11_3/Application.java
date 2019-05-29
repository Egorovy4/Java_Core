package lesson11_3;

public class Application {
	public static void main(String[] args) {
		MyArrayList array = new MyArrayList();
		
		System.out.println(array);
		
		MyArrayList.add("hello");
		
		System.out.println(array);
		
		MyArrayList.add(1);
		MyArrayList.add(2);
		MyArrayList.add(3);
		MyArrayList.add(4);
		
		System.out.println(array);
		
		MyArrayList.add(5);
		MyArrayList.add(6);
		MyArrayList.add(7);
		MyArrayList.add(8);
		MyArrayList.add(9);
		MyArrayList.add(10);
		
		System.out.println(array);
		
		MyArrayList.remove(1);
		
		System.out.println(array);
		
		MyArrayList.add("hello");
		MyArrayList.add("hello");
		
		MyArrayList.remove(1);

		System.out.println(array);
	}
}
