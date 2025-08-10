package com.jdbc.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        TwoSum twoSum = new TwoSum(Arrays.asList(1, 7, 15, 9, 13), 14);

        measureTime("Brute Force" , () -> System.out.println("Two Sum Response By Brute Force :: " + Arrays.toString(twoSum.twoSumByBruteForce())) );

        measureTime("Hash Map", () -> System.out.println("Two Sum Response By Hash Map :: " + Arrays.toString(twoSum.twoSumByHashMap())) );

        measureTime("Fibonacci Series", () -> System.out.println("Fibonacci Series " + new Fibonacci().fibonacciSeries(1000)));

        measureTime("Fibonacci Series Number By Index", () -> System.out.println("Find Fibo By Index " + new Fibonacci().fib(6)));

    }

    private static void measureTime(String label, Runnable code) {
        long start = System.nanoTime();
        code.run();
        long end = System.nanoTime();

        double ms = (end - start) / 1_000_000.0;
        double s  = (end - start) / 1_000_000_000.0;

        System.out.printf("%s Time Taken :: %.6f ms (%.9f secs)%n", label, ms, s);
    }

}