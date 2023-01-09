package javabasic;


import java.util.Scanner;

public class FlowFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println(a);
        }
        else if(b>=a&&b>=c)
            System.out.println(b);
        else
            System.out.println(c);
        int ans1 = Math.max(a, b);
        int answer = Math.max(ans1, c);

        System.out.println(answer);
    }
}
