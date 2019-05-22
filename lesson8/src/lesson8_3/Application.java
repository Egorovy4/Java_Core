/*
 * LOGOS IT ACADEMY
 * Lesson 9. Exceptions, Java code convention 
 */

package lesson8_3;

import java.util.Scanner;

/**
 * @author Іванишин Ігор
 * @see java.lang.Throwable
 * @since Java 1.8
 * @version 1.0
 */
public class Application {
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Months[] months = Months.values();
		Seasons[] seasons = Seasons.values();
		Scanner sc = new Scanner(System.in);
		boolean showMenu = true;

		/* Infinity displaying of menu */
		while (showMenu) {
			new Application().menu();
			int menuItem = 0;

			try {
				menuItem = sc.nextInt();
				if (menuItem < 0 || menuItem > 10) {
					throw new WrongInputConsoleParametersException("Entering failed: number must to be [0-10]");
				}
			} catch (Exception e) {
				throw new WrongInputConsoleParametersException("Incorrect entering !");
			}

			switch (menuItem) {
			case 1:
				System.out.println("Enter name of month !");
				String enteredMonth = sc.next().toUpperCase();

				if (new Application().isNumber(enteredMonth)) {
					throw new WrongInputConsoleParametersException("You entered number !");
				}

				isMonthExist(months, enteredMonth);
				break;

			case 2:
				System.out.println("Enter name of season !");
				String enteredSeason = sc.next().toUpperCase();

				if (new Application().isNumber(enteredSeason)) {
					throw new WrongInputConsoleParametersException("You entered number !");
				}

				if (isSeasonExist(seasons, enteredSeason)) {
					for (Months temp : months) {
						if (temp.getSeasons().name().equals(enteredSeason)) {
							System.out.println(temp.name());
						}
					}
					break;
				} else {
					break;
				}

			case 3:
				System.out.println("Enter quantity of the day in month !");
				int enteredQuantityOfDays = 0;

				try {
					enteredQuantityOfDays = sc.nextInt();
				} catch (Exception e) {
					throw new WrongInputConsoleParametersException("You entered not number !");
				}

				boolean isEnteredQuantityTrue = false;
				for (Months temp : months) {
					if (temp.getDays() == enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month with " + enteredQuantityOfDays + " days this year !");
				}
				break;

			case 4:
				System.out.println("Enter quantity of the day !");

				try {
					enteredQuantityOfDays = sc.nextInt();
				} catch (Exception e) {
					throw new WrongInputConsoleParametersException("You entered not number !");
				}

				isEnteredQuantityTrue = false;
				for (Months temp : months) {
					if (temp.getDays() < enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month where quantity of days < " + enteredQuantityOfDays + " !");
				}
				break;

			case 5:
				System.out.println("Enter quantity of the day !");

				try {
					enteredQuantityOfDays = sc.nextInt();
				} catch (Exception e) {
					throw new WrongInputConsoleParametersException("You entered not number !");
				}

				isEnteredQuantityTrue = false;
				for (Months temp : months) {
					if (temp.getDays() > enteredQuantityOfDays) {
						System.out.println(temp.name());
						isEnteredQuantityTrue = true;
					}
				}
				if (!isEnteredQuantityTrue) {
					System.out.println("We have no month where quantity of days > " + enteredQuantityOfDays + " !");
				}
				break;

			case 6:
				System.out.println("Enter name of season !");

				enteredSeason = sc.next().toUpperCase();

				if (new Application().isNumber(enteredSeason)) {
					throw new WrongInputConsoleParametersException("You entered number !");
				}

				if (isSeasonExist(seasons, enteredSeason)) {
					Seasons s = Seasons.valueOf(enteredSeason);
					int ordinal = s.ordinal();

					if (ordinal == seasons.length - 1) {
						ordinal = 0;
						System.out.println(seasons[ordinal]);
					} else {
						System.out.println(seasons[ordinal + 1]);
					}
					break;
				} else {
					break;
				}

			case 7:
				System.out.println("Enter name of season !");
				enteredSeason = sc.next().toUpperCase();

				if (new Application().isNumber(enteredSeason)) {
					throw new WrongInputConsoleParametersException("You entered number !");
				}

				if (isSeasonExist(seasons, enteredSeason)) {
					Seasons tempSeason = Seasons.valueOf(enteredSeason);
					int ordinal = tempSeason.ordinal();

					if (ordinal == 0) {
						ordinal = seasons.length - 1;
						System.out.println(seasons[ordinal]);
					} else {
						System.out.println(seasons[ordinal - 1]);
					}
					break;
				} else {
					break;
				}

			case 8:
				for (Months temp : months) {
					if (temp.getDays() % 2 == 0) {
						System.out.println(temp.name());
					}
				}
				break;

			case 9:
				for (Months temp : months) {
					if (temp.getDays() % 2 > 0) {
						System.out.println(temp.name());
					}
				}
				break;

			case 10:
				System.out.println("Enter name of month !");
				enteredMonth = sc.next().toUpperCase();

				if (new Application().isNumber(enteredMonth)) {
					throw new WrongInputConsoleParametersException("You entered number !");
				}

				Months tempMonth = Months.valueOf(enteredMonth);
				if (tempMonth.getDays() % 2 == 0) {
					System.out.println(enteredMonth + " has pair quantity of days !");
				} else {
					System.out.println(enteredMonth + " has odd quantity of days !");
				}
				break;

			case 0:
				showMenu = false;
				System.out.println("Thank for using, goodbye !");
				break;
			}
		}
	}

	/**
	 * Method show structure of application menu.
	 * 
	 * @author Іванишин Ігор
	 * @param null
	 * @return null
	 * @since Java 1.8
	 */
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
		System.out.println("Enter 10: Does entered month has has a pair quantity of days ?");
		System.out.println("Enter 0: Exit\n");
	}

	/**
	 * Method return true if object String enteredMonth is exist in array
	 * Months[] months, and return false if object String enteredMonth is not
	 * exist in array Months[] months.
	 * 
	 * @author Іванишин Ігор
	 * @param months
	 * @param enteredMonth
	 * @return boolean isExist
	 * @since Java 1.8
	 */
	private static boolean isMonthExist(Months[] months, String enteredMonth) {
		boolean isExist = false;
		for (Months temp : months) {
			if (temp.name().equals(enteredMonth)) {
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

	/**
	 * Method return true if object String enteredSeason is exist in array
	 * Seasons[] seasons, and return false if object String enteredSeason is not
	 * exist in array Seasons[] seasons.
	 * 
	 * @author Іванишин Ігор
	 * @param seasons
	 * @param enteredSeason
	 * @return boolean isExist
	 * @since Java 1.8
	 */
	private static boolean isSeasonExist(Seasons[] seasons, String enteredSeason) {
		boolean isExist = false;
		for (Seasons temp : seasons) {
			if (temp.name().equals(enteredSeason)) {
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

	/**
	 * Method return true if String str consist of numbers, and return false if
	 * String str consist of different symbols.
	 * 
	 * @author Іванишин Ігор
	 * @param str
	 * @return boolean value;
	 * @since Java 1.8
	 */
	private boolean isNumber(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
