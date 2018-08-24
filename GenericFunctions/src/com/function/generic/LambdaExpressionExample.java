package com.function.generic;

interface Drawable{  
    public void draw();  
} 

/*Lambda expression is a new and important feature of Java which was included in Java SE 8. 
It provides a clear and concise way to represent one method interface using an expression. 
It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface.
It saves a lot of code. 
In case of lambda expression, we don't need to define the method again for providing the implementation. 
Here, we just write the implementation code.
*/
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();
        
        //with lambda  
        Drawable d2=()->
        {  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();
        System.out.println("text"+'1'+2);
    }  
}  