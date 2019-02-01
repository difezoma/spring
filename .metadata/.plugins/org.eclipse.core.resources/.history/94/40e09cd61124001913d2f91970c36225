package com.difezoma.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.difezoma.backend.repository.CourseJpaRepository;
import com.difezoma.backend.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	@Autowired
	@Qualifier("exampleService")
	ExampleService exampleService;
	
	@Autowired
	@Qualifier("courseJpaRepository")
	CourseJpaRepository courseJpaRepository;
	
	public static final String EXAMPLE_VIEW = "example";
	
	@GetMapping("/exampleString")
	public String example(Model model) {
		model.addAttribute("people", exampleService.getPeople());
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", exampleService.getPeople());
		return mav;
	}

}
