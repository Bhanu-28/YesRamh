package javabasic;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = Math.max(a,b);
        int y = a*b;
        int ans = x;
        for(int i =x;i<=y;i++){
            if(i%a==0&&i%b==0){
            ans =i;
            break;
            }
        }
        System.out.print(ans);
    }
}
