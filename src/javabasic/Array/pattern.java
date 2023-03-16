package javabasic.Array;

public class pattern {
    public static void main(String[] args) {
        int m = 3;
        int a[][] = new int[m][];
        for(int i=0;i<a.length;i++){
            a[i]=new int[i+1];
            for(int j=0;j<a[i].length;j++){
                a[i][j]=i;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
