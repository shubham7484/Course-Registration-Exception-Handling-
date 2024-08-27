package com.aug10.SETB.onlinecourseregistrationsystem;

@SuppressWarnings("serial")
public class AlreadyRegisteredException extends Exception
{
	public AlreadyRegisteredException()
	{
	}
	
	public AlreadyRegisteredException(String errorMessage)
	{
		super(errorMessage);
	}
}
