package leetcode.practice;


import java.util.Scanner;

class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x;
        long rev= 0;

        if(x<0) {

            System.out.println("not a palindrome");

        }
        else {
            while (x > 0) {
                rev = (rev * 10) + (x % 10);
                x /= 10;
            }
            if (n == rev) {
                System.out.println("Hurray palindrome " + rev);
            } else {
                System.out.println("its positive but not a palindrome");
            }
        }
    }
}