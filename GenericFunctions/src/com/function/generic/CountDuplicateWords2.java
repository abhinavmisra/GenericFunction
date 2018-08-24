package com.function.generic;

import java.util.Scanner;

public class CountDuplicateWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the text with duplicate words...");
		String text = ref.nextLine();
		text = text.toLowerCase();
		System.out.println("String is "+text);
		String[] arText = text.split(" ");
		int count = 1;
		for(int i=0; i<arText.length; i++) {
			for(int j=i+1; j<arText.length; j++) {
				if(arText[i].equals(arText[j])) {
					count++;
					arText[j]="0";
				}
			}
			if(arText[i]!="0") {
				if(count>1) {
					System.out.println(arText[i]+" : "+count);
				}
				count=1;
			}
		}
	}

}
