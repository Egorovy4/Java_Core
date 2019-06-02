package lesson13_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Commodity {
	private String name;
	private int length;
	private int width;
	private int weight;

	public Commodity(String name, int length, int width, int weight) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	public static void addCommodity(ArrayList<Commodity> commodityList, String name, int length, int width, int weight) {
		commodityList.add(new Commodity(name, length, width, weight));
	}

	public static void deleteCommodity(ArrayList<Commodity> commodityList, String name) {
		Iterator<Commodity> iterator = commodityList.iterator();
		while (iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if (tempCommodity.getName().equals(name)) {
				iterator.remove();
			}
		}
	}

	public static void replaceCommodity(ArrayList<Commodity> commodityList, String oldName, String name, int length, int width,
			int weight) {
		ListIterator<Commodity> iterator = commodityList.listIterator();
		while (iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if (tempCommodity.getName().equals(oldName)) {
				iterator.set(new Commodity(name, length, width, weight));
			}
		}
	}

	public static void sortByName(ArrayList<Commodity> commodityList) {
		commodityList.sort(new CommodityNameComparator());
	}

	public static void sortByLength(ArrayList<Commodity> commodityList) {
		commodityList.sort(new CommodityLengthComparator());
	}

	public static void sortByWidth(ArrayList<Commodity> commodityList) {
		commodityList.sort(new CommodityWidthComparator());
	}

	public static void sortByWeight(ArrayList<Commodity> commodityList) {
		commodityList.sort(new CommodityWeightComparator());
	}

	public static void showEnteredCommodity(ArrayList<Commodity> commodityList, String enteredName) {
		Iterator<Commodity> iterator = commodityList.iterator();
		while (iterator.hasNext()) {
			Commodity tempCommodity = iterator.next();
			if (tempCommodity.getName().equals(enteredName)) {
				System.out.println(tempCommodity);
			}
		}
	}
	
	public static void exit() {
		System.exit(0);
	}
}