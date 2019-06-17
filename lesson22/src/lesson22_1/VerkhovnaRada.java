package lesson22_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VerkhovnaRada {
	private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
	private static Collection<Faction> factionCollection = new ArrayList<>();

	private VerkhovnaRada() {
	}

	public static VerkhovnaRada getVerkhovnaRada() {
		return verkhovnaRada;
	}

	public static Collection<Faction> getFactionCollection() {
		return factionCollection;
	}

	public static void setFactionCollection(Collection<Faction> factionCollection) {
		VerkhovnaRada.factionCollection = factionCollection;
	}

	@SuppressWarnings("resource")
	Supplier<Faction> factionFactory = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = sc.next();
		return new Faction(inputFactionName);
	};

	public void addFaction() {
		getFactionCollection().add(factionFactory.get());
	}

	@SuppressWarnings("resource")
	public void deleteFaction() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		List<Faction> collect = getFactionCollection().stream()
				.filter(p -> p.getFactionName().equals(inputFactionName) == false).collect(Collectors.toList());
		setFactionCollection(collect);
	}

	public void showAllFaction() {
		for (int i = 0; i < getFactionCollection().size(); i++) {
			System.out.println(getFactionCollection().stream().skip(i).findFirst().get());
		}
	}

	@SuppressWarnings("resource")
	public void showFactionByName() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		System.out.println(
				getFactionCollection().stream().filter(p -> p.getFactionName().equals(inputFactionName)).findAny());
	}

	@SuppressWarnings("resource")
	public void addDeputyToFaction() {
		System.out.println("Enter name of faction !");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Optional<Faction> findAny = getFactionCollection().stream()
				.filter(p -> p.getFactionName().equals(inputFactionName)).findAny();

		if (findAny.isPresent()) {
			findAny.get().addDeputy();
		} else {
			System.out.println("Entered value is non-existed !");
		}
	}

	@SuppressWarnings("resource")
	public void deleteDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Optional<Faction> findAny = getFactionCollection().stream()
				.filter(p -> p.getFactionName().equals(inputFactionName)).findAny();

		if (findAny.isPresent()) {
			findAny.get().deleteDeputy();
		} else {
			System.out.println("Entered value is non-existed !");
		}
	}

	@SuppressWarnings("resource")
	public static void findTheBestGrafterFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Optional<Faction> findAny = getFactionCollection().stream()
				.filter(x -> x.getFactionName().equals(inputFactionName)).findAny();

		if (findAny.isPresent()) {
			Faction faction = findAny.get();
			faction.findTheBestGrafter();
		} else {
			System.out.println("Entered value is non-existed !");
		}
	}

	@SuppressWarnings("resource")
	public void showAllGraftersFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionCollection().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.showGrafters();
			}
		}
	}

	@SuppressWarnings("resource")
	public void showAllDeputysFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction !");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionCollection().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getFactionName().equals(inputFactionName)) {
				tempFaction.showAllDeputys();
			}
		}
	}
}