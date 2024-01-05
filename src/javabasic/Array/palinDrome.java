package javabasic.Array;

import java.util.Scanner;

public class palinDrome {
    //input :abba Yes abcba Yes geek No abA No
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start =0;
        int end = s.length()-1;
        boolean isptr = true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                isptr =false;
                break;
            }
            start++;
            end--;
        }
        if(isptr){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
