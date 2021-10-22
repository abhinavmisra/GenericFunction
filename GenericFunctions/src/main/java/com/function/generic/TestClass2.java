package com.function.generic;

public class TestClass2 {
    /*public static void main(String[] args) {
        System.out.println(args[2]);
    }*/
    /*static String message;
    public static void main(String[] args) {
        String message=null;
        System.out.print(TestClass2.message);
        System.out.print(message);
    }*/

    /*public Exception print (int i) {
        if (i<0) {
           return Exception("text");
        } else
            throw new Exception();
    }*/
    public static void main(String args[])
    {
        {
            int x = 5;
            {
                x = 10;
                System.out.println(x);
            }
        }
    }
}
