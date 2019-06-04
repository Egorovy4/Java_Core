package lesson14;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		ZooClub club = new ZooClub();

		for (;;) {
			new Application().menu();

			Scanner scanner = new Scanner(System.in);
			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				club.addMember();
				break;

			case 2:
				club.addAnimal();
				break;

			case 3:
				club.deleteAnimal();
				break;

			case 4:
				club.deleteMember();
				break;

			case 5:
				club.deleteSpecificAnimal();
				break;

			case 6:
				club.showZooClub();
				break;

			case 7:
				System.out.println("Thanks for using !\nGoodbye !");
				System.exit(1);
				break;
			}
		}
	}

	public void menu() {
		System.out.println("Enter 1: to add new member !");
		System.out.println("Enter 2: to add new animal !");
		System.out.println("Enter 3: to delete some animal !");
		System.out.println("Enter 4: to delete some member !");
		System.out.println("Enter 5: to delete specific animal in every members !");
		System.out.println("Enter 6: to show zooclub !");
		System.out.println("Enter 7: to exit !");
	}
}
