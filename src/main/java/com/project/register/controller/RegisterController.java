package com.project.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.register.model.RegisterClass;
import com.project.register.repository.RegisterRepo;

@Controller
public class RegisterController 
{
	@Autowired
	private RegisterRepo rr;
	@RequestMapping("/")
	public String isRe()
	{
		return "register.jsp";
	}
	@RequestMapping("/register")
	public String isRegister(@ModelAttribute RegisterClass rc)
	{
		System.out.println(rc);
		rr.save(rc);
		return "success.jsp";
	}
}
