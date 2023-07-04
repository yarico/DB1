package com.example.demo.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DBUtil.DBU;
import com.example.demo.Model.Employee;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	static List<Employee> employee=new ArrayList();
	  
	Connection connection;
	public EmployeeServiceImpl() throws SQLException {
		connection= DBU.getConnection();
	}
	
	@Override
	public List<Employee> getEmployeeData() {
		
		try {
			PreparedStatement star=connection.prepareStatement("SELECT* FROM employee");
			ResultSet rs=star.executeQuery();
			
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmployeename(rs.getString(1));
				emp.setMailid(rs.getString(2));
				emp.setNumber(rs.getInt(3));
				emp.setState(rs.getString(4));
				emp.setJob_role(rs.getString(5));
				employee.add(emp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	

}
