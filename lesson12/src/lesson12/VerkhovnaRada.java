package lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {
	private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
	private static ArrayList<Faction> factionArray = new ArrayList<>();

	private VerkhovnaRada() {
	}

	public static VerkhovnaRada getVerkhovnaRada() {
		return verkhovnaRada;
	}

	public static ArrayList<Faction> getFactionArray() {
		return factionArray;
	}

	public void addFaction() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();
		getFactionArray().add(new Faction(inputFactionName));
	}

	public void deleteFaction() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				factionIterator.remove();
			}
		}
	}

	public void showAllFaction() {
		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			System.out.println(factionIterator.next());
		}
	}

	public void showFactionByName() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				System.out.println(tempFaction);
			}
		}
	}

	public void addDeputyToFaction() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.addDeputy();
			}
		}
	}

	public void deleteDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.deleteDeputy();
			}
		}
	}

	public void showAllGraftersFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.showGrafters();
			}
		}
	}

	public void findTheBestGrafterFromRaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.findTheBestGrafter();
			}
		}
	}

	public void showAllDeputysFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.showAllDeputys();
			}
		}
	}
}
