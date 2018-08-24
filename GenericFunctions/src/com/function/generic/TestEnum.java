package com.function.generic;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Enum declaration can be done inside or outside a class but not inside a method 
// In Java, we can also add variables, methods and constructors to it.
// Enum outside class
 enum colour{
	Red, Green, Blue;
}

public class TestEnum {
	
	//Enum inside class
	private enum car{
		Audi, Mercedes, Volvo, Ferrari
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colour c1 = colour.Red;
		System.out.println("Colour is "+c1);
		car car1 = car.Audi;
		System.out.println("Car is "+car1);
		EnumMap<car, String> carMap = new EnumMap<car, String>(car.class);
		carMap.put(car.Audi, "Audi R8");
		carMap.put(car.Audi, "Audi Q3");
		Set refSet = carMap.keySet();
		Iterator refItr = refSet.iterator();
		while(refItr.hasNext()) {
			System.out.println(carMap.get(refItr.next()));
		}
		
		//carMap.forEach((k,v)-> System.out.println(k+":"+v));
	}

}
