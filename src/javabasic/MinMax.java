package javabasic;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        int min = IntStream.of(array).min().getAsInt();
        int max = IntStream.of(array).max().getAsInt();
        System.out.println(min);
        System.out.println(max);

    }
}