
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcf_lcm;

import java.util.Scanner;


/**
 *This HCF AND LCM CALCULATOR was developed by Mofehintolu O. Mumuni
 * @author Mofehintolu Mumuni
 *
 * 
 */


public class Hcf_lcm {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int one = 1;
     
     
     String get = one == 1?("yeah"):("nah");
        System.out.println(get);
    System.out.println("This HCF AND LCM CALCULATOR was developed by Mofehintolu O. Mumuni");
    //Initialize Scanner class
       Scanner input_type = new Scanner(System.in);
       
    //Get number variable from user
    System.out.println("Enter first value: ");    
    int num1 = input_type.nextInt();
    
     System.out.println("Enter second value: ");    
    int num2 = input_type.nextInt();
   
       
    special_functions my_cal = new special_functions();

    my_cal.get_hcf_and_lcm(num1,num2);
        
        
    }
    
}
