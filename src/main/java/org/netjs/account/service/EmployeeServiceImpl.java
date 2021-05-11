package org.netjs.account.service;

import java.util.List;

import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dto.Employee;

public class EmployeeServiceImpl implements EmployeeServices {
	
	EmployeeDao employeeDao;
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		// TODO Auto-generated constructor stub
		this.employeeDao = employeeDao;
	}

	void EmployeeServiceIMPl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao; 
	}
	
	
	@Override
	public EmployeeServices getEmployeeByID(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee>empList = employeeDao.getEmployees();
		return empList;
	}

	@Override
	public List<Employee> getEmployeeByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empID) {
		// TODO Auto-generated method stub
		
	}
	

}
