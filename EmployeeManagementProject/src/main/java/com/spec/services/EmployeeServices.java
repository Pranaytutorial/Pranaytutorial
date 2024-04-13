package com.spec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entities.Employee;
import com.spec.repository.EmployeeRepository;

@Service

public class EmployeeServices implements EmployeeServicesInterface{
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
		
	}


	public Employee updateEmployee(int id,EmployeeServices emp) {
		Employee e=repository.findById(id).get();
		e.setEmpName(emp.getEmployeeName());
		
		return repository.save(e);
	}
	private String getEmployeeName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Employee updateEmployee(int id,Employee emp) {
		Employee e=repository.findById(id).get();
		e.setEmpName(emp.getEmpName());
		e.setEmpSalary(emp.getEmpSalary());
		e.setEmail(emp.getEmail());
		e.setAge(emp.getAge());
		e.setDepartment(emp.getDepartment());
		e.setDesignation(emp.getDesignation());
		return repository.save(e);
	}
		
	public void deleteEmployee(int id) {
		Employee e=repository.findById(id).get();
		int id1=e.getEmpid();
		repository.delete(e);
		System.out.println("Employee deleted"+id1);
		
	}
	@Override
	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
