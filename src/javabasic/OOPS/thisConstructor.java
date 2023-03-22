package javabasic.OOPS;

public class thisConstructor {
    public static void main(String[] args) {
        Bhanu b1 = new Bhanu(24,28);
        Bhanu b2 = new Bhanu(26,30);
        System.out.println(b1.x);


    }
}
class Bhanu{
    int x,y;
    Bhanu(int x,int y){
        this.x=x;
        this.y=y;
    }
    //start fri
    Bhanu(){
        this(10,10);
    }

}