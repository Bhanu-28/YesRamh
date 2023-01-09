package javabasic;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int no_of_rows = sc.nextInt();
        while(i<=no_of_rows){
            int j=1;
            while(j<=(no_of_rows-i)){
                System.out.print(" ");
                j++;
            }
            int k =1;
            while (k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();

        }
    }
}
