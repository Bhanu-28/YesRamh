package leetcode.practice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        String name = "rattar";
        int start = 0;
        int end = name.length()-1;
        boolean isPtr = true;
        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){
                isPtr=false;
                break;
            }
            start++;
            end--;
        }
        if(isPtr){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
