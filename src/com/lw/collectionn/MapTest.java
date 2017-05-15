package com.lw.collectionn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * key������nullֵ,�̰߳�ȫ,ʹ��enumerator������
	 */
	public static void testHashTablep() {
		Hashtable table = new Hashtable<>();
		// table.put(null, null);error
	}

	/**
	 * �ص㣺����ȫ;����null(key��value������),����ʹ��fail-fast����
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
