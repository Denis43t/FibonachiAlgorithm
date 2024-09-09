package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        System.out.println(fibonacciCalculator.iterativeFibonacci(10));
        System.out.println(fibonacciCalculator.recursiveFibonacci(10));
        System.out.println(fibonacciCalculator.DPFibonacci(10));
    }
}