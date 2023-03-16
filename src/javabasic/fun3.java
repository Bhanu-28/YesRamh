package javabasic;

class Point{
    int x,y;
}

public class fun3 {
    //since they are references they both are referring to same object
    //changes reflected in same object
    public static void main(String[] args) {
        Point p = new Point();
        p.x=5;
        p.y=10;
        funfact(p);
        System.out.println(p.x+" "+p.y);

    }
    public static void funfact(Point p){
        p.x=10;
p.y=10; }
}
