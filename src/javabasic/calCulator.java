package javabasic;

import java.util.Scanner;

public class calCulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the operation required \n1.Addition \n 2.Subtraction \n3.Multiplication");
        int operation = sc.nextInt();
        if (operation != 1 && operation != 2 && operation != 3) {
            System.out.println("invalid operator");
        } else {
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the second number");
            int b = sc.nextInt();
            if (operation == 1) {
                System.out.println(a + b);
            } else if (operation == 2) {
                System.out.println(a - b);
            } else if (operation == 3) {
                System.out.println(a * b);
            }
        }

    }
}
