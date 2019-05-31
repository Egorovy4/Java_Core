package lesson12;

import java.util.Comparator;

public class DeputySizeOfBribeComparator implements Comparator<Deputy> {
	@Override
	public int compare(Deputy o1, Deputy o2) {
		return o1.getSizeOfBribe() > o2.getSizeOfBribe() ? 1 : -1;
	}
}
