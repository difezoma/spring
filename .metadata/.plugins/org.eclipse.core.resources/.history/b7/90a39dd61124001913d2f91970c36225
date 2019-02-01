package com.difezoma.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.difezoma.backend.service.ExerciseService;

@Controller
@RequestMapping("/exercise")
public class ExerciseController {
	
	public static final String EXERCISE_VIEW = "exercise";
	
	@Autowired
	@Qualifier("exerciseService")
	ExerciseService exerciseService;
	
	@GetMapping("/one")
	public RedirectView exercise() {
		return new RedirectView("/exercise/two");
	}
	
	@GetMapping("/two")
	public ModelAndView exerciseAux() {
		ModelAndView mav = new ModelAndView(EXERCISE_VIEW);
		mav.addObject("mensaje", "hola mundo");
		exerciseService.sayHello();
		return mav;
	}


}
