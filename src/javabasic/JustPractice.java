package javabasic;
public class JustPractice{
    public static boolean isPrime(int N){
        for(int i=2;i<N;i++){
            if(N%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){


    }
}