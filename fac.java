
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* @author Mofehintolu Mumuni
*
 */
package assessment;


import java.util.Scanner;

public class Assessment {

    public static Integer myNumber = 0;
   
    public static Integer rsdPow = 0;
    
    public static int get_factorial(int number)
    {
    if(number<=2)
    {
    return number;
    }
    else
    {
    return (number*(get_factorial(number-1)));
    }
    
    }
    

    
   public static int mathPow(Integer val,Integer pow){  
        /*
        1) If a negative value is entered into this method as either the
         1st or 2nd parameter the method should return an integer
         with a value of zero.
         
        2) Update the if logic to handle a situation where if the val parameter
         entered is zero, it should return an integer value of 0
         
        3) Using a loop, multiply the parameter val (with itself) by the number of 
       times stated in pow. The final value in val should be assigned to res and
       returned. This is where the code implementation should end.
       */
  
            int res = 0;
            
            if((val<=0) || (pow<=0))
            {
                if(pow ==0)
                {
                return 1;
                }
                else{
                return res;
                }
             
             
            
            }else{
           /* 
            For LOOP IMPLEMENTATION
            int store = 1;
             //val = val;
            for(int d = 0; d<pow; d++)
            {
            //val *= val;
            store = store*val;
            
            if(d == (pow-1))
            {
            res = store;
            
            return res;
            }
            
            }
            
             */
                
                //int get = floor(numbe);
     
            //WHILE LOOP IMPLEMENTATION
            
            int mult = val;
            int count = 1;
            while(count < pow)
            {
            if(pow == 1)
            {
            return val;
          
            }
            
            val *= mult;
            count++;

            }
  
            }

            
            return val;
        } 
   
   public static boolean isPrime(Integer posPrm)
   {
   boolean isPrime = true;
      
   
   return isPrime;
   }

    public static void main(String[] args) {
        // TODO code application logic here
        
       int get_pow = mathPow(4,0);
       
       System.out.println(get_pow);
       
       //Initialize Scanner class
       Scanner input_type = new Scanner(System.in);
       
       //Get number variable from user
       System.out.println("Enter a number to get it's factorial: ");
       
       //Parse User input to number variable
       int number = input_type.nextInt();
       
       //Print out the Factorial of the number
       System.out.println(get_factorial(number));
       
        
    }
    
}
