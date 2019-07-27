/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminglabprojects.myprogramminglabprojects;

/**
 *
 * @author Nickolas
 */
//import java.util.*;
//import static javax.management.Query.lt;
public class Test1 {
    public static void main(String[] args) {
         
        Math.pow(2,4);
        
//        int[] a = {1,2,3,4,5,6};
////        int[] n = {1,2,3};
////        n = a;
////        a[0] = 0;a[1] = 1; a[2] = 2;
//        for(int i = a.length-2;i>=0;i--){
//            a[i + 1] = a[i];
//        }
//        for(int e : a){
//        System.out.print(e + " ");}
//        double[] array = {1, 5, 5, 5, 5, 1};
//        double max = array[0];
//        int index = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] >= max){
//                max = array[i];
//                index = i;
//            }
//        }
//        System.out.print(array.length);
    
        
//        int[][] array = {
//            {1,2,3,4},
//            {1,2,3,4},
//            {1,2,3,4},
//            {1,2,3,4}
//        };
//        int total = 0;
//        for(int row = 0; row < array.length; row++){
//            for(int col = 0; col < array[row].length; col++){
//                total = array[0][0];
////                System.out.println(total);
//            }
////            System.out.println(total);
//        }
//        
//        System.out.print(total);

        
        
        
        
        /**
 *
 * @author Nickolas Locker puzzle
 */
//pulic class LockerPuzzle {     
//    public static void main(String[] args){
//        
//     int lockers = 0;
//
//    for(boolean n : lockersSquared(100)){
//        if(n)
//            System.out.println("Locker " + lockers + " is open");
//        lockers++;
//    }
////       for(boolean n : lockersSquared(100)){    // Shows how the entire boolean
////            System.out.print(n);                // array has been affected
////            if(n == true)   // Comment first print statement to test
////                System.out.println(" open");
////            if(n == false)
////                System.out.println(" closed");   
////       }
//    }
//    public static boolean[] lockersSquared(int value){
//        value++;
//        boolean[] array = new boolean[value];
//
//        for(int i = 1; i <= value / i ; i++){
//            array[i * i] = true;              // Squared lockers are now open
//        }
//        return array;
//    }
//}
        
        
        
        
        
        
        
//   int n = 0;
//   int[][] a = {
//       {1, 2, 0}, {3, -4}, {-5, 6, -7, 8, 9}, {-10, 0, -11, 12}
//   };
//        for (int[] a1 : a) {
//            for (int column = 0; column < a1.length; column++) {
//                if (a1[column] > 0) {
//                    n++;
//                }
//            }
//        }
//   System.out.println(n);
//   System.out.print(n);
        
        
        
//    int[][] a = new int[15][2];
//       boolean s = true;
//for (int i = 1; i < a.length && s; i++){ 
//    if (a[i].length != a[0].length)
//        s = false;
//}
//System.out.print(s);
        
        
        
        
//    int n = 0;          //Total index of two dimensional array
//    int[][] a = new int[3][4];
//    
//        for (int[] a2 : a) {
//            n += a2.length;
//        }
//System.out.println(n);

    }
    
  

//    public static double sumMajorDiagonal(double[][] m){
//        int[][] array = {
//            {1,2,3,4},
//            {1,2,3,4},
//            {1,2,3,4},
//            {1,2,3,4}
//        };
//        int total = 0;
//        for(int[] a : array){
//            for(int col = 0; col < a.length; col++){
//                total += a[col];
//            }
//        }
//        
//        System.out.print(total);
//        
//        return 10000;
//    }



    
//      /**
//     * @param args the command line arguments
//     * Function is called upon program execution. Creates a variable
//     * to count the index,takes a list of booleans, and proceeds to
//     * iterate over them to find what lockers are open.
//     */
//    public static void main(String[] args) {
//        int index = 0;
//        for(boolean bool : openedLockers(100+1)){
//            if (bool){
//                System.out.println("Locker " + index + " is open");
//            }
//            index += 1;
//        }
//    }
//    /**
//     *
//     * @param num the number of lockers to analyze
//     * @return boolean array of locker status (true for open, and false
//     * for closed).
//     */
//    public static boolean[] openedLockers(int num){
//
//        boolean[] lockerList = new boolean[num];
//
//        for (int n = 1; n <= num / n; n++){
//
//            lockerList[n*n] = true;
//        }
//        return lockerList;
//    }
//}
    
    
 
    
    
    
    
    
//    public static void main(String[] args) {
        
        
     
        
//        int i = 0;
//        int odd = 0;
//        boolean[] n = new boolean[100];
////        for(boolean value : n){
////            System.out.println(value);
//            
////            for(int i = 0; i < n.length; i++){
//            for(boolean value : n){
//                i++;
//                if((i & 1) != 0){    // Tests integers for odds
//                odd += i;
////                n[odd] = true;
////                if(odd < 100){
//                    n[odd] = true;
//                    System.out.print(n[odd]);
//                    System.out.println(odd);
////                }
//        }
//            }   
//        
//        
//    }

//    boolean[] lockers = new boolean[100];
//
//    for (int student = 1; student <= 100; student++) {
//        shuffle(lockers, student);
//    }
//    display(lockers);
//}
//
//public static void shuffle(boolean[] lockersOpenState, int start) {
//
//    int nextLocker = start;
//    for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
//        lockersOpenState[i] = !lockersOpenState[i];
//
//    }
//}
//
//public static void display(boolean[] lockers) {
//
//    int lockerCount = 0;
//    for (int i = 0; i < lockers.length; i++) {
//
//        if (lockers[i]) {
//            System.out.printf("L%d ", i + 1);
//            lockerCount++;
//            if (lockerCount % 10 == 0)
//                System.out.println("");
//        }
//    }
//}

//    public static void main(String[] args){
//        
//        int duplicates = 0;
////        int memberID = 112;
//        int[] list = {1, 1, 1, 1, 1, 1};
//        
//        for(int k = 0; k < list.length - 1; k++){
//            if(list[k] == list[k + 1])
//                duplicates++;
//        }
//        
//        System.out.print(duplicates);
//        
//        
//        
//        
//        
//        
//        for(int k = 0; k < currentMembers.length; k++){
//                if(memberID == currentMembers[k])
//                    isAMember = true;
//            }
//        
//        System.out.print(isAMember);
        
        
//        int[] temps = {2, 4, 4, 2};
////        
////        for(double i : temps){          // For each loop
////            System.out.println(i);
////        }
//        
//        
//        int total = 0,
//            avg = 0;
//        for(int i = 0; i < temps.length; i++){
//            total += temps[i];
//            avg = total / temps.length;
            
//            System.out.println(i);
//            System.out.println(total);
//            System.out.println(avg);
//        }
//        System.out.println(avg);
        
            
//       for(double tuition = 10000; tuition  20000; tuition *= 1.07){
//           int count = 0;
//           count++;
//           System.out.println(tuition + " " + count);
//       }
                         
        
//        System.out.print();
//    }
//}

}


