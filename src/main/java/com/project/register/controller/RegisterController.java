package com.project.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		return "/fetch";
	}
	@RequestMapping("/fetch")
	public ModelAndView isRfetch()
	{
		ModelAndView m = new ModelAndView("Fetch.jsp");
		List<RegisterClass> li = rr.findAll();
		m.addObject("data", li);
		System.out.println(li);
		return m;
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String isUpShow(@RequestParam int id, @ModelAttribute RegisterClass rc, Model m) {
	    RegisterClass existing = rr.findById(id).orElse(null);
	    if (existing != null) {
	        // Update existing fields with form values
	        existing.setName(rc.getName());
	        existing.setEmail(rc.getEmail());
	        existing.setPhone(rc.getPhone());
	        existing.setPassword(rc.getPassword());
	        
	        // Save updated record
	        rr.save(existing);
	        m.addAttribute("m", "Data updated successfully...!");
	    } else {
	        m.addAttribute("m", "Data not found!");
	    }
	    return "/fetch";
	}

	@RequestMapping(value = "/deleteProperty/{id}", method = RequestMethod.POST)
	public String deleteUser(@PathVariable("id") int id,Model m) {
		rr.deleteById(id);
		m.addAttribute("m", "Data Deleted successfully...!");
		return "redirect:/fetch";
	}
	@RequestMapping("data/{id}")
	public String FindUser(@PathVariable int id,Model m) {
		RegisterClass li = rr.findById(id).orElse(null);
		m.addAttribute("Sendata", li);
		System.out.println(li);
		return "/success.jsp";
	}
}
