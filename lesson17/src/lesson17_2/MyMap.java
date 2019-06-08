package lesson17_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap<K, V> {
	private Map<K, V> entryMap = new HashMap<>();

	public Map<K, V> getEntryMap() {
		return entryMap;
	}

	public void addObject(K k, V v) {
		MyEntry<K, V> myEntry = new MyEntry<>(k, v);
		entryMap.put(myEntry.getK(), myEntry.getV());
	}

	public void deleteUsingKey(K k) {
		Iterator<Entry<K, V>> iterator = entryMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getKey().equals(k)) {
				iterator.remove();
			}
		}
	}

	public void deleteUsingValue(V v) {
		Iterator<Entry<K, V>> iterator = entryMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getValue().equals(v)) {
				next.setValue(null);
			}
		}
	}

	public void showSetOfKeys() {
		Set<K> setOfKeys = new HashSet<>();
		Iterator<Entry<K, V>> iterator = entryMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			setOfKeys.add(next.getKey());
		}

		System.out.println("Set of keys: " + setOfKeys);
	}

	public void showListOfValues() {
		List<V> listOfValues = new ArrayList<>();
		Iterator<Entry<K, V>> iterator = entryMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			listOfValues.add(next.getValue());
		}

		System.out.println("List of values: " + listOfValues);
	}

	public void showMyMap() {
		System.out.println("MyMap: " + getEntryMap());
	}
}