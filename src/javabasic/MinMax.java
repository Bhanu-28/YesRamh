package javabasic;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrray");
        int size = sc.nextInt();
        System.out.println("enter the elements");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
//        int min = Collections.min(Arrays.asList(array[i]));
//        int max = Collections.max(Arrays.asList(array[i]));
        int min = IntStream.of(array).min().getAsInt();
        int max = IntStream.of(array).max().getAsInt();

        System.out.println(min);
        System.out.println(max);


    }
}