package com.collection.framework.end;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String... args) {
		// java 8 convert map to list--keys

		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "apple");
		map.put(34, "Pomegranate");
		map.put(45, "Gooseberry");
		map.put(55, "Mango");
		List<Integer> key = map.keySet().stream().collect(Collectors.toList());
		System.out.println("Without sorting Keys: " + key);
		List<Integer> keys = map.keySet().stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting the keys: " + keys);

		List<String> value = map.values().stream().collect(Collectors.toList());
		System.out.println("Without sorting values: " + value);
		List<String> values = map.values().stream().sorted().collect(Collectors.toList());
		System.out.println("After sortin the values: " + values);

		key.forEach(System.out::println);
		values.forEach(System.out::println);

	}

}
