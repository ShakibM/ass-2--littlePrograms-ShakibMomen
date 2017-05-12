/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author shakib2013
 *
 */
public class Program_3_11 
{
	private String courseName; 
    private String instructorName; 
    
    public Program_3_11 (String name, String insName) 
    {
        courseName = name;
        instructorName = insName;
    }
    
    public void setCourseName (String name) {
        courseName = name;
    }
    
    public String getCourseName () {
        return courseName;
    }
    
    public void setInstructorsName (String insName) {
        instructorName = insName;
    }
    
    public String getInstructorName () {
        return instructorName;
    }
    
    public void displayMessage () {
        System.out.printf ("Welcome to the gradebook for: %s!\nThis course is "
                  + "presented by: %s\n", getCourseName (), getInstructorName ());
    }
}
