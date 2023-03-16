//{ Driver Code Starts
//Initial Template for Java
package javabasic;
import java.util.Scanner;

class SquarePattern {

    public static void Square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1){
                    System.out.print("*");
                }
                else if(j==0||j==n-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }


// } Driver Code Ends
//User function Template for Java
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Square(n);

}
}