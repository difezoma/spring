package com.difezoma.backend.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.difezoma.backend.component.ExampleComponent;
import com.difezoma.backend.model.Person;

@Controller
@RequestMapping("/form")
public class FormController {
	
	private static final Log LOGGER = LogFactory.getLog(FormController.class);
	
	public static final String SHOW_FORM = "showform";
	public static final String RESULT = "result";
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
//	@GetMapping("/")
//	public String redirect() {
//		return "redirect:/form/showform";
//	}
	
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/form/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		
		exampleComponent.sayHello();
		
		model.addAttribute("person", new Person());
		return SHOW_FORM;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@Valid @ModelAttribute Person person, BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.setViewName(SHOW_FORM);
		}else {
			mav.setViewName(RESULT);
			mav.addObject("person", person);
		}

		return mav;
	}

}
