/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_4_24 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10)
		{
			int result1 = 0;
			
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			if(result < 1 || result > 2)
			{
				System.out.print("ERROR: Enter only 1 or 2 (1 = pass, 2 = fail): ");
				result = input.nextInt();
			}
			
			if (result == 1)
			{
				passes = passes + 1;
			}
			else
			{
				failures = failures + 1;
			}
			
			studentCounter = studentCounter + 1;
		}
		
		System.out.printf("Passed: " + passes + "\nFailed: " + failures);
		
		if (passes > 8)
			System.out.println("Bonus to instrctor!");
	}
}
