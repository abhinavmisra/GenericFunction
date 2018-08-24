package com.function.generic;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.SortedMap;


public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> refMap = new HashMap<Integer, String>(); 
		refMap.put(0, "abc");
		refMap.put(1, "aaa");
		refMap.put(2, "dbc");
		refMap.put(3, "gdc");
		refMap.put(4, "afd");
		refMap.put(6, "cdc");
		refMap.put(7, "mbn");
		refMap.put(8, "ara");
		refMap.put(9, "btui");
		refMap.put(5, "dfg");
		System.out.println("Map size is "+refMap.size());
		
		Map<Integer, String> refMap2 = new HashMap<Integer, String>(){
			{
				put(0, "abra");
			}
		};
		
		Set refSet = new LinkedHashSet();
		refSet.add('h');
		refSet.add('e');
		refSet.add('l');
		refSet.add('l');
		System.out.println("Set value is "+refSet);
		
		for(Map.Entry m:refMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Map<Integer, String> idenRefMap = new IdentityHashMap<Integer, String>();
		idenRefMap.put(1, "val1");
		idenRefMap.put(1, "val1");
		System.out.println("Size of IdenMap Is "+idenRefMap.size());
		
		Set varSet = refMap.keySet();
		Iterator refItr = varSet.iterator();
		while(refItr.hasNext()) {
			Object key = refItr.next();
			System.out.println(refMap.get(key));
		}
		refMap.forEach((k,v)-> System.out.println(k+":"+v));
	}

}
