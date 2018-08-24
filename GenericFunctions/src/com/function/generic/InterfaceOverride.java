package com.function.generic;

interface SomethingIsWrong {
    static void aMethod(int aValue){
        System.out.println("Hi Mom");
    }
    
    default void methodX() {
    	System.out.println("Default Method");
    }
     public String stMethod();
}

interface testA {
	Object abMethod1();
	Object abMethod1(String text);
}

abstract class testB implements testA, SomethingIsWrong {
	@Override
	public abstract String abMethod1();
}

abstract class testc extends testB{
	@Override
	public abstract String abMethod1();
}
class clsA extends testc{
	public String abMethod1() {
		System.out.println("Providing implementation");
		return "Implementation";
	}
	public String abMethod1(String text) {
		System.out.println("Providing implementation for the parameterized method");
		return "Implementation";
	}
	public String stMethod() {
		return "string";
	}
}

public class InterfaceOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clsA refVar = new clsA();
		System.out.println(refVar.abMethod1());
		SomethingIsWrong.aMethod(5);
	}

}
