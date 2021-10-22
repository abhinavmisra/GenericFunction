package com.function.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class TestClass {
	private void method1() {
		System.out.println("method1 of Private type");
	}
	
	private void method2() {
		System.out.println("method2 of Private type");
	}
}

public class PrivateMethod {

	public static void main(String[] args) throws Exception, Exception {
		/*TestClass ref = new TestClass();
		Method m = TestClass.class.getDeclaredMethod("method1");
		m.setAccessible(true);
		m.invoke(ref);*/
		
		Method[] mArray = TestClass.class.getDeclaredMethods();
		List<String> refList = new ArrayList<String>();
		for(Method names : mArray) {
			refList.add(names.getName());
		}
		
		refList.forEach((M)-> System.out.println("Methods are "+ M));
	}

}
