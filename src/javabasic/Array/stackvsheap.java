package javabasic.Array;
class Calculator{
    int num = 5;
    public static int add(int n1,int n2){
        return n1+n2;
    }
}
public class stackvsheap {
    public static void main(String[] args) {
Calculator obj = new Calculator();
Calculator obj2 = new Calculator();
int n1 = 10;
int n2 = 20;
int r = Calculator.add(n1,n2);
obj.num=8;
        System.out.println(obj.num);
        System.out.println(obj2.num);
System.out.println(r);
    }
}
