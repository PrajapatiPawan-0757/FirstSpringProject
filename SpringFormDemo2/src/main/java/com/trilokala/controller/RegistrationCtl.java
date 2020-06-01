package com.trilokala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationCtl {

	@RequestMapping(value="registration", method=RequestMethod.GET)
	public String getRegistration(){
		System.out.println("*************************");
		return "registration";
	}
	
	
}
