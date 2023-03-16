package javabasic.Array;

public class input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[2]);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int j =1;
        int k=j++;
        System.out.println(j);
        System.out.println(k);
    }
}
