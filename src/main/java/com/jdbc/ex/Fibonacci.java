package com.jdbc.ex;

import java.util.ArrayList;

public class Fibonacci {


    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

    public ArrayList<Integer> fibonacciSeries(int n) { // The next number is found by adding up the two numbers before it:

        int a = 0, b = 1;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int c = a + b;
            if (a > n) { break; }
            list.add(a);
            a = b; b = c;
        }

        return list;
    }

    public int fib(int n) { // leet code question number : 509
        if(n == 0) { return n;}
        int a = 0;
        int b = 1;
        int trackIndex = a;

        while (true) {
            trackIndex += 1;
            int c = a + b;
            if (trackIndex == n) { break; }
            a = b; b = c;
        }
        return b;
    }

}
