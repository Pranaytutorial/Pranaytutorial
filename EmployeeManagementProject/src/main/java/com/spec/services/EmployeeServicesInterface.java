package com.spec.services;

import java.util.List;

import com.spec.entities.Employee;

public interface EmployeeServicesInterface {
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(int id);
	public void deleteEmployee(int id);
	

}
