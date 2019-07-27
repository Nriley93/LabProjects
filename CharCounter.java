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
public class CharCounter {
    public static void main(String[] args){
        
        //creates Scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string:");
        String str = input.nextLine();      //saves user string input in str
        
        System.out.print("Enter a character:");
        char a = input.next().charAt(0);    //Saves user character input in a
        
        System.out.println(a + 
                " occurs " + 
                count(str,a) +  // invokes count method 
                " times in the string");
       
    }
     
    public static int count(String str, char a){
            
        int count = 0;
            
        for(int i = 0; i < str.length(); i++)
            if(a == str.charAt(i))  // when character == iteration
                count++;           // Counts character occurrence
            
        return count;
        }
}
