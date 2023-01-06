package javabasic;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Yes its a leap year by rule1");
        } else if (year % 400 == 0) {
            System.out.println("yes its a leap year by rule2");
        } else {
            System.out.println("No its not leap year ");
        }

    }
}
