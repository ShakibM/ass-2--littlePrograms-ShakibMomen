/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_4_20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );

		double hours; // number of hours worked input
		double pay; // rate of hourly wage input
		double overtime;
		
		System.out.print( "Enter the number of regular hours worked Jon Smith Worked "); 
		hours = input.nextDouble();

		System.out.print( "Enter the number of overtime hours Jon Smith worked " );
		overtime = input.nextDouble();

		System.out.print( "Enter the payrate of John Smith " );
		pay = input.nextDouble();

		if (overtime == 0 )
		{
			System.out.printf( "Gross pay for this John Smith is %.2f\n", hours * pay );
		}
		else
		{
			System.out.printf( "Gross pay for this John Smith is %.2f\n", (hours * pay) +
			(overtime * (pay * 1.5)) );
		}

		// Second input is for employee #2
		System.out.print( "Enter the number of regular hours worked Betty Jones Worked "
		); // prompt for user input
		hours = input.nextDouble();

		System.out.print( "Enter the number of overtime hours Betty Jones worked " );
		overtime = input.nextDouble();

		System.out.print( "Enter the payrate of Betty Jones " );
		pay = input.nextDouble();

		if (overtime == 0 )
		{
			System.out.printf( "Gross pay for this Betty Jones is %.2f\n", hours * pay );
		}
		else
		{
		System.out.printf( "Gross pay for this Betty Jones is %.2f\n", (hours * pay) +
		(overtime * (pay * 1.5)) );
		}

		// Third input is for employee #3
		System.out.print( "Enter the number of regular hours worked LeMont Jordan Worked" ); // prompt for user input
		hours = input.nextDouble();

		System.out.print( "Enter the number of overtime hours LeMont Jordan worked " );
		// prompt for user input
		overtime = input.nextDouble();

		System.out.print( "Enter the payrate of LeMont Jordan " );
		pay = input.nextDouble();

		if (overtime == 0 )
		{
			System.out.printf( "Gross pay for this LeMont Jordan is %.2f\n", hours * pay );
		}
		else
		{
		System.out.printf( "Gross pay for this Betty Jones is %.2f\n", (hours * pay) +
		(overtime * (pay * 1.5)) );
		}
	}
}
