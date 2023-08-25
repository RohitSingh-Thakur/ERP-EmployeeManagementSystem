package com.singh.base.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayloads {
	private Long employeeId;
	private String employeeName;
	private String employeeStatus;
	private String employeeDepartment;
	private String employeeEmailId;
	private long employeeSalary;
	private String employeeBloodGroup;
	private String employeeJoiningDate;
	private String employeeHrName;
	private String employeeAadharNumber;
	private String employeePanNumber;
	private String employeeDateOfBirth;
	private String employeeAge;
}
