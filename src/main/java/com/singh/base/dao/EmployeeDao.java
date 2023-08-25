package com.singh.base.dao;

import java.util.List;
import java.util.Map;

import com.singh.base.entity.Employee;

public interface EmployeeDao {
	public Employee registerNewEmployee(Employee employee);
	
	public List<Employee> getAllEmployeesDetails();
	
	public Employee searchEmployeeById(Long employeeId);

	public Employee updateEmployeeByID(Long employeeId, Map<String, Object> fields);

	public Employee deleteEmployeeById(Long employeeId);

	public Employee searchEmployeeByName(String employeeName);
}
