package com.lw.collectionn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set��һ�ֲ������ظ���Ԫ�ص�Collection�������������Ԫ��e1��e2����e1.equals(e2)=false��Set�����һ��nullԪ�ء�
 * 
 * @author lw
 */
public class TestSet {
	
	/**
	 * ά��һ��������������Ŀ��˫�������б�
	 * �������б����˵���˳�򣬼����ս�Ԫ�ز��뵽set�е�˳�򣨲���˳�򣩽��е�����
	 * ע�⣬����˳������set�����²����Ԫ��Ӱ��
	 */
	public static void testLinkedHashSet() {
		
	}

	/**
	 * ΪSortedSet��Ψһ�ӿ� �ص㣺����(���� ��Ȼ����Ͷ�������),�����Դ���null
	 * ���Ҫ��TreeSet������Ӷ���,��������������ʵ����Comprable�ӿڵ�compare����
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
	 * �ڲ�ʹ��Hash�㷨����ȡ�����ж���,��ȡ�ٶȿ� �ص㣺��ͬ��,����Ԫ�ؿ���Ϊnull,��ֻ��һ��null,��������.
	 * 
	 * HashSet�����ж�����Ԫ����ȵı�׼����������ͨ��equals�����Ƚ���ȣ��������������hashCode()��������ֵ�� ��
	 * ע�⣬���Ҫ��һ���������HashSet�У���д�ö����Ӧ���equals������ҲӦ����д��hashCode()������
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
