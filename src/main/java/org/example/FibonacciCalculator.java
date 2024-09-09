package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator {
    private static final Map<Integer, Long> memo = new HashMap<>();

    //О(n)
    public long iterativeFibonacci(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    //O(2^n)
    public long recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);
    }

    //O(2^n)
    public long DPFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = DPFibonacci(n - 1) + DPFibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }
}
