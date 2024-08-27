package com.aug10.SETB.onlinecourseregistrationsystem;

public class Student 
{
	private String studentId;
	private String studentName;
	private Course registeredCourse;
	
	public Student(String studentId, String studentName) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getStudentId() 
	{
		return studentId;
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public Course getRegisteredCourse() 
	{
		return registeredCourse;
	}

	public void setRegisteredCourse(Course registeredCourse) 
	{
		this.registeredCourse = registeredCourse;
	}
}