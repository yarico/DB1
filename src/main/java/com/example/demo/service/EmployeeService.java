package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;
@Repository
public interface EmployeeService {
	public List<Employee> getEmployeeData();

}
