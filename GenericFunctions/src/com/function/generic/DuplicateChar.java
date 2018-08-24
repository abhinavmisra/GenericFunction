package com.function.generic;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		char temp = '0';
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the text with duplicate words...");
		String text = ref.nextLine();
		text = text.toLowerCase();
		StringBuilder refText = new StringBuilder(text);
		System.out.println("String is "+text);
		int count = 1;
		for(int i=0; i<refText.length(); i++) {
			for(int j=i+1; j<refText.length(); j++) {
				if(refText.charAt(i)==refText.charAt(j)) {
					count++;
					refText.setCharAt(j, temp);
				}
			}
			if(refText.charAt(i)!='0') {
					System.out.println(refText.charAt(i)+" : "+count);
				
			}count=1;
		}
	}

}
