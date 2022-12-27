package com.benow.curdoperation.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benow.curdoperation.entity.*;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Optional<Employee> findById(Integer id);

	public Iterable<Employee> findAll();

	public void deleteById(Integer id);

}
