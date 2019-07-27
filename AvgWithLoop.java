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
import java.util.*;
public class AvgWithLoop {
    public static void main(String[] args){
        // User enters an int value (-44 -33 -12 15 89 45 113 117 45 0)
        Scanner input = new Scanner(System.in);
        
        int data,
            positive = 0,
            negative = 0;
        double total = 0.0,
               average;
        System.out.print("Enter an integer, the input ends if it is 0:");
        
        
        do {
            data = input.nextInt();
            
            if(data > 0)
                positive++;
            if(data < 0)
                negative++;
            int count = positive + negative;
            
            total += data;
            average = total / count;
            
        } while(data != 0);
        
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.printf("The average is %5.2f",average);
    }

}
