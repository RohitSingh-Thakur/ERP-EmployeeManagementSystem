package com.singh.base.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.singh.base.constants.GlobalHTTPRequestConstant;
import com.singh.base.entity.Employee;
import com.singh.base.payloads.EmployeePayloads;
import com.singh.base.service.EmployeeService;

@RestController
public class EMSController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(GlobalHTTPRequestConstant.REGISTER_NEW_EMPLOYEE)
	public ResponseEntity<EmployeePayloads> registerNewEmployee(@Valid @RequestBody Employee employee) {		
		EmployeePayloads saveEmployee = employeeService.registerNewEmployee(employee);
		if(saveEmployee != null) {
		return new ResponseEntity<EmployeePayloads>(saveEmployee, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<EmployeePayloads>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(GlobalHTTPRequestConstant.GET_ALL_EMPLOYEE_DETAILS)
	public ResponseEntity<List<EmployeePayloads>> getAllEmployeeDetails()
	{
		List<EmployeePayloads> allEmployeesDetails = employeeService.getAllEmployeesDetails();
		if(allEmployeesDetails.isEmpty() != true) {
			return new ResponseEntity<List<EmployeePayloads>>(allEmployeesDetails,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping(GlobalHTTPRequestConstant.SEARCH_EMPLOYEE_BY_ID)
	public ResponseEntity<EmployeePayloads> searchEmployeeById(@PathVariable Long employeeId){
		EmployeePayloads employeePayloads = employeeService.searchEmployeeById(employeeId);
		
		if(employeePayloads != null)
		{
			return new ResponseEntity<EmployeePayloads>(employeePayloads, HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
