/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprimenumber;

import java.util.Scanner;

/**
 *
 * @author ARES
 */
public class IsPrimeNumber {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: " );
        input = scan.nextDouble();
        if(isPrime(input) == true && input > 1)
        {
            System.out.println( input + " is Prime. ");
        } else
            {
                System.out.println(input + " is NOT Prime.");
            }
        

        //Test primes 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
    }
    /**
     * 
     *
     * @param prime 
     * @return  
     */
    public static boolean isPrime(double prime)
    {
        boolean checkPrime = true;
          
        
        
            for (int i = 2; i < Math.sqrt(prime); i++) // use square for speed - sqrt(n) is also prime so it saves time 
                {
                    if(prime % i == 0 ) 
                        {
                            checkPrime = false;
                            return checkPrime;
                        }
                }return checkPrime;
        
    }
    
}
