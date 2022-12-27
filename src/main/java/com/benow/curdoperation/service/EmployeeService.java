package com.benow.curdoperation.service;

import java.util.List;
import java.util.Optional;

import com.benow.curdoperation.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public Iterable<Employee> addAllEmployee(Iterable<Employee> employee);
	
	public Optional<Employee> getEmployeeById(Integer Id);
	
	public Iterable<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee employee);
		
	public void deleteEmployeeById(Integer id);	

}
