/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ActivityMD03 {
    public static void main(String[] args) {
        int rows = 5;
        
        
        
        //Outer loop
        for (int i=0; i< rows; i++){
            //Leading spaces
            for (int j = 0; j< rows - i- 1; j++){
                System.out.print(" ");
                
                
            }
            for (int k=0; k < (2 * i + 1); k++){
                    System.out.print("*");
                    
                }  
            System.out.println();
        }
    }
}
       