package com.jspiders.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.employeemanagementsystem.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path = "/add_employee", method = RequestMethod.POST)
	public String addEmployee(@RequestParam String name,@RequestParam String email,@RequestParam long mobile, 
			@RequestParam double salary,ModelMap modelMap) {
		    employeeService.addStudent(name,email,mobile,salary);
		    modelMap.addAttribute("message","student added");
			return "add_employee";
	}

}
