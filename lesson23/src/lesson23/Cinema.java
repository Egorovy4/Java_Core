package lesson23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

public class Cinema {
	private Time openTime;
	private Time closeTime;
	private Map<Days, Schedule> schedules = new TreeMap<>();
	private ArrayList<Movie> moviesLibrary = new ArrayList<>();

	public Cinema(Time openTime, Time closeTime) {
		super();
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public Time getOpenTime() {
		return openTime;
	}

	public Time getCloseTime() {
		return closeTime;
	}

	public Map<Days, Schedule> getSchedules() {
		return schedules;
	}

	public ArrayList<Movie> getMoviesLibrary() {
		return moviesLibrary;
	}

	public void addMovie(Movie movie) {
		moviesLibrary.add(movie);
	}

	public void addSeance(Seance seance, String day) {
		if (openTime.getHour() * 60 + openTime.getMinute() <= seance.getStartTime().getHour() * 60
				+ seance.getStartTime().getMinute()
				&& closeTime.getHour() * 60 + closeTime.getMinute() >= seance.getEndTime().getHour() * 60
						+ seance.getEndTime().getMinute()
				&& seance.getStartTime().getHour() * 60
						+ seance.getStartTime().getMinute() < seance.getEndTime().getHour() * 60
								+ seance.getEndTime().getMinute()) {
			Optional<Entry<Days, Schedule>> findAny = schedules.entrySet().stream()
					.filter(x -> x.getKey().toString().equals(day)).findAny();
			if (!findAny.isPresent()) {
				schedules.put(Days.valueOf(day), new Schedule());
				schedules.entrySet().stream().filter(x -> x.getKey().toString().equals(day)).findAny().get().getValue()
						.addSeance(seance);
			} else {
				findAny.get().getValue().addSeance(seance);
			}
		} else {
			System.out.println("You can't add seance with " + seance + " because cinema works from " + openTime + " to " + closeTime);
		}
	}

	public void removeMovie(Movie movie) {
		schedules.entrySet().stream().forEach(x -> {
			x.getValue().getSeances().stream().forEach(y -> {
				if (y.getMovie().equals(movie)) {
					x.getValue().removeSeance(y);
				}
			});
		});
		if(!moviesLibrary.isEmpty()) {
			moviesLibrary.remove(movie);
		}
	}

	public void removeSeance(Seance seance, String day) {
		schedules.entrySet().stream().forEach(x -> {
			if (x.getKey().toString().equals(day)) {
				x.getValue().removeSeance(seance);
			}
		});
		;
	}

	public String showSchedules(Map<Days, Schedule> schedules) {
		String result = "";
		Iterator<Entry<Days, Schedule>> iterator = getSchedules().entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Days, Schedule> next = iterator.next();
			result += next.getKey().toString() + ": " + next.getValue().toString() + "\n";
		}
		return result.substring(0, result.length() - 1);
	}

	@Override
	public String toString() {
		return "Cinema:\nWorking hours: (" + openTime + " - " + closeTime + ")\nSchedules:\n"
				+ showSchedules(schedules);
	}
}
