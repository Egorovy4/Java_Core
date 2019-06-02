package lesson13_2;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getLength() > o2.getLength() ? 1 : -1;
	}
}
