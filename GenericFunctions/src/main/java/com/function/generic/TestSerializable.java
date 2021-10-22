package com.function.generic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializable implements Serializable {

	int i = 10, j = 20;
	 
    // Transient variables
    transient int k = 30;
 
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;
 
    public static void main(String[] args) throws Exception
    {
    	TestSerializable input = new TestSerializable();
 
        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
        System.out.println("Value of i "+input.i);
        System.out.println("Value of j "+input.j);
        System.out.println("Value of k "+input.k);
        System.out.println("Value of l "+input.l);
        System.out.println("Value of m "+input.m);
        System.out.println("File Write successfull "+input.toString());
 
        // de-serialization
        /*FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestSerializable output = (TestSerializable)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);  
        System.out.println("m = " + output.m);*/

	}

}
