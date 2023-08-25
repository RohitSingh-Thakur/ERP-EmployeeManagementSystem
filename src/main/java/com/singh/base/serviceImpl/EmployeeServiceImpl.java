package com.singh.base.serviceImpl;

import static com.singh.base.utility.AgeCalculator.getAge;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singh.base.dao.EmployeeDao;
import com.singh.base.entity.Employee;
import com.singh.base.exceptions.NoRecordFoundException;
import com.singh.base.payloads.EmployeePayloads;
import com.singh.base.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger log = Logger.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public EmployeePayloads registerNewEmployee(Employee employee) {
		employee.setEmployeeAge(getAge(employee.getEmployeeDateOfBirth()));
		Employee saveEmployee = employeeDao.registerNewEmployee(employee);
		EmployeePayloads registeredEmployee = this.mapper.map(saveEmployee, EmployeePayloads.class);
		
		if(registeredEmployee != null) {
			return registeredEmployee;
		}else {
			return null;
		}
		
	}

	@Override
	public List<EmployeePayloads> getAllEmployeesDetails() {
		List<Employee> allEmployeesDetails = employeeDao.getAllEmployeesDetails();
		List<EmployeePayloads> emplist = allEmployeesDetails.stream().map(e -> this.mapper.map(e, EmployeePayloads.class)).toList();
		if(emplist.isEmpty() != true) {
			return emplist;
		}else {
			throw new NoRecordFoundException();
		}
		
	}

	@Override
	public EmployeePayloads searchEmployeeById(Long employeeId) {
		Employee employee = employeeDao.searchEmployeeById(employeeId);
		if(employee != null) {
		EmployeePayloads employeePayloads = this.mapper.map(employee, EmployeePayloads.class);
		return employeePayloads;
		}else {
			return null;
		}
	}

	@Override
	public EmployeePayloads updateEmployeeByID(Long employeeId, Map<String, Object> fields) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePayloads deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePayloads searchEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
