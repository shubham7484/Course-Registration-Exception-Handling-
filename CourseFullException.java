package com.aug10.SETB.onlinecourseregistrationsystem;

@SuppressWarnings("serial")
public class CourseFullException extends Exception 
{
	public CourseFullException()
	{
	}
	
	public CourseFullException(String errorMessage)
	{
		super(errorMessage);
	}
	

}
