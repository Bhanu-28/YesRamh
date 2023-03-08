package javabasic;

import java.util.Scanner;

public class FlowFour {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {

            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;

            default:
                System.out.println("invalid");
        }
//from java 7 onwards we can take  string as part of switch cases lang like c++ and c
// simple logic if else or switch is //if we have single variable on which have multiple branches u can use switch
//        when different conditions not on single variable then use if else
//        if(c=='L')
//            x--;
//        else if(c=='R')
//            x++;
//        else if(c=='U')
//            y++;
//        else if(c=='D')
//            y--;
//        else System.out.println("invalid");
        System.out.println("" + x + " " + y);
    }
}
