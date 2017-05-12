/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_fig_5_1
{
	public static void main(String[] args)
	{
		int counter = 1; // declare and initialize control variable
		
		while(counter <= 10) // loop-continuation condition
		{
			System.out.printf("%d ", counter);
			++counter; // increment control variable
		}
		
		System.out.println();
	}
}