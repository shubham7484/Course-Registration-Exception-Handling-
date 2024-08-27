package com.aug10.SETB.onlinecourseregistrationsystem;

public class RegistrationSystem 
{
	public void register(Student student, Course course, String id)throws AlreadyRegisteredException, CourseFullException
	{
		String id1 = student.getStudentId();
		
			if(id1.equals(student.getStudentId()))
			{
				throw new AlreadyRegisteredException();
			}
			if(course.getCapacity() <= 0)
			{
				throw new CourseFullException();
			}
			else
			{
				System.out.println("Student "+student.getStudentName()+" registered in "+course.getCourseName());
			}
	}			
}