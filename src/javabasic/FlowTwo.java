package javabasic;

import java.util.Scanner;

public class FlowTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("error");
        } else {
            System.out.println(n * (n + 1));
        }

    }
}
