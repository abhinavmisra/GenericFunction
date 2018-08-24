package com.function.generic;

interface a {
	public void method1();
}

interface badf {
	public void method2();
}

abstract class c implements a,badf {
	public void method1(){
		System.out.println("Implementation added in abstract class for method1");
	}
	
	public void method2() {
		System.out.println("Implementation added in abstract class for method2");
	}
}

class de extends c {
	@Override
	public void method1() {
		System.out.println("Implementation added in abstract class for method1 in base");
	}
	
	@Override
	public void method2() {
		System.out.println("Implementation added in abstract class for method2 in base");
	}
}

public class AbstractTest extends c{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractTest refNew = new AbstractTest();
		refNew.method1();
		refNew.method2();
		
		c refDe = new de();
		refDe.method1();
		refDe.method2();

	}

}
