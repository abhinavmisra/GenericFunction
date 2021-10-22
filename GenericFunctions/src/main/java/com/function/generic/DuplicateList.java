package com.function.generic;

import java.util.*;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = Arrays.asList("Bob", "John","Smith","Bob0","Rob","John","Bob","Mary","Rob");
		/*//Converting to array of string type
		String[] name = (String[]) nameList.toArray();
		//Default Counter value
		int count = 1;
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equalsIgnoreCase(name[j])) {
					count++;
					name[j]="0";
				}
			}
			if(name[i]!="0") {
				System.out.println(name[i]+" - "+count);
			}count=1;
		}*/
		Map<Integer, String> refMap = new HashMap<>();
		Set<String> unique = new HashSet<String>(nameList);
		for (String value : unique) {
		    System.out.println(value + ": " + Collections.frequency(nameList, value));
		    refMap.put(Collections.frequency(nameList, value), value);

		}


		for(String name : nameList) {
			if(name.charAt(0)=='B'||name.charAt(0)=='B') {
				System.out.println("name is "+name);
			}
		}
		
		for(int k=0; k<nameList.size(); k++) {
			for(int l=k+1; k<nameList.size(); k++) {
				if(nameList.get(k).equalsIgnoreCase(nameList.get(l)) && !nameList.get(k).equalsIgnoreCase("0")) {
					System.out.println("Duplicate "+nameList.get(k)+" found at the position "+k+" and "+l);
					nameList.remove(l);
					nameList.add(l, "0");
				}
			}
		}
		
		/*Map<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : nameList) {
		    if (counts.containsKey(str)) {
		        counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}*/
	}

}
