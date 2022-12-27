package com.benow.curdoperation.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benow.curdoperation.entity.Employee;
import com.benow.curdoperation.repository.EmployeeRepository;
import com.benow.curdoperation.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> addAllEmployee(Iterable<Employee> employee) {

		Iterable<Employee> emp2 = employeeRepository.saveAll(employee);

		return emp2;
	}

	@Override
	public Iterable<Employee> getAllEmployee() {
		
		Iterable<Employee> emp3 = employeeRepository.findAll();
		return emp3;
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer Id) {

		Optional<Employee> emp4 = employeeRepository.findById(Id);
		return emp4;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Employee emp5 = employeeRepository.save(employee);
		
		return emp5;
	}
	
	@Override
	public void deleteEmployeeById(Integer id) {

		employeeRepository.deleteById(id);		
	}

}
