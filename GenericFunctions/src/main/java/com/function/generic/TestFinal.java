package com.function.generic;

import java.util.*;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
		ref.put(new Integer(1), new Integer(23));
		ref.put(new Integer(5), new Integer(25));
		ref.put(new Integer(2), new Integer(2));
		ref.put(new Integer(3), new Integer(123));
		
		//ref.forEach((k,v)-> System.out.println(k+":"+v));
		
		TreeMap<Object, Object> refT = new TreeMap<Object, Object>();
		for(Map.Entry m:ref.entrySet()) {
			refT.put(m.getValue(), m.getKey());
		}
		System.out.println("Sorted by values "+refT);
		/*refT.forEach((k,v)-> System.out.println(k+":"+v));*/
		
		
		HashSet<Integer> hsSet = new HashSet<Integer>();
		hsSet.add(3);
		hsSet.add(1);
		
		Object[] a = new Object[10];
		
		a=hsSet.toArray();
		Arrays.sort(a);
		for(Object b : a) {
		System.out.println(b);
		}

	}

}
