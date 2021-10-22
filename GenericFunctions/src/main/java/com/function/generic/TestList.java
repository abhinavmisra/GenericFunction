package com.function.generic;

import java.util.*;
import java.util.stream.Collectors;


public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		arr[0] = 3;
		Arrays.sort(arr);
		arr=Arrays.copyOf(arr, arr.length+1);
		for(int i=0; i<arr.length ;i++) {
			System.out.println("Arrays are "+arr[i]);
		}		
		List refArray = new ArrayList();
		refArray.add(10);
		refArray.add(null);
		refArray.add(10);
		refArray.add(10);		
		System.out.println("Size of the array list is "+refArray.size());
		refArray.remove(new Integer(10));
		System.out.println("Size of the array list after remove is "+refArray.size());
		Iterator itr = refArray.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		refArray = Collections.unmodifiableList(refArray);
		Object[] primArray=refArray.toArray();
		System.out.println("Array size is "+primArray.length);
		List refNewList = new ArrayList(Arrays.asList(primArray)); 
		//refArray.add(20);
		Stack<Integer> refStack = new Stack<>();
		refStack.push(1);
		refStack.push(1);
		refStack.push(1);
		refStack.push(5);
		refStack.push(1);
		Iterator stckItr = refStack.iterator();
		
		
		while(stckItr.hasNext()) {
			System.out.println("Contents of the stack are "+stckItr.next());
		}
		TreeSet<String> refTrSet = new TreeSet();
		refTrSet.add("10");
		refTrSet.add("String");
		refTrSet.add("c");
		
		Iterator trItr = refTrSet.iterator();
		while(trItr.hasNext()) {
			System.out.println("Values in tree are "+trItr.next());
		}
		
		Object[] arrayI = {1,2,3,4,5,6,7,8,9,10};
		List<Object> liTemp = Arrays.asList(arrayI);
		Collections.rotate(liTemp, 1);
		arrayI = liTemp.toArray();
		for(int l=0; l<arrayI.length; l++) {
			System.out.print(arrayI[l]+", ");
		}
		
		//Converting map to list
		Map<String, String> refMap = new HashMap();
		refMap.put("K1", "V1");
		refMap.put("K2", "V1");
		refMap.put("K3", "V3");
		refMap.put("K4", "V4");
		refMap.put("K5", "V5");
		refMap.put("K6", "V6");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Map size is "+refMap.size());
		System.out.println("-------------------------------------------------------------------");
		
		List<String> refList = new ArrayList<>(refMap.values());
		System.out.println("List size is "+refList.size());
		System.out.println(Collections.frequency(refList, "V1"));
		List<String> values = refMap.values().stream().collect(Collectors.toList());
		System.out.println("Values is "+values.size());
		
	}

}
