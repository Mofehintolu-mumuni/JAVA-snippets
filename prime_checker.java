
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Mofehintolu Mumuni
 */
public class prime_checker {
    	
	public static void genPrime(int upperLimit){
        ArrayList<Integer> primes = new ArrayList<>();
        
        for(int i = 0; i<=upperLimit; i++){
            boolean isPrime = true;
            int j = 3;
            if(i <= 0 || i == 1){
                isPrime = false;
                continue;
            } else if(i == 2 || i == 3 || i == 5){
                primes.add(i);
                isPrime = false;
                continue;
            } else {
                char k = Integer.valueOf(i).toString().charAt(Integer.valueOf(i).toString().length() -1);
                
                switch(k){
                    case '0': case '2': case '4': case '5': case '6':
                    case '8': isPrime = false;
                        }
                if(!isPrime){
                    continue;
                } else {
                    while(j<=(i/2)){
                            if(i%j == 0){
                                isPrime = false;
                                break;
                            }
                            j++;
                }
                        
            }
            
                if(isPrime){
                    System.out.println(i);
                }
            }
        
        
        
    }
        //return primes;
}
}
