package ar.com.alehenestroza;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        long fib = fibonacci(n);
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
