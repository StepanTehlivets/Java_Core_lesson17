package ua.academy.lgs2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Map<K, V> {
	List<MyEntry<K, V>> map = new ArrayList<>();

	public Map() {
		super();
	}

	public Map(List<MyEntry<K, V>> map) {
		super();
		this.map = map;
	}

	public List<MyEntry<K, V>> getMap() {
		return map;
	}

	public void setMap(List<MyEntry<K, V>> map) {
		this.map = map;
	}

	public void addToMap() {
		System.out.println("Enter key");
		Scanner sc = new Scanner(System.in);
		K key = (K) sc.next();
		System.out.println("Enter value");
		V value = (V) sc.next();
		MyEntry<K, V> entryToAdd = new MyEntry<K, V>(key, value);
		map.add(entryToAdd);
	}

	public void deleteByKey() {
		System.out.println("Enter key");
		Scanner sc = new Scanner(System.in);
		K key = (K) sc.next();
		Iterator<MyEntry<K, V>> iterator = map.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> entry = iterator.next();
			if (entry.getKey().equals(key)) {
				iterator.remove();
			}
		}
	}

	public void deleteByValue() {
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		K value = (K) sc.next();
		Iterator<MyEntry<K, V>> iterator = map.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> entry = iterator.next();
			if (entry.getValue().equals(value)) {
				iterator.remove();
			}
		}
	}

	public void printKeySet() {
		Set<K> keysInSet = new HashSet<>();
		Iterator<MyEntry<K, V>> iterator = map.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> entry = iterator.next();
			keysInSet.add(entry.getKey());
		}
		System.out.println(keysInSet.toString());
	}

	public void printValueList() {
		List<V> valuesInList = new ArrayList<>();
		Iterator<MyEntry<K, V>> iterator = map.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> entry = iterator.next();
			valuesInList.add(entry.getValue());
		}
		System.out.println(valuesInList.toString());
	}

	public void printMap() {
		Iterator<MyEntry<K, V>> iterator = map.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> entry = iterator.next();
			System.out.println(entry.toString());
		}
	}
}
