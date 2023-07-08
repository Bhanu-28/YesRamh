package kpitjavacore;

public class ArrayTest {
    public static void main(String[] args){
        int score[] = {10,50,100,150,200};
        int marks[] = new int[6];
        for(int i=0;i<5;i++){
            System.out.println("score :"+score[i]);
        }

        for(int i :score){
            System.out.println("i is :"+i);
        }

        marks[0]=15;
        marks[1]=25;
        marks[2]=30;
        marks[3]=45;
        marks[4]=10;
        for(int i=0;i<marks.length;i++){
            System.out.println("marks :"+marks[i]);
        }
    }
}



