package com.singh.base.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import com.singh.base.constants.GlobalEmployeeFieldsConstants;
import com.singh.base.constants.GlobalRegex;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long employeeId;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeNameIsEmpty)
	@Length(min = 2, max = 20, message = GlobalEmployeeFieldsConstants.employeeNameLenght)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalEmployeeFieldsConstants.employeeNameLenght)
	@Column(nullable = false)
	private String employeeName;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeStatusIsEmpty)
	@Length(min = 6, max = 8, message = GlobalEmployeeFieldsConstants.employeeStatusLength)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalEmployeeFieldsConstants.employeeStatusContainsDigitOrSymbol)
	@Column(nullable = false)
	private String employeeStatus;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeDepartmentIsEmpty)
	@Length(min = 2, max = 20, message = GlobalEmployeeFieldsConstants.employeeDepartmentLenght)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalEmployeeFieldsConstants.employeeDepartmentLenght)
	@Column(nullable = false)
	private String employeeDepartment;

	@Email(message = GlobalEmployeeFieldsConstants.employeeEmailIdLenght, regexp = GlobalRegex.emailRegex)
	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeEmailIdIsEmpty)
	@Column(nullable = false)
	private String employeeEmailId;

	@NotNull(message = GlobalEmployeeFieldsConstants.employeeSalaryIsEmpty)
	@Min(value = 1000, message = GlobalEmployeeFieldsConstants.employeeSalaryLenght)
	@Column(nullable = false)
	private long employeeSalary;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeBloodGroupIsEmpty)
	@Pattern(regexp = GlobalRegex.BloodGroup, message = GlobalEmployeeFieldsConstants.employeeBloodGroupInvalid)
	@Column(nullable = false)
	private String employeeBloodGroup;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeJoiningDateIsEmpty)
	@Column(nullable = false)
	@Pattern(regexp = GlobalRegex.dateFormat, message = GlobalEmployeeFieldsConstants.employeeJoiningDateInvalid)
	private String employeeJoiningDate;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeHrNameIsEmpty)
	@Pattern(regexp = GlobalRegex.stringNotContainsDigit, message = GlobalEmployeeFieldsConstants.employeeHrNameInvalid)
	@Length(min = 2, max = 20, message = GlobalEmployeeFieldsConstants.employeeHrNameInvalid)
	@Column(nullable = false)
	private String employeeHrName;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeAadharNumberIsEmpty)
	@Pattern(regexp = GlobalRegex.aadharCheck, message = GlobalEmployeeFieldsConstants.employeeAadharNumberCheck)
	@Column(nullable = false)
	private String employeeAadharNumber;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeePanNumberIsEmpty)
	@Pattern(regexp = GlobalRegex.panNumberCheck, message = GlobalEmployeeFieldsConstants.employeePanNumberInvalid)
	@Column(nullable = false)
	private String employeePanNumber;

	@NotBlank(message = GlobalEmployeeFieldsConstants.employeeDateOfBirthIsEmpty)
	@Pattern(regexp = GlobalRegex.dateOfBirthFormat, message = GlobalEmployeeFieldsConstants.employeeDateOfBirthInvalid)
	@Column(nullable = false)
	private String employeeDateOfBirth;

	//@NotBlank(message = GlobalEmployeeFieldsConstants.employeeAgeIsEmpty)
	//@Min(value = 18,message = GlobalEmployeeFieldsConstants.employeeAgeLessThan18)
	//@Max(value = 80,message = GlobalEmployeeFieldsConstants.employeeAgeGreaterThan80)
	//@Pattern(regexp = GlobalRegex.ageCheck, message = GlobalEmployeeFieldsConstants.employeeAgeInvalid)
	@Column(nullable = false)
	private String employeeAge;
}
