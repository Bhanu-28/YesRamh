package javabasic.Array;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String b = "";
        int ptr = s.length()-1;
        while(ptr>=0){
            b=b+s.charAt(ptr);
            ptr--;
        }
        System.out.print(b);
    }
}
