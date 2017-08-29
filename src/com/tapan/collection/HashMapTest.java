package com.tapan.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("england", 4);
		map.put("pakistan", 2);
		map.put("india", 1);
		map.put("australia", 7);
		map.put("spain", 4);
		map.put("bangladesh", 1);

		System.out.println("Print hash table without sorting : " + map);

		// Sorting map by keys:

		Map<String, Integer> sortByKeys = sortedByKeys(map);
		System.out.println("Print sorting map by keys : " + sortByKeys);

		// Sorting may by values:

		Map<String, Integer> sortByValues = sortedByValues(map);
		System.out.println("Print sorting map by Values : " + sortByValues);

	}

	private static Map<String, Integer> sortedByKeys(Map<String, Integer> map) {
		// Get the keys to be used in collection sort method:
		List<String> keys = new ArrayList<String>(map.keySet());
		// Linked hash map to insert keys in sorted order.
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		Collections.sort(keys);

		for (String str : keys) {
			sortedMap.put(str, map.get(str));
		}

		return sortedMap;
	}

	private static Map<String, Integer> sortedByValues(Map<String, Integer> map) {
		
		List<Entry<String,Integer>> entries = new LinkedList<>(map.entrySet());
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		Collections.sort(entries, new Comparator<Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});
		
		for(Entry<String, Integer> entry : entries){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
