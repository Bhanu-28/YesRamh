package javabasic;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans =1;//stores highest dividing value
        int z = Math.min(x,y);//stores min value in x&y
        for(int i=1;i<=z;i++){
            if(x%i==0&&y%i==0){
                ans=i;
            }

        }
        System.out.println(ans);

    }
}
