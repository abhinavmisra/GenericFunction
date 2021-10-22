package com.function.generic;

public class TestRun {
    final int i;

    TestRun(int x)
    {
        // Since we have initialized above, we
        // must initialize i in constructor.
        // If we remove this line, we get compiler
        // error.
        i = x;
        int max_so_far = Integer.MIN_VALUE;
        System.out.println("%%%%%%%%%%%%% "+max_so_far);
    }
}

// Driver Code
class Main
{
    public static void main(String args[])
    {
        TestRun t1 = new TestRun(10);
                t1 = new TestRun(20);
        System.out.println(t1.i);

        TestRun t2 = new TestRun(20);
        System.out.println(t2.i);
    }
}
