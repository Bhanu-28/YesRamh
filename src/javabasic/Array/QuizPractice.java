package javabasic.Array;

public class QuizPractice {
    public static void main(String[] args) {
   char chars[]={'a','b','c'};
   int arr[] ={65,66,67,68,69 };
   String s = new String(arr,1,2);
        System.out.println(s);

        float f1[],f2[];
        f1 = new float[10];
        f2=f1;
        f1[0]=1;
        f2[1]=2;
        System.out.println(f1[0]);
        System.out.println(f2[0]);
        System.out.println(f1[1]);
        System.out.println(f1[1]);
        if(f1==f2){
            System.out.println("yes");
        }

        else
        {System.out.println("no");}
byte a = 126;//-128 to 127
        a++;
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
int x =100;
double y = 100.1;
boolean b =(x==y);
        System.out.println(b);

        int[] k ={1,2,3,4};
        

    }
}
