package javabasic;
import java.util.Scanner;
public class CountDigits {
     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count=0;
//         int num = sc.nextInt();
//         while(num>0){
//             num = num/10;
//             count = count+1;
//
//         }
//         System.out.println(count);


         // now try using for loop for counting digits
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int count;
         for(count=0;n>0;count++)
         {
             n=n/10;

         }
         System.out.println(count);

    }
}
