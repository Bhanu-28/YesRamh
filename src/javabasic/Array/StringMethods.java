package javabasic.Array;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s3 = "geeksopgeeks";
        StringBuilder s2 =new StringBuilder("forgeeks");
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf("k"));//string char can be given input
        System.out.println(s2.indexOf(s1));
        System.out.println(s3.lastIndexOf(s1));
        System.out.println(s3.compareTo(s1));
        System.out.println(s3.substring(7));
        System.out.println(s3.substring(7,11));
        System.out.println(s1.chars());

//        new methods
        StringBuilder ab1 = new StringBuilder("Bhanu"+" ");
         ab1.append("Pradeep");
        System.out.println(ab1);
        ab1.insert(1,"p");
        System.out.println(ab1);
        ab1.setCharAt(1,'h');
        System.out.println(ab1);
        ab1.reverse();
        System.out.println(ab1);
        ab1.delete(0,3);
        System.out.println(ab1);
        ab1.deleteCharAt(8);
        System.out.println(ab1);
        System.out.println(ab1.capacity());
        ab1.replace(5,8,"yes");
        System.out.println(ab1);
    }
}
