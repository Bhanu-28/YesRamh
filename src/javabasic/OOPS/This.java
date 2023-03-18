package javabasic.OOPS;

class Point{
    int x,y;
//    Point(int a,int b){
//        x=a;
//        y=b;
//    }
    Point(int x,int y){
        this.x = x;
        this.y=y;
    }
    Point setX(int x){
this.x=x;
return this;
    }
    Point setY(int y){
this.y=y;
return this;
    }
//    void print(){
//        System.out.println(x+" "+y);
//    }
}

public class This {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(20,30);
//        p1.print();
//        p2.print();
        p1.setX(2).setY(3);

    }
}
