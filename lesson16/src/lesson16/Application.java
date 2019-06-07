package lesson16;

public class Application {
	public static synchronized void main(String[] args) throws InterruptedException {
		Integer[] myArray = { -18, 35, 12, 92, 82, 11, -4, 16, -194, 35, 36, 108, 11, -17, -22, 10, 2876, -4651 };
		Collection myCollection = new Collection(myArray);
		Iterator myIterator;

		System.out.println("Before iteration:\n" + myCollection + "\n");

		// Iteration 1
		myIterator = myCollection.getOddNumbersSetting();
		System.out.print("[ ");
		while (myIterator.nasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.print("]\n[");

		// Iteration 2
		myIterator = myCollection.getBackThroughOneNumbers();
		while (myIterator.nasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.print("]\n[ ");

		// Iteration 3
		myIterator = myCollection.threeStepOddNumbers();
		while (myIterator.nasNext()) {
			Object tempValue = myIterator.next();
			if (tempValue != null) {
				System.out.print(tempValue + " ");
			}
		}
		System.out.print("]\n[ ");

		// Iteration 4
		myIterator = myCollection.fiveStepPairedNumbersSetting();
		while (myIterator.nasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.print("]\n[ ");

		// Iteration 5
		myIterator = Collection.gettwoStepNumbersChangingParity();
		while (myIterator.nasNext()) {
			System.out.print(myIterator.next() + " ");
		}
		System.out.print("]");
	}
}
