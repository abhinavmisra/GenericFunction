package com.function.generic;

public class CommaSeperatedValue {
	
	public static String[] splitByComma() {
		String names = "";
		String[] namesList = names.split(",");
		return namesList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] value = CommaSeperatedValue.splitByComma();
		System.out.println("Size of the array string is "+value.length);
		String res = value[0];
		System.out.println("Value at position is "+res);
		for(String name : value) {
			System.out.println("The values are "+name);
		}
	}

}
