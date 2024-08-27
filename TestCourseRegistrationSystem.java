package com.aug10.SETB.onlinecourseregistrationsystem;

public class TestCourseRegistrationSystem 
{
	public static void main(String[] args) throws Exception 
	{
			Course c = new Course("J34", "Full Stack Java", 60);
			Student s = new Student("S12", "Shubham Suryavanshi");
			RegistrationSystem rs = new RegistrationSystem();
			rs.register(s, c,"S12");
			
			s.setRegisteredCourse(c);
	}
}