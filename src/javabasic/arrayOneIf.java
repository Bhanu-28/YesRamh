package javabasic;

import java.util.Scanner;

public class arrayOneIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int p = sc.nextInt();
        if (p % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
