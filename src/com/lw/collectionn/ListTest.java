package com.lw.collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
/**
 *  �ڲ�����Ϊnull,����
 * @author lw
 *
 */
public class ListTest {

	/**
	 *  ����Ϊnull,�����ṩ��get��remove��insert�ķ���
	 *  ��Щ����ʹ��LinkedList���Ա�������ջ,����,˫�����
	 *  ע��LinkedListû��ͬ���������������߳�ͬʱ����һ��List��������Լ�ʵ�ַ���ͬ����
	 *  ���c����ɾ��,����ȫ
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
	 * ArrayListʵ���˿ɱ��С�����顣����������Ԫ�أ�����null��ArrayListû��ͬ����
	 * ��LinkedListһ����ArrayListҲ�Ƿ�ͬ���ģ�unsynchronized����
	 * �ص㣺��ѯ��,����ȫ
	 */
	public static void testArrayList(){
		List list = new ArrayList() ;
		boolean flag = list.add(null);
		System.out.println(flag);
		System.out.println("size:" + list.size());// 1 
	}
	
	/**
	 * Vector�ǳ�����ArrayList������Vector��ͬ���ġ�
	 * ��һ��Iterator�������������ڱ�ʹ�ã���һ���̸߳ı���Vector��״̬
	 * ��ʱ����Iterator�ķ���ʱ���׳�ConcurrentModificationException����˱��벶����쳣��
	 * �ص㣺�̰߳�ȫ
	 */
	public static void testVector(){
		List list = new Vector<>() ;
		list.add(null);
		System.out.println("vector size : " + list.size());
	}
	
	/**
	 * Stack�̳���Vector��ʵ��һ������ȳ��Ķ�ջ��
	 */
	public static void testStack(){
		
	}
	
	public static void main(String[] args) {
		testLinkedList();
//		testArrayList();
//		testVector();
	}
}
