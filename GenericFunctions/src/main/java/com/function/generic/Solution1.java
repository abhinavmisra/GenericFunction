package com.function.generic;


import java.util.Scanner;

class MyRegex extends Solution1{

    public static String ipBracket = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    private static String pattern = ipBracket +"\\."+ipBracket+"\\."+ipBracket+"\\."+ipBracket;
    public String testIP;

    public MyRegex(String iP) {
        this.testIP = iP;
        isMatch();
    }

    public boolean isMatch() {
        if(testIP.matches(pattern)) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String iP = in.next();
            MyRegex mr = new MyRegex(iP);
            System.out.println(mr.isMatch());
        }
        in.close();
    }

}
