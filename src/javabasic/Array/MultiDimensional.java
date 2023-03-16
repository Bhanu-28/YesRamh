package javabasic.Array;

public class MultiDimensional {
    public static void main(String[] args) {
        int a[][]={{1,2,3,9,10,12},{4,5,6},{5,6,7,50}};
        for(int i=0;i<a.length;i++){//how many rows
            for(int j=0;j<a[i].length;j++){//how many columns individual rows have
//                a[i][j]=i;
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println(a[0][0]);
    }
}
