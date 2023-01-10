package javabasic;

public class PyramidPractice {
    public static void main(String[] args) {
        //right-angled triangle
//        int n=5;
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print("*");
//                j++;
//            }
//            int k=1;
//            while(k<=n-i){
//                System.out.print(" ");
//                k++;
//
//            }
//            i++;
//            System.out.println();
//        }

        //inverted right angle triangle
//       1 2 3 4 5
//         2 3 4 5
//           3 4 5
//             4 5
//               5

//int n=5;
//int i =1;
//while(i<=n){
//    int j=1;
//    while(j<i){
//        System.out.print(" ");
//        j++;
//    }
//int k = i;
//   while(k<=n){
//        System.out.print("*");
//        k++;
//    }
//    System.out.println();
//    i++;
//}

        int n =5;
        int i = 1;
        while(i<=n){
            int j=1;
            while (j<=(n+1)-i){
                System.out.print("*");
                j++;
            }
            int k=1;
            while(k<=i-1){
                System.out.print(" ");
                k++;
            }

            System.out.println();
            i++;
        }





    }
}
