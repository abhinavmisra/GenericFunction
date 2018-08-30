package com.function.generic;

import java.util.ArrayList;
import java.util.Collections;

class Movies implements Comparable<Movies>{
	public int year;
	public String name;
	public double rating;
	
	//By name
	/*public int compareTo(Movies m) {
		return this.name.compareTo(m.name);
	}*/
	//By year
	public int compareTo(Movies m)
    {
        return this.year - m.year;
    }
	
	//constructor
	public Movies(String nm, double rt,int yr) {
		this.year = yr;
		this.name = nm;
		this.rating = rt;
	}

}


public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movies> list = new ArrayList<Movies>();
        list.add(new Movies("Force Awakens", 8.3, 2015));
        list.add(new Movies("Star Wars", 8.7, 1977));
        list.add(new Movies("Empire Strikes Back", 8.8, 1980));
        list.add(new Movies("Return of the Jedi", 8.4, 1983));
        Collections.sort(list);
        System.out.println("Movie after sorting");
        System.out.println("******************************************");
        for(Movies M : list) {
        	System.out.println(M.name+" "+M.rating+" "+M.year);
        }

	}

}
