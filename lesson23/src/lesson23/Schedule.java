package lesson23;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Schedule {
	private Set<Seance> seances = new TreeSet<>();
	
	public Set<Seance> getSeances() {
		return seances;
	}

	public void addSeance(Seance seance) {
		seances.add(seance);
	}

	public void removeSeance(Seance seance) {
		seances = seances.stream().filter(x -> ! x.getMovie().getTitle().equals(seance.getMovie().getTitle())
				|| ! x.getStartTime().equals(seance.getStartTime())).collect(Collectors.toSet());
	}

	@Override
	public String toString() {
		return seances + "";
	}
}


