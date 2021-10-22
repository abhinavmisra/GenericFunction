package com.function.generic;

public class RemoveAdjDuplicateChar {
    public static void main(String[] args) {
        String str = "ABCCBCBA";
        StringBuffer sbr = new StringBuffer();
        int i = 0 ;
        while(i < str.length()) {
            if(sbr.length() == 0 ) sbr.append(str.charAt(i));
            if(str.charAt(i) == sbr.charAt(sbr.length() -1)) {i++ ;}
            else {sbr.append(str.charAt(i)); i++;}
        }
        System.out.println(sbr);
    }
}
