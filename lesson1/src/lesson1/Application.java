package lesson1;

public class Application {
	public static void main(String[] args) {
		
		// Part 1
//		boolean a1 = true;
//		char a2 = 'G';
//		byte a3 = 7;
//		short a4 = 14;
//		int a5 = 21;
//		long a6 = 28;
//		float a7 = (float)28.7;
//		double a8 = 28.77;

		// Part 2
		System.out.println("ALL BOOLEAN VALUES: " + Boolean.FALSE + ", " + Boolean.TRUE);
		
		System.out.println("CHAR MIN VALUE = " + "\"" + Character.MIN_VALUE + "\"");
		System.out.println("CHAR MAX VALUE = " + "\"" + Character.MAX_VALUE + "\"");
		
		System.out.println("BYTE MIN VALUE = " + "\"" + Byte.MIN_VALUE + "\"");
		System.out.println("BYTE MAX VALUE = " + "\"" + Byte.MAX_VALUE + "\"");
		
		System.out.println("SHORT MIN VALUE = " + "\"" + Short.MIN_VALUE + "\"");
		System.out.println("SHORT MAX VALUE = " + "\"" + Short.MAX_VALUE + "\"");
		
		System.out.println("INT MIN VALUE = " + "\"" + Integer.MIN_VALUE + "\"");
		System.out.println("INT MAX VALUE = " + "\"" + Integer.MAX_VALUE + "\"");
		
		System.out.println("LONG MIN VALUE = " + "\"" + Long.MIN_VALUE + "\"");
		System.out.println("LONG MAX VALUE = " + "\"" + Long.MAX_VALUE + "\"");
		
		System.out.println("FLOAT MIN VALUE = " + "\"" + Float.MIN_VALUE + "\"");
		System.out.println("FLOAT MAX VALUE = " + "\"" + Float.MAX_VALUE + "\"");
		
		System.out.println("DOUBLE MIN VALUE = " + "\"" + Double.MIN_VALUE + "\"");
		System.out.println("DOUBLE MAX VALUE = " + "\"" + Double.MAX_VALUE + "\"" + "\n");
		
		// Part 3
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		int minValue = array[0];
		int maxValue = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(minValue > array[i]) minValue = array[i];
			if(maxValue < array[i]) maxValue = array[i];
		}
		
		System.out.print("array[] = { ");
		for(int temp : array) {System.out.print(temp + " ");}
		System.out.println("}\n" + "minValue = " + minValue + "\n" + "maxValue = " + maxValue);
	}
}
