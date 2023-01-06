package javabasic;

import java.io.PrintStream;
import java.util.Scanner;

public class FlowFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans1 = Math.max(a, b);
        int answer = Math.max(ans1, c);
        PrintStream var10000 = System.out;
        int var10001 = Math.max(ans1, answer);
        var10000.println("max number is " + var10001);
    }
}
