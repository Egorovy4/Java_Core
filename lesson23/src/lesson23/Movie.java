package lesson23;

public class Movie {
	private String title;
	private Time duration;

	public Movie(String title, Time duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public Time getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Movie: \"" + title + "\", duration: " + duration;
	}
}
