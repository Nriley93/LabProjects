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
public class FeetToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
	
        //feet to meters
        double meters = feet / 3.2786885;
        
        //display results
        System.out.println(feet + " feet is " + (int)(meters * 100000) / 100000.0 + " meters");
	
	}
}

