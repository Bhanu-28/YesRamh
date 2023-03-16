package javabasic.Array;

public class MaximumArray {
    public static void main(String[] args) {
        int[] arr = {50,60,70,80};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
