package com.function.generic;

import java.util.*;

class Demo
{
    public String toString()
    {
        return "demo";
    }

    // finalize method
    public void finalize()
    {
        System.out.println("finalize method is called");
    }
}

public class TestMaps {
    /*Hashmap
     * HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
     * It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
     * HashMap doesn’t allow duplicate keys but allows duplicate values.
     * That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
     * HashMap allows null key also but only once and multiple null values.
     * This class makes no guarantees as to the order of the map; in particular,
     * it does not guarantee that the order will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
     */
    public void testHashMap() {
        System.out.println("*****************************************************HashMap******************************************************");
        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println("Size of map is:- " + map.size());

        print(map);
        if (map.containsKey("vishal"))
        {
            Integer a = map.get("vishal");
            System.out.println("value for key \"vishal\" is:- " + a);
        }

        map.clear();
        System.out.println("Size of map is:- " + map.size());
        print(map);System.out.println("*****************************************************HashMap******************************************************");

    }

    public static void print(Map<String, Integer> map)
    {
        if (map.isEmpty())
        {
            System.out.println("map is empty");
        }

        else
        {
            System.out.println(map);
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*LinkedHashMap
     * A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
     * It contains only unique elements.
     * It may have one null key and multiple null values.
     * It is same as HashMap with additional feature that it maintains insertion order.
     */
    public void testLinkedHashMap() {
        System.out.println("*****************************************************LinkedHashMap******************************************************");
        LinkedHashMap<String, String> lhm =
                new LinkedHashMap<String, String>();
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        // It prints the elements in same order
        // as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'one': "
                + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? "+
                lhm.containsKey("two"));
        System.out.println("Contains value 'practice.geeks"
                +"forgeeks.org'? "+ lhm.containsValue("practice"+
                ".geeksforgeeks.org"));
        System.out.println("delete element 'one': " +
                lhm.remove("one"));
        System.out.println(lhm);
        System.out.println("*****************************************************LinkedHashMap******************************************************");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*WeakHashMap
     * WeakHashMap is an implementation of the Map interface.
     * WeakHashMap is almost same as HashMap except in case of WeakHashMap,
     * if object is specified as key doesn’t contain any references- it is eligible for garbage collection even though
     * it is associated with WeakHashMap. i.e Garbage Collector dominates over WeakHashMap.
     */
    public void testWeakHashMap() throws InterruptedException {
        System.out.println("*****************************************************WeakHashMap******************************************************");
        WeakHashMap m = new WeakHashMap();
        Demo d = new Demo();

        // puts an entry into WeakHashMap
        m.put(d," Hi ");
        System.out.println(m);

        d = null;

        // garbage collector is called
        System.gc();

        // thread sleeps for 4 sec
        Thread.sleep(4000);

        System.out.println(m);
        System.out.println("*****************************************************WeakHashMap******************************************************");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*IdentityHashMap
     * IdentityHashMap uses equality operator “==” for comparing keys and values while HashMap uses equals method for comparing keys and values inside Map.
     * Since IdentityHashMap doesn’t use equals() its comparatively faster than HashMap for object with expensive equals().
     * IdentityHashMap doesn’t require keys to be immutable as it is not relied on equals().
     */
    public void testIdentityHashMap() {
        System.out.println("*****************************************************IdentityHashMap******************************************************");
        Map hm = new HashMap();
        Map ihm = new IdentityHashMap();

        // Putting key and value in HashMap and IdentityHashMap Object
        hm.put("hmkey","hmvalue");
        hm.put(new String("hmkey"),"hmvalue1");
        ihm.put("ihmkey","ihmvalue");
        ihm.put(new String("ihmkey"),"ihmvalue1");

        // Print Size of HashMap and WeakHashMap Object
        //hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap--"+hm.size());

        //ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap--"+ihm.size());
        System.out.println("*****************************************************IdentityHashMap******************************************************");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*EnumMap
     * EnumMap class is a member of the Java Collections Framework & is not synchronized.
     * EnumMap is ordered collection and they are maintained in the natural order of their keys( natural order of keys means,
     * the order on which enum constant are declared inside enum type )
     * It’s a high performance map implementation, much faster than HashMap.
     * All keys of each EnumMap instance must be keys of a single enum type.
     * EnumMap doesn’t allow null key and throw NullPointerException, at same time null values are permitted.
     */

    public enum GFG
    {
        CODE, CONTRIBUTE, QUIZ, MCQ;
    }

    public void testEnumMap()
    {
        System.out.println("*****************************************************EnumMap******************************************************");
        // Java EnumMap
        // Creating EnumMap in java with key
        // as enum type STATE
        EnumMap<GFG, String> gfgMap = new
                EnumMap<GFG, String>(GFG.class);

        // Java EnumMap Example 2:
        // Putting values inside EnumMap in Java
        // Inserting Enum keys different from
        // their natural order
        gfgMap.put(GFG.CODE, "Start Coding with gfg");
        gfgMap.put(GFG.CONTRIBUTE, "Contribute for others");
        gfgMap.put(GFG.QUIZ, "Practice Quizes");
        gfgMap.put(GFG.MCQ, "Test Speed with Mcqs");

        // Printing size of EnumMap in java
        System.out.println("Size of EnumMap in java: " +
                gfgMap.size());

        // Printing Java EnumMap
        // Print EnumMap in natural order
        // of enum keys (order on which they are declared)
        System.out.println("EnumMap: " + gfgMap);

        // Retrieving value from EnumMap in java
        System.out.println("Key : " + GFG.CODE +" Value: "
                + gfgMap.get(GFG.CODE));

        // Checking if EnumMap contains a particular key
        System.out.println("Does gfgMap has "+GFG.CONTRIBUTE+": "
                + gfgMap.containsKey(GFG.CONTRIBUTE));

        // Checking if EnumMap contains a particular value
        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : "
                + gfgMap.containsValue("Practice Quizes"));
        System.out.println("Does gfgMap has :" + GFG.QUIZ + " : "
                + gfgMap.containsValue(null));System.out.println("*****************************************************EnumMap******************************************************");

    }

    public static void main (String[] args) throws InterruptedException {
        TestMaps ref = new TestMaps();
        ref.testHashMap();
        ref.testLinkedHashMap();
        ref.testWeakHashMap();
        ref.testIdentityHashMap();
    }

}
