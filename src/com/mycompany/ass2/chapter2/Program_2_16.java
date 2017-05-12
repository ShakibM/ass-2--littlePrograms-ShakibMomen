/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_2_16 
{
	public static void main(String[] args)
	{
		Scanner value = new Scanner (System.in);
        
        int num1; 
        int num2; 
         
        System.out.println ("Enter your first number");
        num1 = value.nextInt ();
        System.out.println ("Enter your second number");
        num2 = value.nextInt ();
         
        System.out.println ();
         
        if (num1>num2) 
        {
            System.out.println (num1 + " is larger\n");
        }
        if (num2>num1)
        {
            System.out.println (num2 + " is larger.\n");
        }
        if (num1 == num2)
        {
            System.out.println ("Your numbers are equal.\n");
        }
	}
}
