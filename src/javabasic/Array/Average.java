package javabasic.Array;
import java.util.Scanner;

public class Average {
    static double average(int[] a){
        int sum = 0;
        double mean;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
        }
        mean = (double)sum/a.length;
        return mean;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.printf("%.2f%n",average(a));

    }
}
