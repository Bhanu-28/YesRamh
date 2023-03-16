package javabasic;

public class fun {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("before function value of x:"+x);
        fun(x);
        System.out.println("after function value of x:"+x);
    }
    //one x in main has 5
    //another x in fun has another 5 at different locations change will be updated to fun local only
    public static void fun(int x){
        x=x+5;// primitive data types referencing to another copy
        System.out.println("inside fun");
        System.out.println(x);
    }
}
