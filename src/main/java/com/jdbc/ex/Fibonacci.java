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

}
