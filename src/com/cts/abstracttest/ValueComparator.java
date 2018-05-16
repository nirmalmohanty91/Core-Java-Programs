package com.cts.abstracttest;

import java.util.Comparator;
import java.util.HashMap;

public class ValueComparator implements Comparator<Integer> {

	HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

	public ValueComparator(HashMap<Integer, Employee> map) {
		this.map.putAll(map);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if (map.get(o1).getSalary() >= map.get(o2).getSalary()) {
			return -1;
		} else {
			return 1;
		}
	}

}
