package lesson11_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		List<Months> month = Arrays.asList(Months.values());
		List<Seasons> season = Arrays.asList(Seasons.values());

		Scanner sc = new Scanner(System.in);
		boolean showMenu = true;

		while (showMenu) {
			new Application().menu();
			String menuItem = sc.next();

			switch (menuItem) {
			case "1":
				System.out.println("Enter name of month !");
				String enteredMonth = sc.next().toUpperCase();
				isMonthExist(month, enteredMonth);
				break;

			case "2":
				System.out.println("Enter name of season !");
				String enteredSeason = sc.next().toUpperCase();
				if (isSeasonExist(season, enteredSeason)) {
					for (Months temp : month) {
						if (temp.getSeasons().name().equals(enteredSeason)) {
							System.out.println(temp.name());
						}
					}
					break;
				} else {
					break;
				}

			case "3":
				System.out.println("Enter quantity of the day in month !");
				int enteredQuantityOfDays = sc.nextInt();
				boolean isEnteredQuantityTrue = false;
				for (Months temp : month) {
					if (temp.getDays() == enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month with " + enteredQuantityOfDays + " days this year !");
				}
				break;

			case "4":
				System.out.println("Enter quantity of the day !");
				enteredQuantityOfDays = sc.nextInt();
				isEnteredQuantityTrue = false;
				for (Months temp : month) {
					if (temp.getDays() < enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month where quantity of days < " + enteredQuantityOfDays + " !");
				}
				break;

			case "5":
				System.out.println("Enter quantity of the day !");
				enteredQuantityOfDays = sc.nextInt();
				isEnteredQuantityTrue = false;
				for (Months temp : month) {
					if (temp.getDays() > enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month where quantity of days > " + enteredQuantityOfDays + " !");
				}
				break;

			case "6":
				System.out.println("Enter name of season !");
				enteredSeason = sc.next().toUpperCase();
				if (isSeasonExist(season, enteredSeason)) {
					Seasons s = Seasons.valueOf(enteredSeason);
					int ordinal = s.ordinal();

					if (ordinal == season.size() - 1) {
						ordinal = 0;
						System.out.println(season.get(ordinal));
					} else {
						System.out.println(season.get(ordinal + 1));
					}
					break;
				} else {
					break;
				}

			case "7":
				System.out.println("Enter name of season !");
				enteredSeason = sc.next().toUpperCase();
				if (isSeasonExist(season, enteredSeason)) {
					Seasons tempSeason = Seasons.valueOf(enteredSeason);
					int ordinal = tempSeason.ordinal();

					if (ordinal == 0) {
						ordinal = season.size() - 1;
						System.out.println(season.get(ordinal));
					} else {
						System.out.println(season.get(ordinal - 1));
					}
					break;
				} else {
					break;
				}

			case "8":
				for (Months temp : month) {
					if (temp.getDays() % 2 == 0) {
						System.out.println(temp.name());
					}
				}
				break;

			case "9":
				for (Months temp : month) {
					if (temp.getDays() % 2 > 0) {
						System.out.println(temp.name());
					}
				}
				break;

			case "10":
				System.out.println("Enter name of month !");
				enteredMonth = sc.next().toUpperCase();
				if (isMonthExist(month, enteredMonth)) {
					Months tempMonth = Months.valueOf(enteredMonth);
					if (tempMonth.getDays() % 2 == 0) {
						System.out.println(enteredMonth + " has pair quantity of days !");
					} else {
						System.out.println(enteredMonth + " has odd quantity of days !");
					}
				}
				break;

			case "0":
				sc.close();
				showMenu = false;
				System.out.println("Thank for using, goodbye !");
				break;
			}
		}
	}

	void menu() {
		System.out.println("Enter 1: Does some month exist ?");
		System.out.println("Enter 2: Show all months with the same season");
		System.out.println("Enter 3: Show all months with the same number of days");
		System.out.println("Enter 4: Show all months with quantity of days smoller than... ");
		System.out.println("Enter 5: Show all months with quantity of days bigger than... ");
		System.out.println("Enter 6: Show the next season");
		System.out.println("Enter 7: Show the previous season");
		System.out.println("Enter 8: Show all months that have a pair quantity of days");
		System.out.println("Enter 9: Show all months that have an odd quantity of days");
		System.out.println("Enter 10: Does entered month has a pair quantity of days ?");
		System.out.println("Enter 0: Exit\n");
	}

	private static boolean isMonthExist(List<Months> month, String enteredMonth) {
		boolean isExist = false;
		for (int i = 0; i < month.size(); i++) {
			if (month.get(i).toString().equals(enteredMonth) == true) {
				System.out.println("Month " + enteredMonth + " is exist !");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("Month " + enteredMonth + " is not exist !");
		}
		return isExist;
	}

	private static boolean isSeasonExist(List<Seasons> season, String enteredSeason) {
		boolean isExist = false;
		for (int i = 0; i < season.size(); i++) {
			if (season.get(i).toString().equals(enteredSeason) == true) {
				System.out.println("Season " + enteredSeason + " is exist !");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("Season " + enteredSeason + " is not exist !");
		}
		return isExist;
	}
}
