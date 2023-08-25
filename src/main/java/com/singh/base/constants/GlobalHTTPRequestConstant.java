package com.singh.base.constants;

public class GlobalHTTPRequestConstant {
	
	public static final String LOCAL_HOST = "http://localhost:2010";
	
	
	public static final String REGISTER_NEW_EMPLOYEE = "/RegisterNewEmployee";
	public static final String GET_ALL_EMPLOYEE_DETAILS = "/getAllEmployeeDetails";
	
	public static final String SEARCH_EMPLOYEE_BY_ID = "/searchEmployeeById/{employeeId}";
	public static final String UPDATE_EMPLOYEE_BY_ID = "/updateEmployeeByID/{employeeId}";
	
	public static final String DELETE_EMPLOYEE_BY_ID = "/deleteEmployeeById/{employeeId}";
	public static final String SEARCH_EMPLOYEE_BY_NAME = "/searchEmployeeByName/{employeeName}";
	
}
