package com.difezoma.backend.service;

import java.util.List;

import com.difezoma.backend.entity.Course;

public interface CourseService {
	
	public abstract Course createCourse(Course course);
	public abstract List<Course> listAllCourses();
	public abstract Course updateCourse(Course course);
	public abstract void deleteCourse(Course course);

}
