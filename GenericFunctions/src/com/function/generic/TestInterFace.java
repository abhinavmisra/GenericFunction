package com.function.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

interface a1 {
	public void add();
}
interface a2 {
	public void sub();
}

abstract class abc implements a1, a2{
	abstract public void meth1();

	
	public void sub() {
		System.out.println("subtraction");
	}
}

class def extends abc{
	public void add() {
		System.out.println("addition");
	}
	public void meth1() {
		System.out.println("Implementation");
	}
}
/*class a 
{
	
	public void sum() {
		System.out.println("Sum Method");
	}
}

class g extends a 
{	
	public void method1() {
		System.out.println("Sum Method");
		super.sum();
	}
}*/


/*interface testInter{
	public void testMethod();
}


class bo implements testInter{
	public void testMethod() {
		System.out.println("Printing");
	}
	
}*/

class ATest{
	protected Object test() throws Exception {
		return null;
	}
}

class Bcd extends ATest{
	@Override
	public String test() throws IOException{
		System.out.println("Method in class b");
		return null;
	}
}
public class TestInterFace {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*HashMap refVar = new HashMap();
		IdentityHashMap refr = new IdentityHashMap();
		refVar.put("key1", "val1");
		refVar.put(new String("key1"), "val2");
		refVar.put("key3", "val3");
		for(Object keys : refVar.keySet()) {
			System.out.println(refVar.get(keys));		
		}
		refr.putIfAbsent("Keys1", "value1");*/
		/*String abc = "random";
		abc.concat("test");
		abc = abc+"1";
		System.out.println("abc is "+abc);
		B b = null;
		//b.test();
		new B().test();
		testInter[] rr = new testInter[8];
		System.out.println(rr.getClass().getName());
		List temp = new ArrayList();
		System.out.println("Size is "+temp.size());
		temp.add("India");
		temp.add("US");
		temp.add("China");
		temp.add("Denmark");
		for(Object count : temp) {
			System.out.println("Before Sorting "+count);
		}
		Collections.sort(temp);
		for(Object count : temp) {
			System.out.println(count);
		}
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};*/
		ATest ref = new Bcd();
		ref.test();
		
		def refClass = new def();
		refClass.add();
		refClass.sub();
	}

}
