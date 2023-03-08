package javabasic;

import java.util.Scanner;

public class FiboTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term of Fibonacci series: ");
        int first = scanner.nextInt();
        scanner.close();
        int second = first;
        int next = 0;
        System.out.print("Fibonacci series starting from " + first + ": ");
        System.out.print(first + " " + second + " ");
        while (next <=500 /*Integer.MAX_VALUE - second*/) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}