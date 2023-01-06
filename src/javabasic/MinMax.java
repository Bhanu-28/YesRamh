package javabasic;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MinMax {
    //check1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        int[] array = new int[n];

        int min;
        for(min = 0; min < n; ++min) {
            array[min] = sc.nextInt();
        }

        min = IntStream.of(array).min().getAsInt();
        int max = IntStream.of(array).max().getAsInt();
        System.out.println("min array is " + min);
        System.out.println("max array is " + max);
    }
}
