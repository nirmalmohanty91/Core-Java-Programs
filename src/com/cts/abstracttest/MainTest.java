package com.cts.abstracttest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MainTest {
	public static int a;
	public int b;

	public static TreeMap<Integer, Employee> sortMapByValue(
			HashMap<Integer, Employee> map) {
		Comparator<Integer> comparator = new ValueComparator(map);
		// TreeMap is a map sorted by its keys.
		// The comparator is used to sort the TreeMap by keys.
		TreeMap<Integer, Employee> result = new TreeMap<Integer, Employee>(
				comparator);
		result.putAll(map);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(a);
		HashMap<Integer, Employee> m = new HashMap<Integer, Employee>();
		Employee emp = new Employee("nirmal", 421, 2000);
		Employee emp1 = new Employee("Deepankar", 445, 3000);
		Employee emp2 = new Employee("Clark", 245, 1000);
		m.put(1, emp);
		m.put(2, emp1);
		m.put(3, emp2);

		TreeMap<Integer, Employee> sortedMap = sortMapByValue(m);
		System.out.println(sortedMap);

		/*
		 * List<Integer> list = new ArrayList<>(); Map<Integer, Integer> m1 =
		 * new HashMap<Integer, Integer>();
		 * 
		 * Set<Integer> set = m.keySet(); Iterator<Integer> itr =
		 * set.iterator();
		 * 
		 * while (itr.hasNext()) {
		 * 
		 * Integer key = itr.next(); list.add(m.get(key).getSalary());
		 * m1.put(m.get(key).getSalary(), key);
		 * 
		 * }
		 * 
		 * System.out.println(list); Collections.sort(list);
		 * System.out.println(list); System.out.println(m1); for (int i : list)
		 * { m1.put(i, )
		 * 
		 * }
		 */

	}
}
