import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TypeCasting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Item Price: ");
        double IP = sc.nextDouble();
        
        System.out.print(" Enter the Quantity Sold ");
        int quan = sc.nextInt();
        
        int IPI =(int)Math.round(IP);
        int result = IPI * quan;
        
        System.out.println("Total Revenue: " + result);
    }
    
}
