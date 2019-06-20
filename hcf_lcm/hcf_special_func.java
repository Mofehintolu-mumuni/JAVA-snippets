/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcf_lcm;

/**
 *
 * @author Mofehintolu Mumuni
 *
 * 6267
 */

public class special_functions {
    
         public boolean check_primes(int value)
    {
        if((value < 0) || (value == 1) || (value == 2) || (value == 3)){
            
            return true;
            
        }else{
            
        int half_value = value/2;
        
        int count = 0;
        
        int p = 2;
        if(half_value == p)
        {
            return false;
        }
        else{
             for(int $x=p;$x<(half_value);$x++)
        {
            if(value%$x == 0)
            {
                count++;
            }
            else{
                count = count;
            }
        }
        if(count>0)
        {
            return false;
            //echo$value." is not a prime number";
        }
        else{
            return true;
            //echo$value." is a prime number";
        }
        }
        
            
        }
        
   
    }
    
//check_primes($numb1);

    public int get_highest_numb(int fnumb,int snumb)
    {
    if(fnumb>snumb)
    {
        return fnumb;
    }
    else{
        return snumb;
    }
    }
    
    public int get_lowest_numb(int val1,int val2)
    {
       if(val1<val2)
    {
        return val1;
    }
    else{
        return val2;
    }  
    }
    
 
   public int continuos_division(int val1,int val2,int divisor,int multiply)
    {
        
        multiply =  multiply;
           //$count = 1;     
       //while($divisor>1)
        //{
            if(divisor == 1)
            {
                return multiply;
            }
            
            if((val1%divisor ==0)&&(val2%divisor ==0))
           {
           int temp1 = val1/divisor;
           int temp2 = val2/divisor;
           
           multiply =  multiply*divisor;
           
           //$count += 1;
           
           //return $count;
           
           return this.continuos_division(temp1,temp2,divisor,multiply);          
                      
           }
           else{
            
            return this.get_hcf(val1,val2,multiply);
            
           
           }

       //}
        
        
    }

    
    
    
    
    
    //echo(get_hcf(1731,53));
    
  
    
     public int get_divisor(int val1,int val2)
    {
        int divisor =0;
        int low_numb = this.get_lowest_numb(val1,val2);
        int high_numb = this.get_highest_numb(val1,val2); 
        
        if(low_numb ==1)
        {
            divisor = 1;
            return divisor;
           
        }
        
        int half_low = low_numb/2;
        
        int half_high = high_numb/2;
        
        
        
        int count = 0;
        for(int x=2;x<=Math.floor(half_low);x++)
        {
            if((high_numb%x == 0) && (low_numb%x == 0))
            {
                divisor = x;
                
               count++;
            }
           
            
        }
        if(count<=0)
        {
            divisor = 0;
        }
        
       return divisor;
    }
    
    
    
       public int get_hcf(int val1,int val2,int multiply)
       {
               int low_numb;
               int high_numb; 
               int hcf = 1;
               int divisor;
        if((val1 ==1)||(val2==1))
        {
            low_numb = this.get_lowest_numb(val1,val2);
            high_numb = this.get_highest_numb(val1,val2);
            hcf = low_numb*multiply;
                return hcf;
              
        }
        
         if(val1 == val2)
        {
            
           hcf = val2;
                return hcf;
               
        }
        
        boolean prime_checker1 = this.check_primes(val1);
        boolean prime_checker2 = this.check_primes(val2);
        
        boolean isPrime = false;
        
        if((prime_checker1 == true) || (prime_checker2 == true))
        {
         isPrime = true;   
        }
       // else{
       //     $isPrime = false;
       // }
        
        if((prime_checker1 != true) && (prime_checker2 != true))
        {
         isPrime = false; 
        }
       // else{
       //     $isPrime = true;
        //}
        
        if(isPrime == true)
        {
            low_numb = this.get_lowest_numb(val1,val2);
            high_numb = this.get_highest_numb(val1,val2);
           
            if((low_numb*2) <= high_numb)
            {
                 if((val1%low_numb == 0) && (val2%low_numb == 0))
            {
                hcf = low_numb*multiply;
                return hcf;
                
            }
             else{
                hcf = multiply*1;
               
                
            }
            
                
            }
            else if((low_numb*2) > (high_numb)){
             
                hcf = 1*multiply;
                
            }
            
            if(low_numb == high_numb)
            {
                hcf = low_numb*multiply;
                
            }
              
        }    
        
        
        else if(isPrime == false)
        {
           divisor = this.get_divisor(val1,val2);
           
        if(divisor == 0)
        {
            hcf = multiply;
           
        }
        else
        {
          hcf = this.continuos_division(val1,val2,divisor,multiply);
           
           
        }
           
           
                      
            
        }
            
        return hcf;
    }
    
    //$hcf = get_hcf($val1,$val2);
    
    public long get_lcm(long val1,long val2,long hcf)
    {   
        long div = hcf;
        long divide  = (val1*val2)/div;
  
        long lcm = divide;
        return lcm;
        
    }
   
   public void get_hcf_and_lcm(int num1,int num2)
   {
    int multiply = 1;
    int hcf = 1;
    //HCF
   hcf = this.get_hcf(num1,num2,multiply);
    System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
   
   
    //LCM
   long lcm = this.get_lcm(num1,num2,hcf);
   System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
   }
    
}
