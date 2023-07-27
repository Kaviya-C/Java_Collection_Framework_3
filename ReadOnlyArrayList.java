package com.collection.framework.end;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//unmodifiableList()
//unmodifiableSet()
//unmodifiableMap()

// above methods are readonly 
// if we trying to do any changes then we get "UnsupportedOperationException"
public class ReadOnlyArrayList {
	public static void main(String... args)

	{

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(21);
		list.add(34);
		list.add(56);
		System.out.println(list);
		System.out.println("After read only:");
		List<Integer> readOnly = Collections.unmodifiableList(list);
		System.out.println(readOnly);

		// readOnly.add(900);
		// System.out.println(readOnly);

		Set<Integer> set = new HashSet<>(list);
		Set<Integer> unmo = Collections.unmodifiableSet(set);
		// unmo.add(90000);
		System.out.println(set);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "rat");
		map.put(1, "cat");
		map.put(2, "cow");
		Set<Entry<Integer, String>> entry = map.entrySet();

		Map<Integer, String> result = Collections.unmodifiableMap(map);

		// result.put(90, "ooooo");
		System.out.println(result);

	}

}
