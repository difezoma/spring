package com.difezoma.backend.converter;

import org.springframework.stereotype.Component;

import com.difezoma.backend.entity.Course;
import com.difezoma.backend.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	
	//Model to Entity
	public Course model2Entity(CourseModel courseModel) {
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		return course;
	}
	
	//Entity to Model
	public CourseModel entity2model(Course course) {
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		return courseModel;
	}

}
