package com.lw.collectionn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set是一种不包含重复的元素的Collection，即任意的两个元素e1和e2都有e1.equals(e2)=false，Set最多有一个null元素。
 * 
 * @author lw
 */
public class TestSet {
	
	/**
	 * 维护一个运行于所有条目的双重链接列表。
	 * 此链接列表定义了迭代顺序，即按照将元素插入到set中的顺序（插入顺序）进行迭代。
	 * 注意，插入顺序不受在set中重新插入的元素影响
	 */
	public static void testLinkedHashSet() {
		
	}

	/**
	 * 为SortedSet的唯一接口 特点：有序(两种 自然排序和定制排序),不可以存入null
	 * 如果要想TreeSet集合添加对象,则这个对象必须是实现了Comprable接口的compare方法
	 */
	public static void testTreeSet() {
		TreeSet set = new TreeSet<>();
		set.add(new Object());// error
		set.add("bbb");
		set.add("ccc");
		set.add("ccc");
		// set.add(null);
		// set.add(null);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/**
	 * 内部使用Hash算法来存取集合中对象,存取速度快 特点：不同步,集合元素可以为null,但只能一个null,不是有序.
	 * 
	 * HashSet集合判断两个元素相等的标准是两个对象通过equals方法比较相等，并且两个对象的hashCode()方法返回值相 等
	 * 注意，如果要把一个对象放入HashSet中，重写该对象对应类的equals方法，也应该重写其hashCode()方法。
	 */
	public static void testHashSet() {
		Set set = new HashSet();
		String s1 = new String("hello");
		String s2 = s1;
		String s3 = new String("word");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add("aaa");
		set.add("bbb");
		set.add(null);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("hastset size:" + set.size());
	}

	public static void main(String[] args) {
		// testHashSet();
		// testTreeSet();
	}
}
