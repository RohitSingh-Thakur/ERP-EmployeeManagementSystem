package com.singh.base.daoImpl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.singh.base.dao.EmployeeDao;
import com.singh.base.entity.Employee;
import com.singh.base.exceptions.NoRecordFoundException;
import com.singh.base.payloads.EmployeePayloads;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger log = Logger.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private SessionFactory factory;

	@Override
	public Employee registerNewEmployee(Employee employee) {
		try (Session session = factory.openSession()) {
			session.persist(employee);
			session.beginTransaction().commit();
			log.info("Employee Registerd Successfully...");
			return employee;
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getAllEmployeesDetails() {
		List<Employee> empList = null;
		try(Session session = factory.openSession()) {
			empList = session.createCriteria(Employee.class).list();
		}catch (Exception e) {
			log.error(e);
			empList = null;
		}
		
		return empList;
	}

	@Override
	public Employee searchEmployeeById(Long employeeId) {
		Employee employee = null;
		try(Session session = factory.openSession()) {
			employee = session.get(Employee.class, employeeId);
			if(employee != null) {
				return employee;
			}else {
				throw new NoRecordFoundException();
			}			
		} catch (Exception e) {
			log.log(Level.ERROR, e, new NoRecordFoundException());
			return employee;
		}
	}

	@Override
	public Employee updateEmployeeByID(Long employeeId, Map<String, Object> fields) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee searchEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
