package javabasic.Array;
import java.util.Scanner;

public class arraySorted {
    static boolean Sort(int[] a,int n){
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();;

        }
        boolean ans = Sort(a,n);
        if(ans==true){
            System.out.println("sorted");
        }
        else  {
            System.out.println("not sorted");
        }


    }
}
