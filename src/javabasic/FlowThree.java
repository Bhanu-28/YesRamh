package javabasic;

import java.util.Scanner;

public class FlowThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.print("positive ");
            if (number % 2 == 0) {
                System.out.print("Even");
                return;
            }

            System.out.print("odd");
        } else if (number < 0) {
            System.out.print("Negative ");
            if (number % 2 == 0) {
                System.out.print("Even\n");
                return;
            }

            System.out.print("odd");
        } else if (number == 0) {
            System.out.println("Zero");
        }

    }
}
