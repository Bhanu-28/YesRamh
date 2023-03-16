package javabasic.Array;

public class meanStdDev{
    public static void main(String[] args){
        int[] marks ={45,84,24,90,100};
        int sum = 0,sumSq=0;
        double mean,stdDev;

//        for(int i=0;i<marks.length;++i){
//            sum+=marks[i];
//            sumSq+=marks[i]*marks[i];
//        }
        //enhanced for loop
        for(int item:marks){
            sum+=item;
            sumSq+=item*item;
        }
        mean = (double)sum/marks.length;
        stdDev =  Math.sqrt((double)sumSq/ marks.length-mean*mean);

        System.out.printf("Mean is %.2f%n",mean);
        System.out.printf("Standard Deviation is %.2f%n",stdDev);

    }
}


