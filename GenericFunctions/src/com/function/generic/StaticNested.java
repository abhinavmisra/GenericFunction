package com.function.generic;

public class StaticNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNested ref = new StaticNested();
		
		Object o;
		o = new Inner().new Private();
		
		System.out.println(8 + " is " + ((com.function.generic.StaticNested.Inner.Private) o).powerof2(8));
		
		String[] array = {"abc", "def", "ghi", "jkl", "hdsfg", "jhsdgf", "djghsfsd"};
		String temp;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++)
			if(array[i].compareTo(array[j])<0) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.println("The sorted array is "+array[i]);
		}
		

	}
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}

}
