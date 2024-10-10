/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class activityforloop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[] grades = new double[5];
        String[] subjects = {"ITC", "FoP", "PurCom", "UTS", "Rph"};
        
        System.out.print("Please enter the grades of the following subjects: ");
        
        for(int i = 0; i < subjects.length; i++){
            //System.out.print(subjects[i] + " : ");
            //grades[i] = input.nextDouble();
            double grade;
            do{
                System.out.print(subjects[i] + " : " );
                while(!input.hasNextDouble()){
                    System.out.print("Invalid input!\n");
                    input.next();
                    
                }
                grade = input.nextDouble();
                if(grade < 0 || grade > 100){
                    
                }
            }while(grade < 0 || grade > 100);
            grades[i] = grade;
            
            
            
            
            
            
        
        }
        System.out.println("\nGrades of the subject:");
               for(int i = 0; i < subjects.length; i++){
                   System.out.println(subjects[i] + " : " + grades[i]);
                
              
               }
               int totalgrades = 0;
               for(int i = 0; i < grades.length; i++){
                   totalgrades += grades[i];
               }
            
               double ave = (double)totalgrades / grades.length;
               
               
               System.out.println("The average grade is:" + ave);
               
               
               
               System.out.println("\nGrade Classification");
               for(int i = 0; i < grades.length; i++){
                   char gradesClassification;
                   
                   
               }
               }
               
               input.close();
               
               
            }
    }
    

