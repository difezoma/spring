package com.difezoma.backend.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.difezoma.backend.constant.ViewConstant;

@Controller
public class LoginController {
	
	private static final Log LOGGER = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam(required=false) String error, @RequestParam(required=false) String logout) {
		LOGGER.info("METHOD: login() PARAMS: error - "+error+" logout - "+logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		LOGGER.info("METHOD: login() return /login");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping({"/loginsuccess", "/"})
	public String loginCheck() {
		LOGGER.info("METHOD: loginCheck()");
		LOGGER.info("METHOD: loginCheck() return /contacts");
		return "redirect:/contacts/showcontacts";
	}
	

}
