package javabasic.Array;

public class binToDec {
    public static void main(String[] args) {
        String bin = "10001";
        int s =1;//1*2=2 ;2*2=4; 4*2=8;8*2=16;
        int m =0;
        for(int i=bin.length()-1;i>=0;i--){
            m+=(bin.charAt(i)-'0')*s;
            s=s*2;
        }
        System.out.print(m);

    }
}
