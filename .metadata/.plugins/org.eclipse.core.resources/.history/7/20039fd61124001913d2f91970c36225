package com.difezoma.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.difezoma.backend.entity.Course;
import com.difezoma.backend.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	@Qualifier("courseService")
	CourseService courseService;
	
	public static final String COURSES_VIEW = "courses";
	
	@PostMapping("/addcourse")
	public RedirectView addCourse(@ModelAttribute Course course) {
		courseService.createCourse(course);
		return new RedirectView("/courses/listallcourses");
	}
	
	@GetMapping("listallcourses")
	public ModelAndView listAllCourses() {
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("courses", courseService.listAllCourses());
		mav.addObject("newcourse", new Course());
		return mav;
	}
	
	@PostMapping("/updatecourse")
	public RedirectView updateCourse(@ModelAttribute Course course) {
		courseService.updateCourse(course);
		return new RedirectView("/courses/listallcourses");
	}
	
	@PostMapping("/deletecourse")
	public RedirectView deleteCourse(@ModelAttribute Course course) {
		courseService.deleteCourse(course);
		return new RedirectView("/courses/listallcourses");
	}
	
	

}
