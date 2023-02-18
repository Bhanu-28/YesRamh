package javabasic;

import java.util.Scanner;

public class yesRaamh {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//int x = Math.max(a,b);
//int y = a*b;
//int ans=x;
//for(int i=x;i<=y;i++){
//    if(i%a==0&&i%b==0){
//        ans=i;
//        break;
//    }
//
//}
//        System.out.println(ans);

int a = sc.nextInt();
int b = sc.nextInt();
int min = Math.min(a,b);
int ans = 1;
for(int i=1;i<=min;i++){
    if(a%i==0&&b%i==0){
        ans=i;
    }
}
        System.out.println(ans);

    }
}
