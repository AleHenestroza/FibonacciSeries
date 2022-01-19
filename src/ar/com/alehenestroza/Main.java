package ar.com.alehenestroza;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        fibonacciCache = new long[n + 1];

        long fib = fibonacci(n);

        System.out.println(fib);
    }

    // Slow implementation
//    private static long fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }

    // Faster implementation with memoization
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

}
