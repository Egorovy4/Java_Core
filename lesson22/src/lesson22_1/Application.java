package lesson22_1;

import java.util.Optional;
import java.util.Scanner;

public class Application {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean key = true;

		while (key) {
			new Application().menu();

			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				VerkhovnaRada.getVerkhovnaRada().addFaction();
				break;

			case 2:
				VerkhovnaRada.getVerkhovnaRada().deleteFaction();
				break;

			case 3:
				VerkhovnaRada.getVerkhovnaRada().showAllFaction();
				break;

			case 4:
				System.out.println("Enter name of faction !");
				String inputFactionName = scanner.next();

				Optional<Faction> findAny = VerkhovnaRada.getFactionCollection().stream()
						.filter(p -> p.getFactionName().equals(inputFactionName)).findAny();

				if (findAny.isPresent()) {
					findAny.get().cleanFaction();
				} else {
					System.out.println("Entered value is non-existed !");
				}
				break;

			case 5:
				VerkhovnaRada.getVerkhovnaRada().showFactionByName();
				break;

			case 6:
				VerkhovnaRada.getVerkhovnaRada().addDeputyToFaction();
				break;

			case 7:
				VerkhovnaRada.getVerkhovnaRada().deleteDeputyFromFaction();
				break;

			case 8:
				VerkhovnaRada.getFactionCollection().stream().forEach(x -> x.showGrafters());
				break;

			case 9:
				VerkhovnaRada.findTheBestGrafterFromFaction();
				break;

			case 10:
				key = false;
				System.out.println("Thank's for using !\nGoodbye !");
				break;
			}
		}
	}

	public void menu() {
		System.out.println("Enter 1: TO ADD NEW FACTION !");
		System.out.println("Enter 2: TO DELETE SELECTED FACTION !");
		System.out.println("Enter 3: TO SHOW ALL FACTIONS !");
		System.out.println("Enter 4: TO CLEAR SELECTED FACTION !");
		System.out.println("Enter 5: TO SHOW SELECTED FACTION !");
		System.out.println("Enter 6: TO ADD DEPUTY TO FACTION !");
		System.out.println("Enter 7: TO DELETE DEPUTY FROM FACTION !");
		System.out.println("Enter 8: TO SHOW ALL GRAFTERS !");
		System.out.println("Enter 9: TO SHOW THE BEST GRAFTER !");
		System.out.println("Enter 10: TO EXIT !");
	}
}
