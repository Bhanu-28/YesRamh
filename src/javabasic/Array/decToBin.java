package javabasic.Array;

public class decToBin {
    public static void main(String[]args){
        int n =18;
        String s ="";
        while(n>0){
            s =(n%2)+s;
            n=n/2;
        }
        System.out.print(s);

    }
}
