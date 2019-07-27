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
public class AssignGrades {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: "); // Intial size 
                                                           //  of array
        int students = input.nextInt(),
            best = 0;
       
        
        int[] scores = new int[students];  // declare array with number of
                                          //  students
                                           
        System.out.print("Enter " + students + " scores: ");
        
        for(int i = 0; i < students; i++){  // Initialize scores[] with student
            scores[i] = input.nextInt();   //  score and save the highest in 
            if(best < scores[i])          //   best
              best = scores[i];
            
        }
        char grade;
        for(int i =0; i < scores.length; i ++){   // compare scores[] with
            if(scores[i] >= best - 10)           //  condition and assign grade
                grade = 'A';
            else if(scores[i] >= best - 20)
                grade = 'B';
            else if(scores[i] >= best - 30)
                grade = 'C';
            else if(scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }       
    }
}
