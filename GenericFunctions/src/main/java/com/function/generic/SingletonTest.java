package com.function.generic;


class Singleton{
	
	/*//Lazy Initialization
	private static Singleton instance;
	public String str;
	
	private Singleton() {
		str="Hello I am a singleton! Let me say hello world to you";
	}
	
	public static Singleton getSingleInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}*/
	
	//Thread safe with eager initialization
	 private static final Singleton instance = new Singleton();
	 public String str;
	 private Singleton() {
		 str = "Eager Initialization";
	 }
	 public static synchronized Singleton getSingleInstance() {
		 return instance;
	 }
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getSingleInstance();
		System.out.println(x.str);

	}

}
