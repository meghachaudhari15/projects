package com.jspiders.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.employeemanagementsystem.pojo.EmployeePOJO;
import com.jspiders.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addStudent(String name, String email, long mobile, double salary) {
		EmployeePOJO employeePOJO=new EmployeePOJO();
		employeePOJO.setName(name);
		employeePOJO.setEmail(email);
		employeePOJO.setMobile(mobile);
		employeePOJO.setSalary(salary);
		employeeRepository.addEmployee(employeePOJO);
		
	}

}
