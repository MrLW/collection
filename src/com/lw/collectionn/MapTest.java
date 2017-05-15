package com.lw.collectionn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * key不允许null值,线程安全,使用enumerator迭代器
	 */
	public static void testHashTablep() {
		Hashtable table = new Hashtable<>();
		// table.put(null, null);error
	}

	/**
	 * 特点：不安全;允许null(key和value都可以),无序，使用fail-fast迭代
	 */
	public static void testHashMap() {
		Map map = new HashMap<>();
		map.put(null, null);
		map.put(null, null);
		map.put("a", null);
		map.put("b", "b-value");
		map.put("c", "c-value");
		map.put("d", "d-value");
		Set set = map.entrySet();
		for (Object object : set) {
			System.out.println(object + ":" + map.get(object));
		}
		System.out.println(map.size());
	}

	public static void main(String[] args) {
		// testHashMap();
		testHashTablep();
	}
}
