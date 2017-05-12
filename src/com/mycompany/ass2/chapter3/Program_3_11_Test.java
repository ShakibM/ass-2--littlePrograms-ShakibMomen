/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author shakib2013
 *
 */
import java.util.Scanner;
public class Program_3_11_Test 
{
	public static void main(String[] args)
	{
		Program_3_11 mygradebook = new Program_3_11 ("Course Name", "Instructor's Name");
		 
	     Scanner input = new Scanner (System.in);
	             
	            System.out.print ("Enter Your Course Name: ");
	            String name = input.nextLine();
	            mygradebook.setCourseName(name);
	            System.out.print ("Enter Your Course Instructor's Name: ");
	            String insName = input.nextLine();
	            mygradebook.setInstructorsName(insName);
	             
	            System.out.println ();
	             
	            mygradebook.displayMessage();
	}
}
