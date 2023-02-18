package javabasic;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //naive solution
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }







//        //efficient solution
//        for(int i=1;i*i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//                if(i!=n/i){
//                    System.out.println(n/i);
//                }
//            }
//        }


//        efficient solution 2
        int i;  ///15 as n input 
    for( i=1;i*i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
    for(;i>=1;i--){
        if(n%i==0){
            System.out.println(n/i);
        }
    }


    }

}
