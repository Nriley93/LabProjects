/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminglabprojects.myprogramminglabprojects;
import java.util.*;
/**
 *
 * @author Nickolas
 */
public class Compute_Bmi {
    public static void main(String[] args){
        
        // Input weight from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double pounds = input.nextDouble();
        
        // compute kilograms
        double kilograms = pounds * 0.45359237;
        
        // Input height from user 
        System.out.print("Enter your height in inches: ");
        double inches = input.nextDouble();
        
        // compute meters
        double meters = inches * 0.0254;
        
        // Compute BMI
        double bmi = kilograms / Math.pow( meters, 2 );
        
        // short hand
        double shortHand = pounds * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        
        // output
        System.out.println("BMI is " + (int)(bmi * 10000) / 10000.0);
        System.out.println("Short hand version: " + (int)(shortHand * 10000) / 10000.0);
        System.out.printf("Heres something new: %5.2f\n", bmi);
    }
}
