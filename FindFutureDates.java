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
public class FindFutureDates {
    public static void main(String[] args){
        
        // Enter int for day of the week: Sunday(0) - Saturday(6)
        System.out.print("Enter today's day:");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        
        // Enter int for a future date .eg.. 53
        System.out.print("Enter the number of days elapsed since today:");
        int futureDay = input.nextInt();
        
        System.out.print("Today is ");
        
        // Current day
        switch(day){
            case 0: System.out.print("Sunday ");break;
            case 1: System.out.print("Monday ");break;
            case 2: System.out.print("Tuesday ");break;
            case 3: System.out.print("Wendsday ");break;
            case 4: System.out.print("Thursday ");break;
            case 5: System.out.print("Friday ");break;
            case 6: System.out.print("Saturday ");break;
            default:  System.out.print(" an invalid starting day. Today's day must be 0-6. ");
        }
        
        System.out.print("and the future day is ");
        
        // future day
        switch((futureDay + day) % 7){
            case 0: System.out.print("Sunday");break;
            case 1: System.out.print("Monday");break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday");break;
            case 4: System.out.print("Thursday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
            default: System.out.print("**Invalid Answer**");
        }
        
    }
}
