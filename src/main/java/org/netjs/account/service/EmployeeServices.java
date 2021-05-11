package org.netjs.account.service;

import java.util.List;

import org.netjs.account.dto.Employee;

public interface EmployeeServices {
	public EmployeeServices getEmployeeByID(int empID);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeeByDept();
	public void deleteEmployee(int empID);

}
