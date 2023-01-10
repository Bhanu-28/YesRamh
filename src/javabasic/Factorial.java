package javabasic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(num>0){
          i=i*num;
          num--;
        }
        System.out.println(i);
    }
}
