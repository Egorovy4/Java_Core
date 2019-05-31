package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Application {
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

				ListIterator<Faction> factionIterator = VerkhovnaRada.getFactionArray().listIterator();

				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					if (tempFaction.getFactionName().equals(inputFactionName)) {
						tempFaction.cleanFaction();
					}
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
				factionIterator = VerkhovnaRada.getFactionArray().listIterator();
				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					tempFaction.showGrafters();
				}
				break;

			case 9:
				ArrayList<Deputy> theBestGrafters = new ArrayList<>();

				factionIterator = VerkhovnaRada.getFactionArray().listIterator();
				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					theBestGrafters.add(tempFaction.findTheBestGrafter());
				}

				System.out.println(Collections.max(theBestGrafters, new DeputySizeOfBribeComparator()));
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
