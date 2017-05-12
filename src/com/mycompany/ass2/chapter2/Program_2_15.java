/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_2_15 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int num1, num2, sum, difference, product, quotient;
		
		System.out.println("Enter your first number: ");
		num1 = input.nextInt();
		System.out.println("Enter your second number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		difference = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;
		
		System.out.printf("For you two numbers \nThe sum is: " + sum + "\nThe difference is: " + difference + "\nThe Product is: " + product + "\nThe quotient is: " + quotient);
	}
}
