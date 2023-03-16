package javabasic.Array;

import java.util.Scanner;

public class sumArray {
    static int sum(int[] sys){
        int sum=0;
        for(int i=0;i<sys.length;i++){
            sum +=sys[i];

        }
        return  sum;
    }
    public static void main(String[] args) {
        int[] arr ={10,2,3,40,50,60};
        Scanner sc = new Scanner(System.in);
        int[] sys;
        int size = sc.nextInt();
        sys = new int[size];
        for(int i=0;i<size;i++){
            sys[i]=sc.nextInt();
        }

        System.out.println(sum(sys));
    }
}
