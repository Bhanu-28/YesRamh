package javabasic;
import java.util.Scanner;

public class fibThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        int b = a;
        int next = 0;
        System.out.print(a + " " + b + " ");
        while (next <= 200) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
