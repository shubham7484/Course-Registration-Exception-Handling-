package com.aug10.SETB.onlinecourseregistrationsystem;

public class Course 
{
	private String courseId;
	private String courseName;
	private int capacity;
	private int enrolledStudents;
	
	public Course(String courseId, String courseName, int capacity) 
	{
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.capacity = capacity;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(int enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
}