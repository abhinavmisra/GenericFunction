package com.function.generic;

public class FirstSingleChar {
	
	public static long countUniqueCharacters(String input) {
	    return input.chars()
	            .distinct()
	            .count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String text = "hello world";
		int count=0;
		for(int i=0; i<text.length(); i++) {
			for(int j=i+1; j<text.length(); j++) {
				if(text.charAt(i)==text.charAt(j)) {
					count++;
				}
				if(count==0) {
					System.out.println("The first unique char is "+text.charAt(i));
				}
			}
		}
*/
	System.out.println("Unique chr is "+FirstSingleChar.countUniqueCharacters("Hello World"));
	}

}
