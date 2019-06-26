package lesson23;

import java.util.Optional;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		boolean key = true;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		Cinema cinema = new Cinema(new Time(9, 0), new Time(21, 0));

		String choise;

		while (key) {
			menu();
			choise = scanner.nextLine();

			switch (choise) {
			case "1":
				System.out.println("Enter name of movie !");
				String tempNameOfMovie = scanner.nextLine();
				System.out.println("Enter duration !");
				System.out.println("hour...");
				int tempHourDuration = Integer.parseInt(scanner.nextLine());
				System.out.println("minute...");
				int tempMinuteDuration = Integer.parseInt(scanner.nextLine());
				cinema.addMovie(new Movie(tempNameOfMovie, new Time(tempHourDuration, tempMinuteDuration)));
				break;

			case "2":
				System.out.println("Enter name of movie !");
				tempNameOfMovie = scanner.nextLine();
				Optional<Movie> findFirst = cinema.getMoviesLibrary().stream()
						.filter(x -> x.getTitle().equals(tempNameOfMovie)).findFirst();
				if (findFirst.isPresent()) {
					cinema.removeMovie(findFirst.get());
				} else {
					System.out.println("Library of movies hasn't \"" + tempNameOfMovie + "\"");
				}
				break;

			case "3":
				// System.out.println("Enter name of movie !");
				// tempNameOfMovie = scanner.nextLine();
				// Movie movie = null;
				// for (Movie seanceTempMovie : cinema.getMoviesLibrary()) {
				// if (seanceTempMovie.getTitle().equals(tempNameOfMovie)) {
				// movie = seanceTempMovie;
				// }
				// }
				//
				// if (movie == null) {
				// System.out.println("We haven't film \"" + tempNameOfMovie +
				// "\" in our library of films !");
				// } else {
				// System.out.println("Enter time when movie is starting !");
				// System.out.println("hour...");
				// int tempHourMovieStart =
				// Integer.parseInt(scanner.nextLine());
				// System.out.println("minute...");
				// int tempMinuteMovieStart =
				// Integer.parseInt(scanner.nextLine());
				// System.out.println("Enter day of week !");
				// String dayOfWeek = scanner.nextLine();
				//
				// cinema.addSeance(new Seance(movie, new
				// Time(tempHourMovieStart, tempMinuteMovieStart)),
				// dayOfWeek.toUpperCase());
				// }
				// break;

				System.out.println("Enter name of movie !");
				tempNameOfMovie = scanner.nextLine();

				Optional<Movie> movie = cinema.getMoviesLibrary().stream()
						.filter(x -> x.getTitle().equals(tempNameOfMovie)).findFirst();

				if (movie.isPresent()) {
					System.out.println("Enter time when movie is starting !");
					System.out.println("hour...");
					int tempHourMovieStart = Integer.parseInt(scanner.nextLine());
					System.out.println("minute...");
					int tempMinuteMovieStart = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter day of week !");
					String dayOfWeek = scanner.nextLine();

					cinema.addSeance(new Seance(movie.get(), new Time(tempHourMovieStart, tempMinuteMovieStart)),
							dayOfWeek.toUpperCase());
				} else {
					System.out.println("We haven't film \"" + tempNameOfMovie + "\" in our library of films !");
				}

				break;

			case "4":
				// System.out.println("Enter name of movie !");
				// tempNameOfMovie = scanner.nextLine();
				// System.out.println("Enter day of week !");
				// String dayOfWeek = scanner.nextLine().toUpperCase();
				//
				// Map<Days, Schedule> tempSchedulesResult = new TreeMap<Days,
				// Schedule>();
				//
				// Iterator<Entry<Days, Schedule>> iterator =
				// cinema.getSchedules().entrySet().iterator();
				// while (iterator.hasNext()) {
				// Entry<Days, Schedule> next = iterator.next();
				// if (next.getKey().toString().equals(dayOfWeek)) {
				// Iterator<Seance> iterator2 =
				// next.getValue().getSeances().iterator();
				// while (iterator2.hasNext()) {
				// Seance next2 = iterator2.next();
				// if (next2.getMovie().getTitle().equals(tempNameOfMovie)) {
				// tempSchedulesResult.put(next.getKey(), next.getValue());
				// }
				// }
				// }
				// }
				//
				// Iterator<Entry<Days, Schedule>> iterator2 =
				// tempSchedulesResult.entrySet().iterator();
				// while (iterator2.hasNext()) {
				// Iterator<Seance> iterator3 =
				// iterator2.next().getValue().getSeances().iterator();
				// while (iterator3.hasNext()) {
				// Seance next = iterator3.next();
				// cinema.removeSeance(next, dayOfWeek);
				// }
				// }
				// break;

				System.out.println("Enter name of movie !");
				tempNameOfMovie = scanner.nextLine();
				System.out.println("Enter day of week !");
				String dayOfWeek = scanner.nextLine().toUpperCase();

				cinema.getSchedules().entrySet().stream().forEach(x -> {
					if (x.getKey().toString().equals(dayOfWeek)) {
						x.getValue().getSeances().stream().forEach(y -> {
							if (y.getMovie().getTitle().equals(tempNameOfMovie)) {
								cinema.removeSeance(y, dayOfWeek);
							}
						});
					}
				});
				break;

			case "5":
				System.out.println(cinema.getMoviesLibrary());
				break;

			case "6":
				if (cinema.getSchedules().isEmpty()) {
					System.out.println("Cinema hasn't had schedules yet !");
				} else {
					System.out.println(cinema);
				}
				break;

			case "7":
				System.out.println("Thank's for using !");
				System.exit(0);
				break;

			default:
				break;
			}
			;
		}
	}

	public static void menu() {
		System.out.println("Enter 1: to add new movie !");
		System.out.println("Enter 2: to remove movie !");
		System.out.println("Enter 3: to add new seance !");
		System.out.println("Enter 4: to remove seance !");
		System.out.println("Enter 5: to show movies library !");
		System.out.println("Enter 6: to show all information about seances !");
		System.out.println("Enter 7: to exit !");
	}
}
