package com.difezoma.backend.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.difezoma.backend.converter.CourseConverter;
import com.difezoma.backend.entity.Course;
import com.difezoma.backend.repository.CourseJpaRepository;
import com.difezoma.backend.service.CourseService;

@Service("courseService")
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	@Autowired
	@Qualifier("courseConverter")
	private CourseConverter courseConverter;

	@Override
	public Course createCourse(Course course) {
		return courseJpaRepository.save(course);
	}

	@Override
	public List<Course> listAllCourses() {
		return courseJpaRepository.findAll();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseJpaRepository.save(course);
	}

	@Override
	public void deleteCourse(Course course) {
		courseJpaRepository.delete(course);
	}

}
