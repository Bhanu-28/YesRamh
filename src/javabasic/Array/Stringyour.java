package javabasic.Array;

import java.util.Locale;

public class Stringyour {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String str2 = "for";
//        after g h cames so negative
//        before g f came so positive lexographical

        String str3 = new String("geeksforgeeks");
        System.out.println(str.indexOf(str2,5));//int
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1));
        System.out.println(str.substring(2,7));
        System.out.println(str.contains(str2));//boolean
        System.out.println(str.equals(str3));//boolean
        System.out.println(str.compareTo(str3));//int lexographical

        String s6 = "geeks";
        String s7 = s6;
        s6 = s6+"forgeeks"; //creates new object
        System.out.println(s6);
        System.out.println(s7);
        if(s6==s7){
            System.out.println("yeah");
        }
        else System.out.println("differ");




    }

}
