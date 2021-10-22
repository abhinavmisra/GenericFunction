package com.function.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Moviee implements Comparable<Moviee>
{
    public double rating;
    public String name;
    public int year;
 
    // Used to sort movies by year
    public int compareTo(Moviee m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Moviee(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

}
 
// Class to compare Movies by ratings
class RatingCompare implements Comparator<Moviee>
{
    public int compare(Moviee m1, Moviee m2)
    {
        if (m1.rating < m2.rating) return 1;
        if (m1.rating> m2.rating) return -1;
        else return 0;
    }
}
 
// Class to compare Movies by name
class NameCompare implements Comparator<Moviee>
{
    public int compare(Moviee m1, Moviee m2)
    {
        return m1.name.compareTo(m2.name);
    }
}
public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Moviee> list = new ArrayList<Moviee>();
        list.add(new Moviee("Force Awakens", 8.3, 2015));
        list.add(new Moviee("Star Wars", 8.7, 1977));
        list.add(new Moviee("Empire Strikes Back", 8.8, 1980));
        list.add(new Moviee("Return of the Jedi", 8.4, 1983));
 
        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Moviee moviee: list)
            System.out.println(moviee.rating + " " +
                               moviee.name + " " +
                               moviee.year);
 
 
        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Moviee moviee: list)
            System.out.println(moviee.name + " " +
                               moviee.rating + " " +
                               moviee.year);
 
        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Moviee moviee: list)
            System.out.println(moviee.year + " " +
                               moviee.rating + " " +
                               moviee.name+" ");

	}

}
