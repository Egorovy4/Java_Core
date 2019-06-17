package lesson22_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Faction {
	private String factionName;
	private Collection<Deputy> deputyArray = new ArrayList<>();

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public Collection<Deputy> getDeputyArray() {
		return deputyArray;
	}

	public void setDeputyArray(Collection<Deputy> deputyArray) {
		this.deputyArray = deputyArray;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	@SuppressWarnings("resource")
	Supplier<Deputy> deputyFactory = () -> {
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

		return new Deputy(inputWeight, inputGrowth, inputFirstName, inputLastName, inputAge, inputIsGrafter);
	};

	public void addDeputy() {
		Deputy tempDeputy = deputyFactory.get();

		if (tempDeputy.isGrafter()) {
			tempDeputy.giveBribe(tempDeputy.isGrafter());
		}

		deputyArray.add(tempDeputy);
	}

	@SuppressWarnings("resource")
	public void deleteDeputy() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter last name of deputy which you want to except from faction !");
		String inputLastName = scanner.next();

		setDeputyArray(getDeputyArray().stream().filter(p -> p.getLastName().equals(inputLastName) == false)
				.collect(Collectors.toList()));
	}

	public void cleanFaction() {
		deputyArray.clear();
	}

	public void showGrafters() {
		getDeputyArray().stream().filter(p -> p.isGrafter()).forEach(e -> System.out.println(e));
	}

	public void findTheBestGrafter() {
		Optional<Deputy> findAny = getDeputyArray().stream().findAny();

		if (findAny.isPresent()) {
			Optional<Deputy> findAny2 = getDeputyArray().stream().filter(x -> x.isGrafter()).findAny();

			if (findAny2.isPresent()) {
				System.out.println(getDeputyArray().stream().max((a, b) -> a.getSizeOfBribe() - b.getSizeOfBribe())
						.filter(x -> x.isGrafter()).get());
			} else {
				System.out.println("This faction have no grafters !");
			}
		} else {
			System.out.println("This faction haven't had any deputy yet !");
		}
	}

	public void showAllDeputys() {
		Iterator<Deputy> deputyIterator = deputyArray.iterator();

		while (deputyIterator.hasNext()) {
			System.out.println(deputyIterator.next());
		}
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", deputyArray=" + deputyArray + "]";
	}
}
