package com.singh.base.service;

import java.util.List;
import java.util.Map;

import com.singh.base.entity.Employee;
import com.singh.base.payloads.EmployeePayloads;

public interface EmployeeService {
	
	public EmployeePayloads registerNewEmployee(Employee employee);
	
	public List<EmployeePayloads> getAllEmployeesDetails();
	
	public EmployeePayloads searchEmployeeById(Long employeeId);

	public EmployeePayloads updateEmployeeByID(Long employeeId, Map<String, Object> fields);

	public EmployeePayloads deleteEmployeeById(Long employeeId);

	public EmployeePayloads searchEmployeeByName(String employeeName);

}
