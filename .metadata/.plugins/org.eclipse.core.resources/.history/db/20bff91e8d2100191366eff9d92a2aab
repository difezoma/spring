package com.difezoma.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exampletwo")
public class ExampleControllerTwo {
	
	public static final String EXAMPLE_TWO = "example2";
	
	@GetMapping("/example2")
	public ModelAndView getname(@RequestParam(required=false, defaultValue="sin name") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_TWO);
		mav.addObject("name", name);
		return mav;
	}
	
	@GetMapping("/example3/{name}")
	public ModelAndView getName2(@PathVariable(required=false) String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_TWO);
		mav.addObject("name", name);
		return mav;
	}

}
