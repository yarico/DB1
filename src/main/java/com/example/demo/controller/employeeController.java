package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class employeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.empService.getEmployeeData();
	}
	
	

}
