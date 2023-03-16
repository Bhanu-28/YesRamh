package javabasic.Array;

public class patternMatching {
    public static void main(String[] args) {
        String txt = "fun geeks for geeks space geek";
        String pattern = "geek";
        int pos = txt.indexOf(pattern);
        while(pos>=0){
            System.out.print(pos+" ");
            pos = txt.indexOf(pattern,pos+1);
        }
    }
}
