package javabasic;

public class fun2 {
    public static void main(String[] args) {
int x =556;
int y =10;
        System.out.println(getMax(x,y));
    }
    public static int getMax(int x ,int y){
        if(x>y)
            return x;
        else
            return y;
    }
}
