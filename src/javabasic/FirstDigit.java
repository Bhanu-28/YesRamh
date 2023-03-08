package javabasic;
import java.util.Scanner;

public class FirstDigit {
    public static int FirstDig(int x){
        while(x>10){
            x=x/10;
        }
        return x;
    }
    public static void main(String[] args){
        Scanner first =  new Scanner(System.in);
        int x = first.nextInt();
        System.out.println(FirstDig(x));
    }
}
