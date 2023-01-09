package javabasic;

import java.util.Scanner;

public class TableOfaNumber {

    public static void main(String[] args) {
        //using while loop writng a table of a number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter which table u need");
//        int table_number = sc.nextInt();
//        int table_members = sc.nextInt();
//        int i=1;
//        while(i<11){
//            System.out.println(i*table_number);
//            i +=1;
//        }
       // using for loop for writing a table of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which table u need");
        int table_number = sc.nextInt();
        System.out.println("enter how many  table members u need");
        int table_members = sc.nextInt();
        for(int i=1;i<=table_members;i++){
            System.out.println(i*table_number);
        }
    }

}
