package javabasic;
import java.util.Scanner;

public class FirstDigitTwo {
    public static int FirstDiogit(int a ){
        double power = Math.log10(a);
        int Typecast = (int) power;
        int ans =(int) Math.pow(10,Typecast);
        int finale = a/ans;
        return finale;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(FirstDiogit(a));

    }
}
