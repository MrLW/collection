package com.lw.collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
/**
 *  内部允许为null,有序
 * @author lw
 *
 */
public class ListTest {

	/**
	 *  允许为null,额外提供了get、remove、insert的方法
	 *  这些方法使得LinkedList可以被用作堆栈,队列,双向队列
	 *  注意LinkedList没有同步方法。如果多个线程同时访问一个List，则必须自己实现访问同步。
	 *  特點：增删快,不安全
	 */
	public static void testLinkedList(){
		List list = new LinkedList<>() ;
		boolean flag = list.add(null);
		list.add(null);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(flag);
		System.out.println("size:" + list.size());// 1 
		
	}
	
	
	/**
	 * ArrayList实现了可变大小的数组。它允许所有元素，包括null。ArrayList没有同步。
	 * 和LinkedList一样，ArrayList也是非同步的（unsynchronized）。
	 * 特点：查询快,不安全
	 */
	public static void testArrayList(){
		List list = new ArrayList() ;
		boolean flag = list.add(null);
		System.out.println(flag);
		System.out.println("size:" + list.size());// 1 
	}
	
	/**
	 * Vector非常类似ArrayList，但是Vector是同步的。
	 * 当一个Iterator被创建而且正在被使用，另一个线程改变了Vector的状态
	 * 这时调用Iterator的方法时将抛出ConcurrentModificationException，因此必须捕获该异常。
	 * 特点：线程安全
	 */
	public static void testVector(){
		List list = new Vector<>() ;
		list.add(null);
		System.out.println("vector size : " + list.size());
	}
	
	/**
	 * Stack继承自Vector，实现一个后进先出的堆栈。
	 */
	public static void testStack(){
		
	}
	
	public static void main(String[] args) {
		testLinkedList();
//		testArrayList();
//		testVector();
	}
}
