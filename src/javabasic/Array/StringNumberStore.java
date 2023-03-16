package javabasic.Array;

public class StringNumberStore {
    public static void main(String[] args) {

        String s = "12.5318078965478954210";
        StringBuffer s0 = new StringBuffer("Bhanu");
        s0.reverse();
        System.out.println(s0);
        String s2 = "1.689708";
        int pos = s.indexOf('.');
        int pos1 = s2.indexOf('.');
if(pos<0)
{
    System.out.println();
}
else {
    System.out.println(s.substring(pos+1));
    System.out.println(s2.substring(pos1+1));
}


    }


}
