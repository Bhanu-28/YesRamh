package javabasic.Array;

public class builderStringg {
    public static void main(String[] args){
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1.concat("forgeeks");
        if(s1==s2){
            System.out.println("yes");
        }
        else{
        System.out.println("No");}
        System.out.println(s1);
        System.out.println(s2);

        StringBuilder sb1 = new StringBuilder("geeks");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("forgeeks");
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
