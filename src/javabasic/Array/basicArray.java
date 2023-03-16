package javabasic.Array;

public class basicArray {
    public static void main(String[] args){
        int[] a;
        a = new int[3];
        a[0] =10;
        a[1]=20;
        a[2]=30;
        System.out.println(a[0]);
        System.out.println(a[2]);
        a[2]=50;
        System.out.println(a[2]);
        int[] b = new int[3];
        int[] c = {10,20,60,40};
        System.out.println(c[2]);
        System.out.println(c.length);
    }
}
