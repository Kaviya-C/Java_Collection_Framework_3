package com.collection.framework.end;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTOArrayList {
	public static void main(String... args) {
		// conversion of hashmap keys into arraylist
		HashMap<String, Integer> map = new HashMap<>();
		Set<String> keys = map.keySet();
		ArrayList<String> array = new ArrayList<>(keys);

		// conversion of hashmap values into arraylist
		HashMap<String, Integer> map1 = new HashMap<>();
		Collection<Integer> values = map.values();
		ArrayList<Integer> array1 = new ArrayList<>(values);
	
	//conversion of key-value into arraylist
		HashMap<Integer,Integer> map3=new HashMap<>();
		Set<Entry<Integer,Integer>> entries=map3.entrySet();
	ArrayList<Entry<Integer,Integer>> array2=new ArrayList<>(entries);
	
	
	
	HashMap<Integer,String>map4=new HashMap<Integer,String>();
	map4.put(100, "Jeena");
	map4.put(78, "ifan");
	map4.put(69, "janu");
	map4.put(90, "meghna");
	map4.put(87, "ezhil");
	
	Set<Integer> key=map4.keySet();
	
	ArrayList<Integer> result=new ArrayList<>(key);
	
	for(int k:result)
	{
		System.out.println(k);
	}
	
	
	
	Collection<String> value=map4.values();
	
	ArrayList<String> result2=new ArrayList<>(value);
	
	for(String s:result2)
	{
		System.out.println(s);
	}
	

	Set<Entry<Integer,String>> key_value=map4.entrySet();
	
	ArrayList<Entry<Integer,String>> result3=new ArrayList<>(key_value);
	
	for(Entry<Integer,String> e:result3)
	{
		System.out.println(e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
