package lesson22_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ArrayList<Commodity> commodityList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (;;) {
			new Application().menu();
			int enteredValue = scanner.nextInt();

			switch (enteredValue) {
			case 1:
				System.out.println("Enter name of commoduty !");
				String enteredName = scanner.next();
				System.out.println("Enter length of commodity !");
				int enteredLength = scanner.nextInt();
				System.out.println("Enter width of commodity !");
				int enteredWidth = scanner.nextInt();
				System.out.println("Enter weight of commodity !");
				int enteredWeight = scanner.nextInt();

				System.out.println("Before adding: " + commodityList);

				Commodity.addCommodity(commodityList, enteredName, enteredLength, enteredWidth, enteredWeight);

				System.out.println("After adding: " + commodityList);
				break;

			case 2:
				System.out.println("Enter name of commoduty !");
				enteredName = scanner.next();

				System.out.println("Before deleting: " + commodityList);

				Commodity.deleteCommodity(commodityList, enteredName);

				System.out.println("After deleting: " + commodityList);
				break;

			case 3:
				System.out.println("Enter name of commoduty which you want to replace !");
				String oldName = scanner.next();
				System.out.println("Enter new name of commoduty !");
				enteredName = scanner.next();
				System.out.println("Enter length of commodity !");
				enteredLength = scanner.nextInt();
				System.out.println("Enter width of commodity !");
				enteredWidth = scanner.nextInt();
				System.out.println("Enter weight of commodity !");
				enteredWeight = scanner.nextInt();

				System.out.println("Before replacing: " + commodityList);

				Commodity.replaceCommodity(commodityList, oldName, enteredName, enteredLength, enteredWidth,
						enteredWeight);

				System.out.println("After replacing: " + commodityList);
				break;

			case 4:
				System.out.println("Before sorting: " + commodityList);
				System.out.println("After sorting: ");
				Commodity.sortByName(commodityList);
				break;

			case 5:
				System.out.println("Before sorting: " + commodityList);
				System.out.println("After sorting: ");
				Commodity.sortByLength(commodityList);
				break;

			case 6:
				System.out.println("Before sorting: " + commodityList);
				System.out.println("After sorting: ");
				Commodity.sortByWidth(commodityList);
				break;

			case 7:
				System.out.println("Before sorting: " + commodityList);
				System.out.println("After sorting: " + commodityList);
				Commodity.sortByWeight(commodityList);
				break;

			case 8:
				System.out.println("Enter name of commoduty !");
				enteredName = scanner.next();

				Commodity.showEnteredCommodity(commodityList, enteredName);
				break;
			case 9:
				Commodity.exit();
				break;
			default:
				break;
			}
		}
	}

	public void menu() {
		System.out.println("Enter 1: add commodity !");
		System.out.println("Enter 2: delete commodity !");
		System.out.println("Enter 3: replace commodity !");
		System.out.println("Enter 4: for sorting commodity by name !");
		System.out.println("Enter 5: for sorting commodity by length !");
		System.out.println("Enter 6: for sorting commodity by width !");
		System.out.println("Enter 7: for sorting commodity by weight !");
		System.out.println("Enter 8: show entered commodity !");
		System.out.println("Enter 9: exit !");
	}
}
