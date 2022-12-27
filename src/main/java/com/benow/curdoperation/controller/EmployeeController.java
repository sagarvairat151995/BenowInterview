package com.benow.curdoperation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benow.curdoperation.entity.Employee;
import com.benow.curdoperation.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	/*
	 * 
	 * Add employee
	 */
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		Employee emp1 = employeeService.addEmployee(employee);
		return ResponseEntity.ok().body(emp1);
	}

	/*
	 * 
	 * Add multiple employee
	 */
	@PostMapping("/addAll")
	public ResponseEntity<Iterable<Employee>> addAllEmployee(@RequestBody Iterable<Employee> employee) {

		Iterable<Employee> emp2 = employeeService.addAllEmployee(employee);
		return ResponseEntity.ok().body(emp2);
	}

	/*
	 * 
	 * Get employee by Id
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Employee>> getAllEmployee(@PathVariable("id") Integer id) {

		Optional<Employee> emp3 = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(emp3);
	}

	/*
	 * 
	 * Get all employee
	 */
	@GetMapping("/getAll")
	public ResponseEntity<Iterable<Employee>> getAllEmployee() {

		Iterable<Employee> emp4 = employeeService.getAllEmployee();
		return ResponseEntity.ok().body(emp4);
	}

	/*
	 * 
	 * update employee
	 */
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

		Employee emp4 = employeeService.updateEmployee(employee);
		return ResponseEntity.ok().body(emp4);
	}

	/*
	 * 
	 * delete employee by id
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> removeEmployee(@PathVariable("id") Integer id) {

		employeeService.deleteEmployeeById(id);
		return ResponseEntity.ok().body(null);
	}
}
