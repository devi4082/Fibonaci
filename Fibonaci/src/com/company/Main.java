package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input : ");
        int n = s.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("Output :");
            System.out.println(" 1");
        } else {
            int sum = 2;
            int fibo1 = 1, fibo2 = 1, fibonacci = 1;
            for (int i = 3; i <= n; i++) {
                fibonacci = fibo1 + fibo2;
                sum += fibonacci;
                fibo1 = fibo2;
                fibo2 = fibonacci;
            }
            System.out.println("Output: ");
            System.out.println(sum);
        }
    }
}
