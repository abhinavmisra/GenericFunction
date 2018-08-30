package com.function.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>{
	private int year;
	private String name;
	private double rating;
	
	
	public int compareTo(Movie m) {
		return this.name.compareTo(m.name);
	}
	
	public Movie(String nm, double rt,int yr) {
		this.year = yr;
		this.name = nm;
		this.rating = rt;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public double getRate() {
		return rating;
	}
}

/*class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		if (m1.getRate() < m2.getRate()) return -1;
	    if (m1.getRate() > m2.getRate()) return 1;
	    else return 0;
	}
}

class NameCompare implements Comparator<Movie>{
	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

class YearCompare implements Comparator<Movie>{
	public int compare(Movie m1, Movie m2) {
		if(m1.getYear() < m2.getYear()) return -1;
		if(m1.getYear() > m2.getYear()) return 1;
		else return 0;
	}
}*/

class ComparableClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        /*NameCompare nc = new NameCompare();
        RatingCompare rc = new RatingCompare();
        YearCompare yc = new YearCompare();*/
        /*Collections.sort(list, nc);
        Collections.sort(list, rc);*/
        Collections.sort(list);
        System.out.println("Movie after sorting");
        for(Movie M : list) {
        	System.out.println(M.getName()+" "+M.getRate());
        }
	}

}
