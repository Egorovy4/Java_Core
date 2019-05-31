package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {
	private String factionName;
	private ArrayList<Deputy> deputyArray = new ArrayList<>();

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public ArrayList<Deputy> getDeputyArray() {
		return deputyArray;
	}

	public void setDeputyArray(ArrayList<Deputy> deputyArray) {
		this.deputyArray = deputyArray;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public void addDeputy() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter weight of deputy !");
		int inputWeight = scanner.nextInt();
		System.out.println("Enter growth of deputy !");
		int inputGrowth = scanner.nextInt();
		System.out.println("Enter first name of deputy !");
		String inputFirstName = scanner.next();
		System.out.println("Enter last name of deputy !");
		String inputLastName = scanner.next();
		System.out.println("Enter age of deputy !");
		int inputAge = scanner.nextInt();
		System.out.println("If the deputy is grafter enter: true !\nIf the deputy isn't grafter enter: false !");
		boolean inputIsGrafter = scanner.nextBoolean();

		Deputy deputy = new Deputy(inputWeight, inputGrowth, inputFirstName, inputLastName, inputAge, inputIsGrafter);

		if (inputIsGrafter) {
			deputy.giveBribe(deputy.isGrafter());
		}

		deputyArray.add(deputy);
	}

	public void deleteDeputy() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter last name of deputy which you want to except from faction !");
		String inputFirsName = scanner.next();

		ListIterator<Deputy> deputyIterator = deputyArray.listIterator();

		while (deputyIterator.hasNext()) {
			if (inputFirsName.equals(deputyIterator.next().getLastName())) {
				deputyIterator.remove();
			}
		}
	}

	public void showGrafters() {
		ListIterator<Deputy> deputyIterator = deputyArray.listIterator();

		while (deputyIterator.hasNext()) {
			Deputy tempDeputy = deputyIterator.next();
			if (tempDeputy.isGrafter()) {
				System.out.println(tempDeputy);
			}
		}
	}

	public Deputy findTheBestGrafter() {
		return Collections.max(deputyArray, new DeputySizeOfBribeComparator());
	}

	public void showAllDeputys() {
		ListIterator<Deputy> deputyIterator = deputyArray.listIterator();

		while (deputyIterator.hasNext()) {
			System.out.println(deputyIterator.next());
		}
	}

	public void cleanFaction() {
		deputyArray.clear();
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", deputyArray=" + deputyArray + "]";
	}
}
