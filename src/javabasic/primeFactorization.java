package javabasic;
import java.util.Scanner;
public class primeFactorization {
    public static boolean isPrime(int N){
        for(int i=2;i<N;i++){

            if(N%i==0){
                return false;
            }
        }
        return true;

    }
    public static void primeFactors(int N){
        for(int i=2;i<N;i++){
            if(isPrime(i)){
                int x = i ;
             while(N%x==0){
                System.out.println(i);
                x = x*i;
            }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        primeFactors(N);
    }
}
