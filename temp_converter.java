
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature_converter;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Mofehintolu Mumuni
 */
public class Temperature_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Temperature value in Celsius: ");    
    
        int value = input.nextInt();
        
        temperatureConverter(value);
        
    }
    
    
    public static void temperatureConverter(int value)
    {
        int value_entered = value;
        
        int constant = 32;
        
        int first_calc = (9*value_entered)/5;
        
               
        int second_calc = first_calc + constant;
        
        int Fahrenheit = second_calc;
        
        System.out.println(value + " degrees in Celsius is equal to " + Fahrenheit + " in Fahrenheit");
               
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Temperature value in Fahrenheit: ");    
    
        int Fahrenheitvalue = input.nextInt();
        
        int fahren_first_calc = (Fahrenheitvalue - constant)*5;
        
        int fahren_second_calc = fahren_first_calc/9;
        
        int fahren_third_calc = fahren_second_calc;
        
        int celsius_val = fahren_third_calc;
        
        System.out.println(Fahrenheitvalue + " degrees in Fahrenheit is equal to " + celsius_val + " in Celsius");
                  
    
    }
    
    
    
}
