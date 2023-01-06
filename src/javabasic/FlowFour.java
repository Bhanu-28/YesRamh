package javabasic;

import java.util.Scanner;

public class FlowFour {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case 'D':
                --y;
            default:
                System.out.println("invalid");
                break;
            case 'L':
                --x;
                break;
            case 'R':
                ++x;
                break;
            case 'U':
                ++y;
        }

        System.out.println("" + x + " " + y);
    }
}
